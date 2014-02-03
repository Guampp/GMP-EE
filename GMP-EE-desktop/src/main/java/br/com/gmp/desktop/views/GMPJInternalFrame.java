package br.com.gmp.desktop.views;

import br.com.gmp.desktop.app.VisualAppBean;
import br.com.gmp.desktop.beans.ViewBean;
import br.com.gmp.desktop.views.events.ViewEvent;
import br.com.gmp.desktop.views.interfaces.View;
import javax.swing.JInternalFrame;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

/**
 * Implementação de View padrão baseada em JInternalFrame
 *
 * @author kaciano
 */
public class GMPJInternalFrame extends JInternalFrame implements View {

    private VisualAppBean appBean;
    private ViewBean viewBean;
    private boolean canConfirm = true;
    private boolean canDiscard = true;
    private boolean canProcess = true;

    /**
     * Cria nova instancia de GMPJInternalFrame
     *
     * @param appBean VisualAppBean
     * @param viewBean Bean da view
     */
    public GMPJInternalFrame(VisualAppBean appBean, ViewBean viewBean) {
        setListeners();
        this.appBean = appBean;
        this.viewBean = viewBean;
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }

    /**
     * Cria nova instancia de GMPJInternalFrame
     *
     * @param appBean VisualAppBean
     * @param viewBean Bean da view
     * @param canConfirm Pode confirmar?
     * @param canDiscard Pode Descartar?
     * @param canProcess Pode Processar?
     */
    public GMPJInternalFrame(VisualAppBean appBean, ViewBean viewBean, boolean canConfirm, boolean canDiscard, boolean canProcess) {
        this.appBean = appBean;
        this.viewBean = viewBean;
        this.canConfirm = canConfirm;
        this.canDiscard = canDiscard;
        this.canProcess = canProcess;
        setListeners();
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }

    /**
     * Ação executada ao minimizar
     *
     * @param e Dados do evento
     */
    public void iconified(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Ação executada ao maximizar
     *
     * @param e Dados do evento
     */
    public void deiconified(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Ação executada ao ativar o frame
     *
     * @param e Dados do evento
     */
    public void activated(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Ação executada ao desativar o frame
     *
     * @param e Dados do evento
     */
    public void deactivated(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Adiciona os listeners especificos do frame
     */
    private void setListeners() {
        addInternalFrameListener(new InternalFrameAdapter() {

            @Override
            public void internalFrameIconified(InternalFrameEvent event) {
                iconified(event);
            }

            @Override
            public void internalFrameDeiconified(InternalFrameEvent event) {
                deiconified(event);
            }

            @Override
            public void internalFrameActivated(InternalFrameEvent event) {
                activated(event);
            }

            @Override
            public void internalFrameDeactivated(InternalFrameEvent event) {
                deactivated(event);
            }
        });
    }

    /**
     * Confirma os dados da view
     */
    public void confirm() {
        viewBean.confirm(new ViewEvent(this, null));
    }

    /**
     * Descarta os dados da view
     */
    public void discard() {
        viewBean.discard(new ViewEvent(this, null));
    }

    /**
     * Processa os dados da view
     */
    public void process() {
        viewBean.process(new ViewEvent(this, null));
    }

    /**
     * Carrega a view
     */
    public void load() {
        viewBean.load(new ViewEvent(this, null));
    }

    /**
     * Recarrega a view
     */
    public void reload() {
        viewBean.reload(new ViewEvent(this, null));
    }

    /**
     *
     * @return Retorno da validação do bean
     */
    public boolean validateView() {
        return viewBean.validateView(new ViewEvent(this, null));
    }

    /**
     *
     * @return
     */
    public Object getView() {
        return this;
    }

    /**
     *
     * @return
     */
    public ViewBean getViewBean() {
        return viewBean;
    }

    /**
     *
     * @param viewBean
     */
    public void setViewBean(ViewBean viewBean) {
        this.viewBean = viewBean;
    }

    /**
     *
     * @return
     */
    public VisualAppBean getAppBean() {
        return appBean;
    }

    /**
     *
     * @param appBean
     */
    public void setAppBean(VisualAppBean appBean) {
        this.appBean = appBean;
    }

    /**
     * Pode confirmar?
     *
     * @return Pode confirmar?
     */
    public boolean isCanConfirm() {
        return canConfirm;
    }

    /**
     * Modifica a permissão de confirmação
     *
     * @param canConfirm
     */
    public void setCanConfirm(boolean canConfirm) {
        this.canConfirm = canConfirm;
    }

    /**
     * Pode descartar?
     *
     * @return Pode descartar?
     */
    public boolean isCanDiscard() {
        return canDiscard;
    }

    /**
     * Modifica a permissão de descarte
     *
     * @param canDiscard Pode descartar?
     */
    public void setCanDiscard(boolean canDiscard) {
        this.canDiscard = canDiscard;
    }

    /**
     * Pode processar?
     *
     * @return Pode processar?
     */
    public boolean isCanProcess() {
        return canProcess;
    }

    /**
     * Modifica a permissão de processamento
     *
     * @param canProcess Pode processar?
     */
    public void setCanProcess(boolean canProcess) {
        this.canProcess = canProcess;
    }

    /**
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
