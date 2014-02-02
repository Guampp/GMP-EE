/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.ejb.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author kaciano
 */
@Embeddable
public class CompanyInfoPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_address")
    private long idAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_company")
    private long idCompany;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_company_type")
    private long idCompanyType;

    public CompanyInfoPK() {
    }

    public CompanyInfoPK(long idAddress, long idCompany, long idCompanyType) {
        this.idAddress = idAddress;
        this.idCompany = idCompany;
        this.idCompanyType = idCompanyType;
    }

    public long getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(long idAddress) {
        this.idAddress = idAddress;
    }

    public long getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(long idCompany) {
        this.idCompany = idCompany;
    }

    public long getIdCompanyType() {
        return idCompanyType;
    }

    public void setIdCompanyType(long idCompanyType) {
        this.idCompanyType = idCompanyType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idAddress;
        hash += (int) idCompany;
        hash += (int) idCompanyType;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompanyInfoPK)) {
            return false;
        }
        CompanyInfoPK other = (CompanyInfoPK) object;
        if (this.idAddress != other.idAddress) {
            return false;
        }
        if (this.idCompany != other.idCompany) {
            return false;
        }
        if (this.idCompanyType != other.idCompanyType) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.gmp.ejb.entity.CompanyInfoPK[ idAddress=" + idAddress + ", idCompany=" + idCompany + ", idCompanyType=" + idCompanyType + " ]";
    }
    
}
