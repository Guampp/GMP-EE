package comps.views.interfaces;

import comps.views.event.ViewEvent;

/**
 * Interface padrão para ViewBeans
 *
 * @author kaciano
 * @see comps.views.interfaces.View
 */
public interface ViewBean {

    /**
     * Ação de confirmação
     *
     * @param viewEvent
     */
    void confirm(ViewEvent viewEvent);

    /**
     * Ação de descarte
     *
     * @param viewEvent
     */
    void discard(ViewEvent viewEvent);

    /**
     * Ação de processamento
     *
     * @param viewEvent
     */
    void process(ViewEvent viewEvent);

    /**
     * Ação de limpeza
     *
     * @param viewEvent
     */
    void clean(ViewEvent viewEvent);

    /**
     * Ação de carregamento
     *
     * @param viewEvent
     */
    void load(ViewEvent viewEvent);

    /**
     * Ação de recarregamento
     *
     * @param viewEvent
     */
    void reload(ViewEvent viewEvent);

    /**
     * Ação de validação
     *
     * @param viewEvent
     * @return
     */
    boolean validateView(ViewEvent viewEvent);

    /**
     * Retorna a View
     *
     * @return View
     */
    View getView();

    /**
     * Modifica a view
     *
     * @param view View
     */
    void setView(View view);
}
