/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.ejb.beans;

import br.com.gmp.ejb.entity.UserInfo;
import br.com.gmp.utils.collections.Pair;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author kaciano
 */
@Remote
public interface UserInfoFacadeRemote {
Pair<Boolean, UserInfo> authenticate(String userid, String passoword);
    void create(UserInfo userBase);

    void edit(UserInfo userBase);

    void remove(UserInfo userBase);

    UserInfo find(Object id);

    List<UserInfo> findAll();

    List<UserInfo> findRange(int[] range);

    int count();

}
