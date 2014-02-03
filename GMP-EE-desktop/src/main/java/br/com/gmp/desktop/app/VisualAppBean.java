package br.com.gmp.desktop.app;

import br.com.gmp.desktop.app.interfaces.IVisualAppBean;
import br.com.gmp.desktop.views.interfaces.View;

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
    public void confirm() {
        activeView.confirm();
    }

    /**
     * Ativa o evento de descarte
     */
    public void discard() {
        activeView.discard();
    }

    /**
     * Ativa o evento de processamento
     */
    public void process() {
        activeView.process();
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

    public VisualApp getVisualApp() {
        return visualApp;
    }

    public void setVisualApp(VisualApp visualApp) {
        this.visualApp = visualApp;
    }

    public View getActiveView() {
        return activeView;
    }

    public void setActiveView(View activeView) {
        this.activeView = activeView;
    }
}
