/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.ejb.dao;

import br.com.gmp.ejb.entity.UserBase;
import br.com.gmp.ejb.entity.UserInfo;
import br.com.gmp.utils.collections.Pair;
import java.util.List;
import javax.ejb.Remote;
import javax.persistence.EntityManager;

/**
 *
 * @author kaciano
 */
@Remote
public interface UserBaseDaoRemote {

    

    void create(UserBase userBase);

    void edit(UserBase userBase);

    void remove(UserBase userBase);

    UserBase find(Object id);

    List<UserBase> findAll();

    List<UserBase> findRange(int[] range);

    int count();

}
