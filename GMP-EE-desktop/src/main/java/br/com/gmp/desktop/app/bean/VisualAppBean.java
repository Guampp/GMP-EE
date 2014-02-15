package br.com.gmp.desktop.app.bean;

import br.com.gmp.desktop.app.VisualApp;
import br.com.gmp.comps.tabbedpane.GMPJTabbedPane;
import br.com.gmp.desktop.views.interfaces.View;
import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 * Bean do VisualApp
 *
 * @author kaciano
 */
public class VisualAppBean {

    public static final String IS_ON_DESKTOP = "A view já está no desktop!";
    private VisualApp visualApp;
    private View activeView;

    /**
     * Constroi novo VisualAppBean
     *
     * @param visualApp
     */
    public VisualAppBean(VisualApp visualApp) {
        this.visualApp = visualApp;
    }

    /**
     * Ativa o evento de confirmação
     */
    public void confirm() {
        if (!checkNull()) {
            activeView.confirm();
        }
    }

    /**
     * Ativa o evento de descarte
     */
    public void discard() {
        if (!checkNull()) {
            activeView.discard();
        }
    }

    /**
     * Ativa o evento de processamento
     */
    public void process() {
        if (!checkNull()) {
            activeView.process();
        }
    }

    /**
     * Ativa o evento de limpeza
     */
    public void clean() {
        if (!checkNull()) {
            activeView.clean();
        }
    }

    /**
     * Carrega os dados
     */
    public void load() {

    }

    /**
     * Recarrega os dados
     */
    public void reload() {

    }

    /**
     * Verifica existencia de activeView
     *
     * @return activeView <code><b>boolean</b></code> Existe uma View ativa?
     * <code>(true, false)</code>
     */
    public boolean checkNull() {
        return activeView == null;
    }

    /**
     * Adiciona novo desktop
     */
    public void addDesktop() {
        ImageIcon icon = new ImageIcon(getClass()
                .getResource("/IKONS/16/imac.png"));
        JDesktopPane desktop = new JDesktopPane();
        desktop.setBackground(new Color(51, 153, 255));
        GMPJTabbedPane tabs = visualApp.getgTPDesktops();
        tabs.addClosableTab("", icon, desktop,
                "Área de trabalho");
        tabs.setSelectedComponent(desktop);
    }

    /**
     * Remove todos os desktops
     */
    public void removeAllDesktops() {
        visualApp.getgTPDesktops().removeAll();
    }

    /**
     * Adiciona View aos favoritos
     */
    public void favoriteView() {

    }

    /**
     * Retorna desktop ativo
     *
     * @return Desktop ativo
     */
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
    public void insertView(View view) {
        if (!isOnDesktop(view)) {

        } else {
            System.out.println(IS_ON_DESKTOP);
        }
    }

    /**
     * Verifica se o desktop ativo já possui a View em questão
     *
     * @param view <code><b>View</b></code> View a ser adicionada
     * @return <code><b>boolean</b></code> Está no desktop ativo?
     * <code>(true, false)</code>
     */
    private boolean isOnDesktop(View view) {
        for (Component c : getActiveDesktop().getComponents()) {
            if (c instanceof View) {
                View v = (View) c;
                if (v == view) {
                    return true;
                }
            }
        }
        return false;
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
    public void setVisualApp(VisualApp visualApp) {
        this.visualApp = visualApp;
    }

    /**
     * Retorna a View Ativa do desktop
     *
     * @return <code><b>View</b></code> View Ativa do desktop
     */
    public View getActiveView() {
        return activeView;
    }

    /**
     * Modifica a View Ativa do desktop
     *
     * @param activeView <code><b>View</b></code> View Ativa do desktop
     */
    public void setActiveView(View activeView) {
        this.activeView = activeView;
    }

}
