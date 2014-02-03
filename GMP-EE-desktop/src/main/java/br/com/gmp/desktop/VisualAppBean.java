package br.com.gmp.desktop;

import br.com.gmp.desktop.beans.ViewBean;

/**
 *
 * @author kaciano
 */
public class VisualAppBean {

    private ViewBean activeViewBean;

    public VisualAppBean() {
    }

    public ViewBean getActiveViewBean() {
        return activeViewBean;
    }

    public void setActiveViewBean(ViewBean activeViewBean) {
        this.activeViewBean = activeViewBean;
    }

}
