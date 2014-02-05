package br.com.gmp.desktop.dao;

import br.com.gmp.ejb.beans.UserInfoFacadeRemote;
import br.com.gmp.ejb.entity.UserInfo;
import br.com.gmp.ejb.enums.EntityBeans;
import br.com.gmp.utils.collections.Pair;
import javax.naming.NamingException;

/**
 * Objeto de administração do EJB para a entidade UserInfo
 *
 * @author kaciano
 */
public class UserInfoDAO extends GenericDAO<UserInfoFacadeRemote> {

    /**
     * Retorna EJB de controle remoto de UserInfo
     *
     * @return EJB de controle remoto de UserInfo
     * @throws javax.naming.NamingException Exceção de nomeação
     */
    public UserInfoFacadeRemote getDAO() throws NamingException {
        return super.getDAO(EntityBeans.USER_BASE_BEAN);
    }

    /**
     * Autentica a existencia do usuário
     *
     * @param userid Login do usuário
     * @param pass Senha do usuário
     * @return Resultado da autenticação
     * @throws javax.naming.NamingException Exceção de nomeação
     */
    public Pair<Boolean, UserInfo> authenticate(String userid, String pass) throws NamingException {
        return getDAO().authenticate(userid, pass);
    }

}
