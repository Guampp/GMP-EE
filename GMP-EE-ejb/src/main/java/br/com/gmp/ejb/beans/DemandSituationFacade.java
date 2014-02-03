/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.ejb.beans;

import br.com.gmp.ejb.entity.DemandSituation;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author kaciano
 */
@Stateless(mappedName = "EJB/DemandSituationFacade", name = "DemandSituationFacade")
public class DemandSituationFacade extends AbstractFacade<DemandSituation> implements DemandSituationFacadeRemote {

    @PersistenceContext(unitName = "GMP-EJB-PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DemandSituationFacade() {
        super(DemandSituation.class);
    }

}