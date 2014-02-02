/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.ejb.beans;

import br.com.gmp.ejb.entity.ProfileAccess;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author kaciano
 */
@Remote
public interface ProfileAccessFacadeRemote {

    void create(ProfileAccess profileAccess);

    void edit(ProfileAccess profileAccess);

    void remove(ProfileAccess profileAccess);

    ProfileAccess find(Object id);

    List<ProfileAccess> findAll();

    List<ProfileAccess> findRange(int[] range);

    int count();
    
}
