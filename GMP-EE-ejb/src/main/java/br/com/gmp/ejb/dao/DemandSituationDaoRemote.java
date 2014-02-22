/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.ejb.dao;

import br.com.gmp.ejb.entity.DemandSituation;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author kaciano
 */
@Remote
public interface DemandSituationDaoRemote {

    void create(DemandSituation demandSituation);

    void edit(DemandSituation demandSituation);

    void remove(DemandSituation demandSituation);

    DemandSituation find(Object id);

    List<DemandSituation> findAll();

    List<DemandSituation> findRange(int[] range);

    int count();
    
}
