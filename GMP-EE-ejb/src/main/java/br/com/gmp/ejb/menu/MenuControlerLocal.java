package br.com.gmp.ejb.menu;

import br.com.gmp.ejb.entity.Menu;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author kaciano
 */
@Local
public interface MenuControlerLocal {

    public List<Menu> getMenuListLocal() throws Exception;
}
