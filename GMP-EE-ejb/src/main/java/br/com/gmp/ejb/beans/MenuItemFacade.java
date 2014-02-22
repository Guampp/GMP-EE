/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.ejb.beans;

import br.com.gmp.ejb.dao.AbstractDao;
import br.com.gmp.ejb.dao.MenuItemDaoRemote;
import br.com.gmp.ejb.entity.MenuItem;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author kaciano
 */
@Stateless(mappedName = "EJB/MenuItemFacade", name = "MenuItemFacade")
public class MenuItemFacade extends AbstractDao<MenuItem> implements MenuItemDaoRemote {

    @PersistenceContext(unitName = "GMP-EJB-PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MenuItemFacade() {
        super(MenuItem.class);
    }

}
