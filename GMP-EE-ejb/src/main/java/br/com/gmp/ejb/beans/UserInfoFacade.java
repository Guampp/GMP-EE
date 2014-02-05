/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.ejb.beans;

import br.com.gmp.ejb.entity.UserBase;
import br.com.gmp.ejb.entity.UserInfo;
import br.com.gmp.utils.collections.Pair;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author kaciano
 */
@Stateless(mappedName = "EJB/UserInfoFacade", name = "UserInfoFacade")
public class UserInfoFacade extends AbstractFacade<UserInfo> implements UserInfoFacadeRemote {

    @PersistenceContext(unitName = "GMP-EJB-PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserInfoFacade() {
        super(UserInfo.class);
    }

    /**
     * Autentica a existencia do usuário
     *
     * @param userid
     * @param password
     * @return
     */
    @Override
    public Pair<Boolean, UserInfo> authenticate(String userid, String password) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery query = cb.createQuery();
        Root<UserInfo> from = query.from(UserInfo.class);
        query.select(from);
        List<UserInfo> resultList = em.createQuery(query).getResultList();
        for (UserInfo info : resultList) {
            if (info.getLogin().equals(userid) && info.getPass().equals(password) && info.getActive()) {
                return new Pair(true, info);
            }
        }
        return new Pair(false, new UserInfo());
    }
}
