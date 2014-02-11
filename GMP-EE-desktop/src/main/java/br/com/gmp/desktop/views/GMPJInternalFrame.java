package br.com.gmp.desktop.views;

import br.com.gmp.desktop.app.VisualAppBean;
import br.com.gmp.desktop.beans.ViewBean;
import br.com.gmp.desktop.views.events.ViewEvent;
import br.com.gmp.desktop.views.interfaces.View;
import javax.swing.JInternalFrame;
import javax.swing.border.Border;
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
        this.appBean = appBean;
        this.viewBean = viewBean;
        initComponents();
        init();
        setListeners();
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
        initComponents();
        init();
        setListeners();
    }

    /**
     * Metodo de inicialização
     */
    private void init() {
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
    }

    @Override
    public Border getBorder() {
        return javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153));
    }

    /**
     * Ação executada ao minimizar
     *
     * @param e Dados do evento
     */
    public void iconified(InternalFrameEvent e) {
        System.out.println("Event: Iconified");
        appBean.setActiveView(null);
    }

    /**
     * Ação executada ao maximizar
     *
     * @param e Dados do evento
     */
    public void deiconified(InternalFrameEvent e) {
        System.out.println("Event: Deiconified");
        appBean.setActiveView(this);
    }

    /**
     * Ação executada ao ativar o frame
     *
     * @param e Dados do evento
     */
    public void activated(InternalFrameEvent e) {
        System.out.println("Event: Activated");
        appBean.setActiveView(this);
    }

    /**
     * Ação executada ao desativar o frame
     *
     * @param e Dados do evento
     */
    public void deactivated(InternalFrameEvent e) {
        System.out.println("Event: Deactivated");
        appBean.setActiveView(null);
    }

    /**
     * Ação executada o frame fecha
     *
     * @param e Dados do evento
     */
    public void closed(InternalFrameEvent e) {
        System.out.println("Event: Closed");
        appBean.setActiveView(null);
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

            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                closed(e);
            }

        });
    }

    /**
     * Confirma os dados da view
     */
    @Override
    public void confirm() {
        viewBean.confirm(new ViewEvent(this, null));
    }

    /**
     * Descarta os dados da view
     */
    @Override
    public void discard() {
        viewBean.discard(new ViewEvent(this, null));
    }

    /**
     * Processa os dados da view
     */
    @Override
    public void process() {
        viewBean.process(new ViewEvent(this, null));
    }

    /**
     * Limpa os dados da view
     */
    @Override
    public void clean() {
        viewBean.clean(new ViewEvent(this, null));
    }

    /**
     * Carrega a view
     */
    @Override
    public void load() {
        viewBean.load(new ViewEvent(this, null));
    }

    /**
     * Recarrega a view
     */
    @Override
    public void reload() {
        viewBean.reload(new ViewEvent(this, null));
    }

    /**
     *
     * @return Retorno da validação do bean
     */
    @Override
    public boolean validateView() {
        return viewBean.validateView(new ViewEvent(this, null));
    }

    /**
     *
     * @return
     */
    @Override
    public Object getView() {
        return this;
    }

    /**
     *
     * @return
     */
    @Override
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
