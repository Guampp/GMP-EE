package br.com.gmp.desktop;

import br.com.gmp.ejb.beans.UserBaseFacadeRemote;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        try {
            InitialContext ic = new InitialContext();
            UserBaseFacadeRemote lookup = (UserBaseFacadeRemote) ic.lookup("EJB/UserBaseFacade");
            System.out.println(lookup.count());
        } catch (NamingException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
