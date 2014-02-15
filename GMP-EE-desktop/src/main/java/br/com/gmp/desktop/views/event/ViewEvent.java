package br.com.gmp.desktop.views.event;

import br.com.gmp.desktop.views.interfaces.View;

/**
 * Objeto para transferencia de dados entre <b>View</b> e <b>ViewBean</b>
 *
 * @author kaciano
 * @see comps.views.interfaces.View
 * @see comps.views.interfaces.ViewBean
 */
public class ViewEvent {

    private View view;
    private Object param;

    /**
     * Cria novo ViewEvent
     *
     * @param view <b>View</b>
     * @param param Parametros do evento
     */
    public ViewEvent(View view, Object param) {
        this.view = view;
        this.param = param;
    }

    /**
     * Retorna a View do evento
     *
     * @return <b>View</b> View do evento
     */
    public View getView() {
        return view;
    }

    /**
     * Modifica a View do evento
     *
     * @param view View do evento
     */
    public void setView(View view) {
        this.view = view;
    }

    /**
     * Retorna os parametros do evento
     *
     * @return <b>Object</b> Parametros do evento
     */
    public Object getObject() {
        return param;
    }

    /**
     * Modifica os parametros do evento
     *
     * @param param Parametros do evento
     */
    public void setObject(Object param) {
        this.param = param;
    }

}
