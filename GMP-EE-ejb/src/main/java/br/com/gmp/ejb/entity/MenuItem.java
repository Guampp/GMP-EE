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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kaciano
 */
@Entity
@Table(name = "menu_item")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MenuItem.findAll", query = "SELECT m FROM MenuItem m"),
    @NamedQuery(name = "MenuItem.findById", query = "SELECT m FROM MenuItem m WHERE m.id = :id"),
    @NamedQuery(name = "MenuItem.findByPref", query = "SELECT m FROM MenuItem m WHERE m.pref = :pref"),
    @NamedQuery(name = "MenuItem.findByTitle", query = "SELECT m FROM MenuItem m WHERE m.title = :title"),
    @NamedQuery(name = "MenuItem.findByIco", query = "SELECT m FROM MenuItem m WHERE m.ico = :ico"),
    @NamedQuery(name = "MenuItem.findByItemclass", query = "SELECT m FROM MenuItem m WHERE m.itemclass = :itemclass")})
public class MenuItem implements Serializable {
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
    @Size(max = 75)
    @Column(name = "itemclass")
    private String itemclass;
    @JoinColumn(name = "id_menu", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Menu idMenu;

    public MenuItem() {
    }

    public MenuItem(Long id) {
        this.id = id;
    }

    public MenuItem(Long id, String pref, String title) {
        this.id = id;
        this.pref = pref;
        this.title = title;
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

    public String getItemclass() {
        return itemclass;
    }

    public void setItemclass(String itemclass) {
        this.itemclass = itemclass;
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
        if (!(object instanceof MenuItem)) {
            return false;
        }
        MenuItem other = (MenuItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.gmp.ejb.entity.MenuItem[ id=" + id + " ]";
    }
    
}
