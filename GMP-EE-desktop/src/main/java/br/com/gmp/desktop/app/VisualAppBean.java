package br.com.gmp.desktop.app;

import br.com.gmp.desktop.app.interfaces.IVisualAppBean;
import br.com.gmp.desktop.views.interfaces.View;
import comps.tabbedpane.GMPJTabbedPane;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 * Bean do VisualApp
 *
 * @author kaciano
 */
public class VisualAppBean implements IVisualAppBean {

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
    @Override
    public void confirm() {
        if (!checkNull()) {
            activeView.confirm();
        }
    }

    /**
     * Ativa o evento de descarte
     */
    @Override
    public void discard() {
        if (!checkNull()) {
            activeView.discard();
        }
    }

    /**
     * Ativa o evento de processamento
     */
    @Override
    public void process() {
        if (!checkNull()) {
            activeView.process();
        }
    }

    /**
     * Ativa o evento de limpeza
     */
    @Override
    public void clean() {
        if (!checkNull()) {
            activeView.clean();
        }
    }

    /**
     * Carrega os dados
     */
    @Override
    public void load() {

    }

    /**
     * Recarrega os dados
     */
    @Override
    public void reload() {

    }

    /**
     * Verifica existencia de activeView
     *
     * @return activeView existe?
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
     *
     * @return
     */
    public VisualApp getVisualApp() {
        return visualApp;
    }

    /**
     *
     * @param visualApp
     */
    public void setVisualApp(VisualApp visualApp) {
        this.visualApp = visualApp;
    }

    /**
     *
     * @return
     */
    public View getActiveView() {
        return activeView;
    }

    /**
     *
     * @param activeView
     */
    public void setActiveView(View activeView) {
        this.activeView = activeView;
    }

}
