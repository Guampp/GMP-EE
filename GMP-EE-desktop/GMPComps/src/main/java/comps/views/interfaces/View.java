package comps.views.interfaces;

/**
 * Interface padrão para Views
 *
 * @author kaciano
 * @see comps.views.interfaces.ViewBean
 */
public interface View {

    /**
     * Ação de confirmação
     */
    void confirm();

    /**
     * Ação de descarte
     */
    void discard();

    /**
     * Ação de processamento
     */
    void process();

    /**
     * Ação de limpeza
     */
    void clean();

    /**
     * Ação de carregamento
     */
    void load();

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
