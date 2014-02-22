/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.ejb.beans;

import br.com.gmp.ejb.dao.AbstractDao;
import br.com.gmp.ejb.dao.DemandPriorityDaoRemote;
import br.com.gmp.ejb.entity.DemandPriority;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author kaciano
 */
@Stateless(mappedName = "EJB/DemandPriorityFacade", name = "DemandPriorityFacade")
public class DemandPriorityFacade extends AbstractDao<DemandPriority> implements DemandPriorityDaoRemote {

    @PersistenceContext(unitName = "GMP-EJB-PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DemandPriorityFacade() {
        super(DemandPriority.class);
    }

}
