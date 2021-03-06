/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.ejb.beans;

import br.com.gmp.ejb.entity.CompanyType;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author kaciano
 */
@Remote
public interface CompanyTypeFacadeRemote {

    void create(CompanyType companyType);

    void edit(CompanyType companyType);

    void remove(CompanyType companyType);

    CompanyType find(Object id);

    List<CompanyType> findAll();

    List<CompanyType> findRange(int[] range);

    int count();
    
}
