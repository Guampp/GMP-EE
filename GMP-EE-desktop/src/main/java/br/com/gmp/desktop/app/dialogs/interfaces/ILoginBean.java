package br.com.gmp.desktop.app.dialogs.interfaces;

import br.com.gmp.ejb.entity.UserBase;
import br.com.gmp.ejb.entity.UserInfo;
import br.com.gmp.utils.collections.Pair;

/**
 *
 * @author kaciano
 */
public interface ILoginBean {

    boolean validateUser(UserInfo info);

    Pair<Boolean, UserInfo> checkDataBase(String login, String password);
}
