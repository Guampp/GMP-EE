/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.ejb.beans;

import br.com.gmp.ejb.entity.MenuItem;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author kaciano
 */
@Local
public interface MenuItemFacadeLocal {

    void create(MenuItem menuItem);

    void edit(MenuItem menuItem);

    void remove(MenuItem menuItem);

    MenuItem find(Object id);

    List<MenuItem> findAll();

    List<MenuItem> findRange(int[] range);

    int count();
    
}
