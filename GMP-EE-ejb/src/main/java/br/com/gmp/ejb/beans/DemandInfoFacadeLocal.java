/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.ejb.beans;

import br.com.gmp.ejb.entity.DemandInfo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author kaciano
 */
@Local
public interface DemandInfoFacadeLocal {

    void create(DemandInfo demandInfo);

    void edit(DemandInfo demandInfo);

    void remove(DemandInfo demandInfo);

    DemandInfo find(Object id);

    List<DemandInfo> findAll();

    List<DemandInfo> findRange(int[] range);

    int count();
    
}
