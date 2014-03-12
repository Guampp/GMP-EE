package br.com.gmp.ejb.menu;

import br.com.gmp.ejb.beans.MenuFacadeLocal;
import br.com.gmp.ejb.entity.Menu;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author kaciano
 */
@Stateless(mappedName = "EJB/MenuControler")
public class MenuControler implements MenuControlerLocal {

    @EJB
    MenuFacadeLocal menufacade;

    @Override
    public List<Menu> getMenuListLocal() throws Exception {
        return menufacade.findAll();
    }

}
