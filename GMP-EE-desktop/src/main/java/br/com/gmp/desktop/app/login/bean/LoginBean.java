package br.com.gmp.desktop.app.login.bean;

import br.com.gmp.desktop.app.event.BeanEvent;
import br.com.gmp.desktop.app.login.LoginPane;

/**
 * Bean para painel de Login
 *
 * @author kaciano
 */
public class LoginBean {

    private LoginPane loginPane;

    /**
     *
     * @param loginPane
     */
    public LoginBean(LoginPane loginPane) {
        this.loginPane = loginPane;
    }

    /**
     * Método para submeter o Login
     */
    public void submit(BeanEvent evt) {
        evt.getObject();
    }

    //<editor-fold desc="Get's & Set's" defaultstate="collapsed">
    /**
     *
     * @return
     */
    public LoginPane getLoginPane() {
        return loginPane;
    }

    /**
     *
     * @param loginPane
     */
    public void setLoginPane(LoginPane loginPane) {
        this.loginPane = loginPane;
    }
    //</editor-fold>

}
