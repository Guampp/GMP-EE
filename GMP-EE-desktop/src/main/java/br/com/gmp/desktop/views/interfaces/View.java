package br.com.gmp.desktop.views.interfaces;

/**
 * Interface padrão para Views
 *
 * @author kaciano
 * @see br.com.gmp.desktop.views.interfaces.ViewBean
 */
public interface View {

    int getLevel();

    /**
     * A View poderá confirmar?
     *
     * @return
     */
    boolean canConfirm();

    /**
     * Ação de confirmação
     */
    void confirm();

    /**
     * A View poderá descartar?
     *
     * @return
     */
    boolean canDiscard();

    /**
     * Ação de descarte
     */
    void discard();

    /**
     * A View poderá processar?
     *
     * @return
     */
    boolean canProcess();

    /**
     * Ação de processamento
     */
    void process();

    /**
     * A View poderá ser limpa?
     *
     * @return
     */
    boolean canClean();

    /**
     * Ação de limpeza
     */
    void clean();

    /**
     * A View poderá carregar?
     *
     * @return
     */
    boolean canLoad();

    /**
     * Ação de carregamento
     */
    void load();

    /**
     * A View poderá recarregar?
     *
     * @return
     */
    boolean canReload();

    /**
     * Ação de recarregamento
     */
    void reload();

    /**
     * Ação de validação
     *
     * @return
     */
    boolean validateView();

    /**
     * Retorna a View
     *
     * @return View
     */
    Object getView();

    /**
     * Retorna o ViewBean
     *
     * @return ViewBean
     */
    ViewBean getViewBean();
}
