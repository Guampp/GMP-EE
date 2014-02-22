/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.ejb.dao;

import br.com.gmp.ejb.entity.DemandType;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author kaciano
 */
@Remote
public interface DemandTypeDaoRemote {

    void create(DemandType demandType);

    void edit(DemandType demandType);

    void remove(DemandType demandType);

    DemandType find(Object id);

    List<DemandType> findAll();

    List<DemandType> findRange(int[] range);

    int count();
    
}
