package br.com.gmp.desktop.views.beans;

import br.com.gmp.desktop.views.event.ViewEvent;
import br.com.gmp.desktop.views.interfaces.ViewBean;
import br.com.gmp.desktop.views.interfaces.View;

/**
 *
 * @author kaciano
 */
public class DefaultViewBean implements ViewBean {

    private View view;

    public DefaultViewBean(View view) {
        this.view = view;
    }

    @Override
    public void confirm(ViewEvent viewEvent) {
        System.out.println((viewEvent.getView()).getClass().getName()
                + " Confirm");
    }

    @Override
    public void discard(ViewEvent viewEvent) {
        System.out.println((viewEvent.getView()).getClass().getName()
                + " Discard");
    }

    @Override
    public void process(ViewEvent viewEvent) {
        System.out.println((viewEvent.getView()).getClass().getName()
                + " Process");
    }

    @Override
    public void clean(ViewEvent viewEvent) {
        System.out.println((viewEvent.getView()).getClass().getName()
                + " Clean");
    }

    @Override
    public void load(ViewEvent viewEvent) {
        System.out.println((viewEvent.getView()).getClass().getName()
                + " Load");
    }

    @Override
    public void reload(ViewEvent viewEvent) {
        System.out.println((viewEvent.getView()).getClass().getName()
                + " Reload");
    }

    @Override
    public boolean validateView(ViewEvent viewEvent) {
        System.out.println((viewEvent.getView()).getClass().getName()
                + " Validated");
        return true;
    }

    @Override
    public View getView() {
        return this.view;
    }

    @Override
    public void setView(View view) {
        this.view = view;
    }

}
