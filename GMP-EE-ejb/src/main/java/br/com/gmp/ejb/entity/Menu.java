/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.ejb.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author kaciano
 */
@Entity
@Table(name = "menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Menu.findAll", query = "SELECT m FROM Menu m"),
    @NamedQuery(name = "Menu.findById", query = "SELECT m FROM Menu m WHERE m.id = :id"),
    @NamedQuery(name = "Menu.findByPref", query = "SELECT m FROM Menu m WHERE m.pref = :pref"),
    @NamedQuery(name = "Menu.findByTitle", query = "SELECT m FROM Menu m WHERE m.title = :title"),
    @NamedQuery(name = "Menu.findByIco", query = "SELECT m FROM Menu m WHERE m.ico = :ico"),
    @NamedQuery(name = "Menu.findByFather", query = "SELECT m FROM Menu m WHERE m.father = :father"),
    @NamedQuery(name = "Menu.findByAccesslevel", query = "SELECT m FROM Menu m WHERE m.accesslevel = :accesslevel")})
public class Menu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "pref")
    private String pref;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "title")
    private String title;
    @Size(max = 64)
    @Column(name = "ico")
    private String ico;
    @Basic(optional = false)
    @NotNull
    @Column(name = "father")
    private int father;
    @Basic(optional = false)
    @NotNull
    @Column(name = "accesslevel")
    private int accesslevel;
    @OneToOne(mappedBy = "idMenu")
    private ProfileItem profileItem;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMenu")
    private Collection<MenuItem> menuItemCollection;

    public Menu() {
    }

    public Menu(Long id) {
        this.id = id;
    }

    public Menu(Long id, String pref, String title, int father, int accesslevel) {
        this.id = id;
        this.pref = pref;
        this.title = title;
        this.father = father;
        this.accesslevel = accesslevel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPref() {
        return pref;
    }

    public void setPref(String pref) {
        this.pref = pref;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIco() {
        return ico;
    }

    public void setIco(String ico) {
        this.ico = ico;
    }

    public int getFather() {
        return father;
    }

    public void setFather(int father) {
        this.father = father;
    }

    public int getAccesslevel() {
        return accesslevel;
    }

    public void setAccesslevel(int accesslevel) {
        this.accesslevel = accesslevel;
    }

    public ProfileItem getProfileItem() {
        return profileItem;
    }

    public void setProfileItem(ProfileItem profileItem) {
        this.profileItem = profileItem;
    }

    @XmlTransient
    public Collection<MenuItem> getMenuItemCollection() {
        return menuItemCollection;
    }

    public void setMenuItemCollection(Collection<MenuItem> menuItemCollection) {
        this.menuItemCollection = menuItemCollection;
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
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.gmp.ejb.entity.Menu[ id=" + id + " ]";
    }
    
}
