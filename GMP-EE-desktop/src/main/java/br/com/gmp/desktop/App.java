package br.com.gmp.desktop;

import br.com.gmp.desktop.ejb.LookUpper;
import br.com.gmp.ejb.beans.UserBaseFacadeRemote;
import br.com.gmp.ejb.enums.EntityBeans;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;

/**
 * Classe da Aplicação
 *
 * @author kaciano
 * @since 1.0
 */
public class App {

    public static void main(String[] args) {
        try {
            UserBaseFacadeRemote lookup = (UserBaseFacadeRemote) LookUpper.lookUp(EntityBeans.USER_BASE_BEAN);
            System.out.println(lookup.count());
        } catch (NamingException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
