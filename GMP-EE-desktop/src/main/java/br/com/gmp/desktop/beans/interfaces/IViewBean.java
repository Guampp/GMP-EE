/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.desktop.beans.interfaces;

import br.com.gmp.desktop.views.interfaces.View;

/**
 *
 * @author kaciano
 */
public interface IViewBean {

    void confirm(View view);

    void discard(View view);

    void process(View view);

    void load(View view);

    void reload(View view);

    boolean validateView(View view);
}
