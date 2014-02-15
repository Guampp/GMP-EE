package br.com.gmp.ejb.menu;

import br.com.gmp.ejb.entity.Menu;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author kaciano
 */
@Remote
public interface MenuControlerRemote {

    public List<Menu> getMenuList() throws Exception;
}
