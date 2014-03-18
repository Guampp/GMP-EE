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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kaciano
 */
@Entity
@Table(name = "profile_item")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProfileItem.findAll", query = "SELECT p FROM ProfileItem p"),
    @NamedQuery(name = "ProfileItem.findById", query = "SELECT p FROM ProfileItem p WHERE p.id = :id"),
    @NamedQuery(name = "ProfileItem.findByCansave", query = "SELECT p FROM ProfileItem p WHERE p.cansave = :cansave"),
    @NamedQuery(name = "ProfileItem.findByCandiscard", query = "SELECT p FROM ProfileItem p WHERE p.candiscard = :candiscard"),
    @NamedQuery(name = "ProfileItem.findByCanprocess", query = "SELECT p FROM ProfileItem p WHERE p.canprocess = :canprocess")})
public class ProfileItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cansave")
    private boolean cansave;
    @Basic(optional = false)
    @NotNull
    @Column(name = "candiscard")
    private boolean candiscard;
    @Basic(optional = false)
    @NotNull
    @Column(name = "canprocess")
    private boolean canprocess;
    @JoinColumn(name = "id_profile", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Profile idProfile;
    @JoinColumn(name = "id_menu", referencedColumnName = "id")
    @OneToOne
    private Menu idMenu;

    public ProfileItem() {
    }

    public ProfileItem(Long id) {
        this.id = id;
    }

    public ProfileItem(Long id, boolean cansave, boolean candiscard, boolean canprocess) {
        this.id = id;
        this.cansave = cansave;
        this.candiscard = candiscard;
        this.canprocess = canprocess;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean getCansave() {
        return cansave;
    }

    public void setCansave(boolean cansave) {
        this.cansave = cansave;
    }

    public boolean getCandiscard() {
        return candiscard;
    }

    public void setCandiscard(boolean candiscard) {
        this.candiscard = candiscard;
    }

    public boolean getCanprocess() {
        return canprocess;
    }

    public void setCanprocess(boolean canprocess) {
        this.canprocess = canprocess;
    }

    public Profile getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(Profile idProfile) {
        this.idProfile = idProfile;
    }

    public Menu getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Menu idMenu) {
        this.idMenu = idMenu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfileItem)) {
            return false;
        }
        ProfileItem other = (ProfileItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.gmp.ejb.entity.ProfileItem[ id=" + id + " ]";
    }
    
}
