package br.com.gmp.desktop.dao;

import br.com.gmp.ejb.dao.UserBaseDao;
import br.com.gmp.ejb.enums.EntityBeans;
import javax.naming.NamingException;

/**
 *
 * @author kaciano
 */
public class UserDAO extends GenericDAO<UserBaseDao> {

    public UserBaseDao getDAO() throws NamingException {
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
