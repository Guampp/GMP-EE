/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.ejb.beans;

import br.com.gmp.ejb.entity.CompanyInfo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author kaciano
 */
@Local
public interface CompanyInfoFacadeLocal {

    void create(CompanyInfo companyInfo);

    void edit(CompanyInfo companyInfo);

    void remove(CompanyInfo companyInfo);

    CompanyInfo find(Object id);

    List<CompanyInfo> findAll();

    List<CompanyInfo> findRange(int[] range);

    int count();
    
}
