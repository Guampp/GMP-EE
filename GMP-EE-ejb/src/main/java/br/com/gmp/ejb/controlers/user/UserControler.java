package br.com.gmp.ejb.controlers.user;

import br.com.gmp.ejb.controlers.GenericControler;
import br.com.gmp.ejb.entity.UserInfo;
import br.com.gmp.ejb.entity.UserInfo_;
import br.com.gmp.ejb.enums.EJBConstants;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Controlador de usuários
 *
 * @author kaciano
 * @version 1.0
 */
@Stateless(mappedName = EJBConstants.VALIDATE_USER)
public class UserControler extends GenericControler implements UserControlerRemote {

    @Override
    public Boolean validateUser(String login, String password) {
        UserInfo info = getUserInfo(login, password);
        return info != null;
    }

    /**
     * Retorna o UserInfo referenciado pelo login e senha recebidos
     *
     * @param login <code>String</code> Login do usuário
     * @param password <code>String</code> Senha do usuário
     * @return <code>UserInfo</code> Info do usuário
     */
    private UserInfo getUserInfo(String login, String password) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery query = cb.createQuery();
        Root<UserInfo> from = query.from(UserInfo.class);
        query.select(from);
        List<Predicate> pred = new ArrayList<>();
        pred.add(cb.equal(from.get(UserInfo_.active), true));
        pred.add(cb.equal(from.get(UserInfo_.login), login));
        pred.add(cb.equal(from.get(UserInfo_.pass), password));
        query.where(pred.toArray(new Predicate[]{}));
        Object result = em.createQuery(query).setMaxResults(1).getSingleResult();
        return (UserInfo) result;
    }

}
