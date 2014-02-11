package br.com.gmp.desktop.views.interfaces;

import br.com.gmp.desktop.beans.ViewBean;

/**
 * Interface das Views do sistema
 *
 * @author kaciano
 */
public interface View {

    void confirm();

    void discard();

    void process();

    void clean();
    
    void load();

    void reload();

    boolean validateView();

    Object getView();

    ViewBean getViewBean();
}
