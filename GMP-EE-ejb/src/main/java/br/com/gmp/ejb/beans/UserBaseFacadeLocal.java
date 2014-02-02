/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.ejb.beans;

import br.com.gmp.ejb.entity.UserBase;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author kaciano
 */
@Local
public interface UserBaseFacadeLocal {

    void create(UserBase userBase);

    void edit(UserBase userBase);

    void remove(UserBase userBase);

    UserBase find(Object id);

    List<UserBase> findAll();

    List<UserBase> findRange(int[] range);

    int count();
    
}
