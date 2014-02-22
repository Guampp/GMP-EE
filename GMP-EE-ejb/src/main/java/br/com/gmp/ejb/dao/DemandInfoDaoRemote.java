/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.ejb.dao;

import br.com.gmp.ejb.entity.DemandInfo;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author kaciano
 */
@Remote
public interface DemandInfoDaoRemote {

    void create(DemandInfo demandInfo);

    void edit(DemandInfo demandInfo);

    void remove(DemandInfo demandInfo);

    DemandInfo find(Object id);

    List<DemandInfo> findAll();

    List<DemandInfo> findRange(int[] range);

    int count();
    
}
