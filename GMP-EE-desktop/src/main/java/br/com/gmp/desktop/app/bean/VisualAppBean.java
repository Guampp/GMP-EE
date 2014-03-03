package br.com.gmp.desktop.app.bean;

import br.com.gmp.desktop.app.interfaces.AppListener;
import br.com.gmp.desktop.app.VisualApp;
import br.com.gmp.comps.tabbedpane.GMPJTabbedPane;
import br.com.gmp.desktop.views.ViewFrame;
import br.com.gmp.desktop.views.interfaces.View;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 * AppListener do VisualApp
 *
 * @author kaciano
 */
public class VisualAppBean implements AppListener<VisualApp> {

    public static final String IS_ON_DESKTOP = "A view já está no desktop!";
    private VisualApp visualApp;
    private ViewFrame activeView;

    /**
     * Constroi novo VisualAppAppListener
     *
     * @param visualApp
     */
    public VisualAppBean(VisualApp visualApp) {
        this.visualApp = visualApp;
    }

    /**
     * Ativa o evento de ajuda do sistema
     */
    @Override
    public void help() {
        System.out.println("Open help window.");
    }

    /**
     * Ativa o evento de confirmação
     */
    @Override
    public void confirm() {
        System.out.println("Confirmation send to the view.");
        if (!checkNull()) {
            activeView.confirm();
        }
    }

    /**
     * Ativa o evento de descarte
     */
    @Override
    public void discard() {
        System.out.println("Discard sent to the view.");
        if (!checkNull()) {
            activeView.discard();
        }
    }

    /**
     * Ativa o evento de processamento
     */
    @Override
    public void process() {
        System.out.println("Process sent to the view.");
        if (!checkNull()) {
            activeView.process();
        }
    }

    /**
     * Ativa o evento de limpeza
     */
    @Override
    public void clean() {
        System.out.println("Cleaning sent to the view.");
        if (!checkNull()) {
            activeView.clean();
        }
    }

    /**
     * Carrega os dados
     */
    @Override
    public void load() {
        System.out.println("Loading...");
    }

    /**
     * Recarrega os dados
     */
    @Override
    public void reload() {
        System.out.println("Reloading...");
    }

    /**
     * Verifica existencia de activeView
     *
     * @return activeView <code><b>boolean</b></code> Existe uma View ativa?
     * <code>(true, false)</code>
     */
    @Override
    public boolean checkNull() {
        return activeView == null;
    }

    /**
     * Adiciona novo desktop
     */
    @Override
    public void addDesktop() {
        ImageIcon icon = new ImageIcon(getClass()
                .getResource("/IKONS/16/imac.png"));
        JDesktopPane desktop = new JDesktopPane();        
        GMPJTabbedPane tabs = visualApp.getgTPDesktops();
        tabs.addClosableTab("", icon, desktop,
                "Área de trabalho");
        tabs.setSelectedComponent(desktop);
    }

    /**
     * Remove todos os desktops
     */
    @Override
    public void removeAllDesktops() {
        visualApp.getgTPDesktops().removeAll();
    }

    /**
     * Adiciona View aos favoritos
     */
    @Override
    public void favoriteView() {

    }

    /**
     * Retorna desktop ativo
     *
     * @return Desktop ativo
     */
    @Override
    public JDesktopPane getActiveDesktop() {
        JDesktopPane selected = (JDesktopPane) visualApp.getgTPDesktops()
                .getSelectedComponent();
        if (selected != null) {
            return (JDesktopPane) visualApp.getgTPDesktops()
                    .getSelectedComponent();
        } else {
            addDesktop();
            return (JDesktopPane) visualApp.getgTPDesktops()
                    .getSelectedComponent();
        }
    }

    /**
     * Insere View no desktop ativo
     *
     * @param view <code><b>View</b></code> View a ser adicionada
     */
    @Override
    public void insertView(ViewFrame view) {
//        if (!isOnDesktop(view)) {
            getActiveDesktop().add(view);
//        } else {
//            System.out.println(IS_ON_DESKTOP);
//        }
    }

    /**
     * Verifica se o desktop ativo já possui a View em questão
     *
     * @param view <code><b>View</b></code> View a ser adicionada
     * @return <code><b>boolean</b></code> Está no desktop ativo?
     * <code>(true, false)</code>
     */
    private boolean isOnDesktop(ViewFrame view) {
        for (Component c : getActiveDesktop().getComponents()) {
            if (c instanceof ViewFrame) {
                ViewFrame v = (ViewFrame) c;
                if (v == view) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Procura View a partir do nome
     *
     * @param name <code><b>String</b></code> Nome da View
     */
    @Override
    public void searchView(String name) {

    }

    /**
     * Retorna o aplicativo visual do bean
     *
     * @return Aplicativo visual do bean
     */
    public VisualApp getVisualApp() {
        return visualApp;
    }

    /**
     * Modifica o aplicativo visual do bean
     *
     * @param visualApp <code><b>VisualApp</b></code> Aplicativo visual do bean
     */
    @Override
    public void setVisualApp(VisualApp visualApp) {
        this.visualApp = visualApp;
    }

    /**
     * Retorna a View Ativa do desktop
     *
     * @return <code><b>View</b></code> View Ativa do desktop
     */
    @Override
    public View getActiveView() {
        return activeView;
    }

    /**
     * Modifica a View Ativa do desktop
     *
     * @param activeView <code><b>View</b></code> View Ativa do desktop
     */
    @Override
    public void setActiveView(ViewFrame activeView) {
        this.activeView = activeView;
    }

}
