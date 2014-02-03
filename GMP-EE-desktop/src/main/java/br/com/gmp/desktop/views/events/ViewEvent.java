/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.desktop.views.events;

import br.com.gmp.desktop.views.interfaces.View;

/**
 *
 * @author kaciano
 */
public class ViewEvent {

    private View view;
    private Object object;

    public ViewEvent(View view, Object object) {
        this.view = view;
        this.object = object;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

}
