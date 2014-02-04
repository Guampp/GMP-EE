/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.desktop.app.dialogs;

/**
 *
 * @author kaciano
 */
public class LoginPaneBean {

    private LoginPane loginPane;

    public LoginPaneBean(LoginPane loginPane) {
        this.loginPane = loginPane;
    }

    public LoginPane getLoginPane() {
        return loginPane;
    }

    public void setLoginPane(LoginPane loginPane) {
        this.loginPane = loginPane;
    }

}
