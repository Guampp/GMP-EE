package br.com.gmp.ejb.controlers.user;

import br.com.gmp.ejb.entity.UserBase;
import java.util.List;
import javax.ejb.Remote;

/**
 * Interface remota para controle de usuários
 *
 * @author kaciano
 * @version 1.0
 */
@Remote
public interface UserControlerRemote {

    /**
     * Verifica a existencia do usuário
     *
     * @param login <code>String</code> Login do usuário
     * @param password <code>String</code> Senha do usuário
     * @return <code>Boolean</code> Resultado da verificação
     */
    java.lang.Boolean validateUser(String login, String password);

    /**
     * Retorna a lista de usuários
     *
     * @return
     */
    List<UserBase> getUsers();

}
