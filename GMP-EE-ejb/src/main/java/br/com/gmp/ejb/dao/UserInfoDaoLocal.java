/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.ejb.dao;

import br.com.gmp.ejb.entity.UserInfo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author kaciano
 */
@Local
public interface UserInfoDaoLocal {

    void create(UserInfo userInfo);

    void edit(UserInfo userInfo);

    void remove(UserInfo userInfo);

    UserInfo find(Object id);

    List<UserInfo> findAll();

    List<UserInfo> findRange(int[] range);

    int count();
    
}
