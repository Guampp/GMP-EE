package br.com.gmp.desktop.app.dialogs.login;

import br.com.gmp.desktop.app.dialogs.interfaces.ILoginBean;
import br.com.gmp.desktop.dao.UserInfoDAO;
import br.com.gmp.ejb.entity.UserInfo;
import br.com.gmp.utils.collections.Pair;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;

/**
 * Bean de controle para o Painel de login
 *
 * @author kaciano
 */
public class LoginPaneBean implements ILoginBean {

    private LoginPane loginPane;
    private UserInfo info;

    /**
     * Cria nova instancia de LoginPaneBean
     *
     * @param loginPane Painel de login
     * @param info UserInfo da sessão
     */
    public LoginPaneBean(LoginPane loginPane, UserInfo info) {
        this.loginPane = loginPane;
        this.info = info;
    }

    /**
     * Valida os dados do usuário
     *
     * @param info UserInfo da sessão
     * @return Resultado da validação
     */
    @Override
    public boolean validateUser(UserInfo info) {
        String login = loginPane.getjTUserID().getText();
        String pass = loginPane.getjPassword().getText();
        Pair<Boolean, UserInfo> check = checkDataBase(login, pass);
        if (check.getFirst()) {
            info = check.getSecond();
        }
        return check.getFirst();
    }

    /**
     * Verifica existencia dos dados no banco de dados
     *
     * @param login Login do usuário
     * @param password Senha do usuário
     * @return Resultado da verificação
     */
    @Override
    public Pair<Boolean, UserInfo> checkDataBase(String login, String password) {
        try {
            return new UserInfoDAO().authenticate(login, password);
        } catch (NamingException ex) {
            Logger.getLogger(LoginPaneBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Pair(false, new UserInfo());
    }

    //<editor-fold desc="Get's & Set's" defaultstate="collapsed">
    public UserInfo getInfo() {
        return info;
    }

    public void setInfo(UserInfo info) {
        this.info = info;
    }

    public LoginPane getLoginPane() {
        return loginPane;
    }

    public void setLoginPane(LoginPane loginPane) {
        this.loginPane = loginPane;
    }
    //</editor-fold>
}
