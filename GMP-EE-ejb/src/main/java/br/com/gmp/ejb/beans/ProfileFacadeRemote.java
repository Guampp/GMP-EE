/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.ejb.beans;

import br.com.gmp.ejb.entity.Profile;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author kaciano
 */
@Remote
public interface ProfileFacadeRemote {

    void create(Profile profile);

    void edit(Profile profile);

    void remove(Profile profile);

    Profile find(Object id);

    List<Profile> findAll();

    List<Profile> findRange(int[] range);

    int count();
    
}
