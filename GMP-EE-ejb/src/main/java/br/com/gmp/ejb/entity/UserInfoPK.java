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
public class UserInfoPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_user_type")
    private long idUserType;
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
    @Column(name = "id_profile")
    private long idProfile;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_user_base")
    private long idUserBase;

    public UserInfoPK() {
    }

    public UserInfoPK(long idUserType, long idAddress, long idCompany, long idProfile, long idUserBase) {
        this.idUserType = idUserType;
        this.idAddress = idAddress;
        this.idCompany = idCompany;
        this.idProfile = idProfile;
        this.idUserBase = idUserBase;
    }

    public long getIdUserType() {
        return idUserType;
    }

    public void setIdUserType(long idUserType) {
        this.idUserType = idUserType;
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

    public long getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(long idProfile) {
        this.idProfile = idProfile;
    }

    public long getIdUserBase() {
        return idUserBase;
    }

    public void setIdUserBase(long idUserBase) {
        this.idUserBase = idUserBase;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idUserType;
        hash += (int) idAddress;
        hash += (int) idCompany;
        hash += (int) idProfile;
        hash += (int) idUserBase;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserInfoPK)) {
            return false;
        }
        UserInfoPK other = (UserInfoPK) object;
        if (this.idUserType != other.idUserType) {
            return false;
        }
        if (this.idAddress != other.idAddress) {
            return false;
        }
        if (this.idCompany != other.idCompany) {
            return false;
        }
        if (this.idProfile != other.idProfile) {
            return false;
        }
        if (this.idUserBase != other.idUserBase) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.gmp.ejb.entity.UserInfoPK[ idUserType=" + idUserType + ", idAddress=" + idAddress + ", idCompany=" + idCompany + ", idProfile=" + idProfile + ", idUserBase=" + idUserBase + " ]";
    }
    
}
