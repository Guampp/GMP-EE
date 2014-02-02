/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.ejb.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kaciano
 */
@Entity
@Table(name = "profile_access")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProfileAccess.findAll", query = "SELECT p FROM ProfileAccess p"),
    @NamedQuery(name = "ProfileAccess.findByPage", query = "SELECT p FROM ProfileAccess p WHERE p.page = :page"),
    @NamedQuery(name = "ProfileAccess.findByIdProfile", query = "SELECT p FROM ProfileAccess p WHERE p.idProfile = :idProfile")})
public class ProfileAccess implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 64)
    @Column(name = "page")
    private String page;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_profile")
    private Long idProfile;
    @JoinColumn(name = "id_profile", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Profile profile;

    public ProfileAccess() {
    }

    public ProfileAccess(Long idProfile) {
        this.idProfile = idProfile;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public Long getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(Long idProfile) {
        this.idProfile = idProfile;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProfile != null ? idProfile.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfileAccess)) {
            return false;
        }
        ProfileAccess other = (ProfileAccess) object;
        if ((this.idProfile == null && other.idProfile != null) || (this.idProfile != null && !this.idProfile.equals(other.idProfile))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.gmp.ejb.entity.ProfileAccess[ idProfile=" + idProfile + " ]";
    }
    
}
