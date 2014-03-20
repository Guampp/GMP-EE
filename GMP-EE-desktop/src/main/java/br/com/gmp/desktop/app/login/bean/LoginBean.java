package br.com.gmp.desktop.app.login.bean;

import br.com.gmp.desktop.app.bean.VisualAppBean;
import br.com.gmp.desktop.app.event.BeanEvent;
import br.com.gmp.desktop.app.login.LoginPane;
import br.com.gmp.desktop.dao.UserDAO;
import br.com.gmp.ejb.controlers.user.UserControlerRemote;
import br.com.gmp.ejb.enums.EJBConstants;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;

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
     *
     * @param evt <code>BeanEvent</code> Evento
     */
    public void submit(BeanEvent evt) {
        evt.getObject();
        try {
            UserControlerRemote dao = new UserDAO().getDAO(EJBConstants.USER_CONTROLER);
            System.out.println(dao.getUsers().size());
        } catch (NamingException ex) {
            Logger.getLogger(VisualAppBean.class.getName()).log(Level.SEVERE, null, ex);
        }        
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
