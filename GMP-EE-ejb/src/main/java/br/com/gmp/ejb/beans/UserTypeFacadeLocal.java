/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.ejb.beans;

import br.com.gmp.ejb.entity.UserType;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author kaciano
 */
@Local
public interface UserTypeFacadeLocal {

    void create(UserType userType);

    void edit(UserType userType);

    void remove(UserType userType);

    UserType find(Object id);

    List<UserType> findAll();

    List<UserType> findRange(int[] range);

    int count();
    
}
