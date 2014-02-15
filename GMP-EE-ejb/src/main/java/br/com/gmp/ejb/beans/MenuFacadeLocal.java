package br.com.gmp.ejb.beans;

import br.com.gmp.ejb.entity.Menu;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author kaciano
 */
@Local
public interface MenuFacadeLocal {

    void createLocal(Menu menu);

    void editLocal(Menu menu);

    void removeLocal(Menu menu);

    Menu findLocal(Object id);

    List<Menu> findAllLocal();

    List<Menu> findRangeLocal(int[] range);

    int countLocal();
    
}
