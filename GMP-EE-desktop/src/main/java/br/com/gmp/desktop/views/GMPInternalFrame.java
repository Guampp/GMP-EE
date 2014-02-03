package br.com.gmp.desktop.views;

import br.com.gmp.desktop.VisualAppBean;
import br.com.gmp.desktop.beans.ViewBean;
import br.com.gmp.desktop.views.interfaces.View;
import javax.swing.JInternalFrame;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

/**
 *
 * @author kaciano
 */
public abstract class GMPInternalFrame extends JInternalFrame implements View {

    private VisualAppBean appBean;
    private ViewBean viewBean;
    private boolean canConfirm = true;
    private boolean canDiscard = true;
    private boolean canProcess = true;

    /**
     *
     * @param appBean
     * @param viewBean
     */
    public GMPInternalFrame(VisualAppBean appBean, ViewBean viewBean) {
        this.appBean = appBean;
        this.viewBean = viewBean;
        setListeners();
    }

    /**
     *
     * @param appBean
     * @param viewBean
     * @param canConfirm Pode confirmar?
     * @param canDiscard Pode Descartar?
     * @param canProcess Pode Processar?
     */
    public GMPInternalFrame(VisualAppBean appBean, ViewBean viewBean, boolean canConfirm, boolean canDiscard, boolean canProcess) {
        this.appBean = appBean;
        this.viewBean = viewBean;
        this.canConfirm = canConfirm;
        this.canDiscard = canDiscard;
        this.canProcess = canProcess;
        setListeners();
    }

    /**
     *
     * @return
     */
    private void setListeners() {
        addInternalFrameListener(new InternalFrameAdapter() {

            @Override
            public void internalFrameIconified(InternalFrameEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void internalFrameDeiconified(InternalFrameEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void internalFrameActivated(InternalFrameEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void internalFrameDeactivated(InternalFrameEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    /**
     * Confirma os dados da view
     */
    public void confirm() {
        viewBean.confirm(this);
    }

    /**
     * Descarta os dados da view
     */
    public void discard() {
        viewBean.discard(this);
    }

    /**
     * Processa os dados da view
     */
    public void process() {
        viewBean.process(this);
    }

    /**
     * Carrega a view
     */
    public void load() {
        viewBean.load(this);
    }

    /**
     * Recarrega a view
     */
    public void reload() {
        viewBean.reload(this);
    }

    /**
     *
     * @return Retorno da validação do bean
     */
    public boolean validateView() {
        return viewBean.validateView(this);
    }

    public VisualAppBean getAppBean() {
        return appBean;
    }

    public void setAppBean(VisualAppBean appBean) {
        this.appBean = appBean;
    }

    public ViewBean getViewBean() {
        return viewBean;
    }

    public void setViewBean(ViewBean viewBean) {
        this.viewBean = viewBean;
    }

    public Object getView() {
        return this;
    }

    public boolean isCanConfirm() {
        return canConfirm;
    }

    public void setCanConfirm(boolean canConfirm) {
        this.canConfirm = canConfirm;
    }

    public boolean isCanDiscard() {
        return canDiscard;
    }

    public void setCanDiscard(boolean canDiscard) {
        this.canDiscard = canDiscard;
    }

    public boolean isCanProcess() {
        return canProcess;
    }

    public void setCanProcess(boolean canProcess) {
        this.canProcess = canProcess;
    }

}
