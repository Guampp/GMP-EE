package br.com.gmp.desktop.app.system;

import br.com.gmp.desktop.app.VisualApp;
import br.com.gmp.desktop.app.action.CleanAction;
import br.com.gmp.desktop.app.action.ConfirmAction;
import br.com.gmp.desktop.app.action.DiscardAction;
import br.com.gmp.desktop.app.action.HelpAction;
import br.com.gmp.desktop.app.action.ProcessAction;
import br.com.gmp.desktop.app.action.ReloadAction;
import br.com.gmp.desktop.app.login.LoginPane;
import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Classe que gerencia as propriedades padrão do sistema
 *
 * @author kaciano
 * @since 1.0
 */
public class SystemControls {

    private VisualApp visualApp;
    private final String helpAct = "help";
    private final String confirmAct = "confirm";
    private final String discardAct = "discard";
    private final String reloadAct = "reload";
    private final String processAct = "process";
    private final String cleanAct = "clean";
    private Action helpAction;
    private Action confirmAction;
    private Action discardAction;
    private Action reloadAction;
    private Action processAction;
    private Action cleanAction;

    /**
     * Inicia toda a aplicação
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new GraphiteLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(VisualApp.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                VisualApp visualApp = new VisualApp();
                SystemControls system = new SystemControls(visualApp);
                visualApp.setExtendedState(JFrame.MAXIMIZED_BOTH);
                visualApp.setVisible(true);
                LoginPane loginPane = new LoginPane(visualApp);   
            }
        });
    }

    /**
     * Cria nova instancia de SystemProperties
     *
     * @param visualApp <code><b>VisualApp</b></code> Aplicação visual
     */
    public SystemControls(VisualApp visualApp) {
        this.visualApp = visualApp;
        constructActions();
        try {
            generateTrayIcon();
        } catch (AWTException ex) {
            Logger.getLogger(SystemControls.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Gera o icone da barra de ferramentas
     *
     * @see java.awt.SystemTray
     * @see java.awt.TrayIcon
     * @throws AWTException
     */
    private void generateTrayIcon() throws AWTException {
        SystemTray sysTray = SystemTray.getSystemTray();
        URL url = getClass().getResource("/logo/guampp24.png");
        Image icon = new ImageIcon(url).getImage();
        TrayIcon tray = new TrayIcon(icon);
        PopupMenu pop = new PopupMenu();
        MenuItem item = new MenuItem("Fechar");

        // Adiciona os comandos no MenuItem
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Fechando o sistema");
                System.exit(0);
            }
        });

        // Adiciona os itens no PopUp
        pop.add(item);
        pop.add(new MenuItem());

        // Adiciona o PopUp no Tray
        tray.setPopupMenu(pop);
        tray.setToolTip("Guampp");
        tray.setImageAutoSize(true);

        // Adiciona o Tray no SystemTray
        sysTray.add(tray);
    }

    /**
     * Constroi as ações da tela
     *
     * @see br.com.gmp.desktop.app.VisualApp#addKeyEvents()
     */
    private void constructActions() {
        this.helpAction = new HelpAction(helpAct, visualApp);
        //----------------------------------------------------------------------
        this.confirmAction = new ConfirmAction(confirmAct, visualApp);
        //----------------------------------------------------------------------
        this.discardAction = new DiscardAction(discardAct, visualApp);
        //----------------------------------------------------------------------
        this.reloadAction = new ReloadAction(reloadAct, visualApp);
        //----------------------------------------------------------------------
        this.processAction = new ProcessAction(processAct, visualApp);
        //----------------------------------------------------------------------
        this.cleanAction = new CleanAction(cleanAct, visualApp);
        //----------------------------------------------------------------------
        addKeyEvents();
    }

    /**
     * Adiciona os KeyEvents
     *
     * @see br.com.gmp.desktop.app.VisualApp#addKeyInput(String, int, Action)
     */
    private void addKeyEvents() {
        addKeyInput(helpAct, KeyEvent.VK_F1, helpAction);
        //----------------------------------------------------------------------
        addKeyInput(confirmAct, KeyEvent.VK_F2, confirmAction);
        //----------------------------------------------------------------------
        addKeyInput(discardAct, KeyEvent.VK_F4, discardAction);
        //----------------------------------------------------------------------
        addKeyInput(reloadAct, KeyEvent.VK_F5, reloadAction);
        //----------------------------------------------------------------------
        addKeyInput(processAct, KeyEvent.VK_F6, processAction);
        //----------------------------------------------------------------------
        addKeyInput(cleanAct, KeyEvent.VK_F8, cleanAction);
    }

    /**
     * Adiciona as ações especificas de cada tecla
     *
     * @param name <b><code>String</code></b> Nome da ação
     * @param keycode <b><code>KeyEvent</code></b> Código da tecla
     * @param action <b><code>Action</code></b> Ação da tecla
     */
    private void addKeyInput(String name, int keycode, Action action) {
        this.visualApp.getRootPane().getActionMap().put(name, action);
        this.visualApp.getRootPane().getInputMap()
                .put(KeyStroke.getKeyStroke(keycode, 0), name);
    }

    /**
     * Imprime as propriedades do sistema
     */
    public void printProperties() {
        System.out.println("Não implementado.");
    }

    //<editor-fold desc="Get's & Set's" defaultstate="collapsed">
    /**
     * Retorna o VisualApp
     *
     * @return <code><b>VisualApp</b></code> Aplicação visual
     */
    public VisualApp getApp() {
        return visualApp;
    }

    /**
     *
     * @param visualApp <code><b>VisualApp</b></code> Aplicação visual
     */
    public void setApp(VisualApp visualApp) {
        this.visualApp = visualApp;
    }
    //</editor-fold>
}
