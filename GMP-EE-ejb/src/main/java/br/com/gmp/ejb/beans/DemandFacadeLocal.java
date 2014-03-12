/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.ejb.beans;

import br.com.gmp.ejb.entity.Demand;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author kaciano
 */
@Local
public interface DemandFacadeLocal {

    void create(Demand demand);

    void edit(Demand demand);

    void remove(Demand demand);

    Demand find(Object id);

    List<Demand> findAll();

    List<Demand> findRange(int[] range);

    int count();
    
}
