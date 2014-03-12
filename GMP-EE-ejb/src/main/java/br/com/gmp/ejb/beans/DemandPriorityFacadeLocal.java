/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.ejb.beans;

import br.com.gmp.ejb.entity.DemandPriority;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author kaciano
 */
@Local
public interface DemandPriorityFacadeLocal {

    void create(DemandPriority demandPriority);

    void edit(DemandPriority demandPriority);

    void remove(DemandPriority demandPriority);

    DemandPriority find(Object id);

    List<DemandPriority> findAll();

    List<DemandPriority> findRange(int[] range);

    int count();
    
}
