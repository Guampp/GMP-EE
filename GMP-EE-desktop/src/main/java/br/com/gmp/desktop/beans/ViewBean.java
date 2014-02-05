package br.com.gmp.desktop.beans;

import br.com.gmp.desktop.beans.interfaces.IViewBean;
import br.com.gmp.desktop.views.GMPJInternalFrame;
import br.com.gmp.desktop.views.events.ViewEvent;

/**
 *
 * @author kaciano
 */
public class ViewBean implements IViewBean {

    @Override
    public void confirm(ViewEvent viewEvent) {
        System.out.println(((GMPJInternalFrame) viewEvent.getView()).getName() + " Confirm");
    }

    @Override
    public void discard(ViewEvent viewEvent) {
        System.out.println(((GMPJInternalFrame) viewEvent.getView()).getName() + " Discard");
    }

    @Override
    public void process(ViewEvent viewEvent) {
        System.out.println(((GMPJInternalFrame) viewEvent.getView()).getName() + " Process");
    }

    @Override
    public void load(ViewEvent viewEvent) {
        System.out.println(((GMPJInternalFrame) viewEvent.getView()).getName() + " Load");
    }

    @Override
    public void reload(ViewEvent viewEvent) {
        System.out.println(((GMPJInternalFrame) viewEvent.getView()).getName() + " Reload");
    }

    @Override
    public boolean validateView(ViewEvent viewEvent) {
        System.out.println(((GMPJInternalFrame) viewEvent.getView()).getName() + " Validated");
        return true;
    }

}
