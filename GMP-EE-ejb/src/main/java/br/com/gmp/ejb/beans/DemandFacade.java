/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.ejb.beans;

import br.com.gmp.ejb.dao.AbstractDao;
import br.com.gmp.ejb.dao.DemandDaoRemote;
import br.com.gmp.ejb.entity.Demand;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author kaciano
 */
@Stateless(mappedName = "EJB/DemandFacade", name = "DemandFacade")
public class DemandFacade extends AbstractDao<Demand> implements DemandDaoRemote {

    @PersistenceContext(unitName = "GMP-EJB-PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DemandFacade() {
        super(Demand.class);
    }

}
