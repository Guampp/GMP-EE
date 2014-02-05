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
