/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.ejb.beans;

import br.com.gmp.ejb.entity.UserBase;
import br.com.gmp.ejb.entity.UserInfo;
import br.com.gmp.ejb.enums.EntityBeans;
import br.com.gmp.utils.collections.Pair;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author kaciano
 */
@Stateless(mappedName = EntityBeans.USER_BASE_BEAN, name = "UserBaseFacade")
public class UserBaseFacade extends AbstractFacade<UserBase> implements UserBaseFacadeRemote {

    @PersistenceContext(unitName = "GMP-EJB-PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserBaseFacade() {
        super(UserBase.class);
    }

}
