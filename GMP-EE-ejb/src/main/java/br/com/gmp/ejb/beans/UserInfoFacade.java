/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.ejb.beans;

import br.com.gmp.ejb.entity.UserBase;
import br.com.gmp.ejb.entity.UserInfo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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

}
