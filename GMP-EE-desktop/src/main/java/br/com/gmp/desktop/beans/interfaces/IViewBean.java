/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.desktop.beans.interfaces;

import br.com.gmp.desktop.views.events.ViewEvent;

/**
 *
 * @author kaciano
 */
public interface IViewBean {

    void confirm(ViewEvent viewEvent);

    void discard(ViewEvent viewEvent);

    void process(ViewEvent viewEvent);

    void clean(ViewEvent viewEvent);

    void load(ViewEvent viewEvent);

    void reload(ViewEvent viewEvent);

    boolean validateView(ViewEvent viewEvent);
}
