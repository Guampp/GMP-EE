/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.ejb.beans;

import br.com.gmp.ejb.entity.DemandType;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author kaciano
 */
@Local
public interface DemandTypeFacadeLocal {

    void create(DemandType demandType);

    void edit(DemandType demandType);

    void remove(DemandType demandType);

    DemandType find(Object id);

    List<DemandType> findAll();

    List<DemandType> findRange(int[] range);

    int count();
    
}
