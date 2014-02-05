package br.com.gmp.desktop.dao;

import br.com.gmp.ejb.beans.UserBaseFacadeRemote;
import br.com.gmp.ejb.entity.UserInfo;
import br.com.gmp.ejb.enums.EntityBeans;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author kaciano
 */
public class UserBaseDAO extends GenericDAO<UserBaseFacadeRemote> {

    public UserBaseFacadeRemote getDAO() throws NamingException {
        return super.getDAO(EntityBeans.USER_BASE_BEAN);
    }

    /**
     *
     * @param userid
     * @param pass
     * @return 
     * @throws javax.naming.NamingException
     */
    public boolean authenticate(String userid, String pass) throws NamingException {        
        return false;
    }

}
