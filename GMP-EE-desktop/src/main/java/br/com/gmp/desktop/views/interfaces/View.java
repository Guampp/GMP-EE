/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.desktop.views.interfaces;

/**
 *
 * @author kaciano
 */
public interface View {

    void confirm();

    void discard();

    void process();

    void load();

    void reload();

    boolean validateView();
    
    Object getView();
}
