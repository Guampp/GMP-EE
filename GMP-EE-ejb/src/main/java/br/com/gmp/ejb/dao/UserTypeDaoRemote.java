/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.ejb.dao;

import br.com.gmp.ejb.entity.UserType;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author kaciano
 */
@Remote
public interface UserTypeDaoRemote {

    void create(UserType userType);

    void edit(UserType userType);

    void remove(UserType userType);

    UserType find(Object id);

    List<UserType> findAll();

    List<UserType> findRange(int[] range);

    int count();

}
