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
@Table(name = "menu_item")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MenuItem.findAll", query = "SELECT m FROM MenuItem m"),
    @NamedQuery(name = "MenuItem.findById", query = "SELECT m FROM MenuItem m WHERE m.id = :id"),
    @NamedQuery(name = "MenuItem.findByTitle", query = "SELECT m FROM MenuItem m WHERE m.title = :title"),
    @NamedQuery(name = "MenuItem.findByIco", query = "SELECT m FROM MenuItem m WHERE m.ico = :ico"),
    @NamedQuery(name = "MenuItem.findByIdMenu", query = "SELECT m FROM MenuItem m WHERE m.idMenu = :idMenu")})
public class MenuItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private long id;
    @Size(max = 64)
    @Column(name = "title")
    private String title;
    @Size(max = 64)
    @Column(name = "ico")
    private String ico;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_menu")
    private Long idMenu;
    @JoinColumn(name = "id_menu", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Menu menu;

    public MenuItem() {
    }

    public MenuItem(Long idMenu) {
        this.idMenu = idMenu;
    }

    public MenuItem(Long idMenu, long id) {
        this.idMenu = idMenu;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Long getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Long idMenu) {
        this.idMenu = idMenu;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMenu != null ? idMenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MenuItem)) {
            return false;
        }
        MenuItem other = (MenuItem) object;
        if ((this.idMenu == null && other.idMenu != null) || (this.idMenu != null && !this.idMenu.equals(other.idMenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.gmp.ejb.entity.MenuItem[ idMenu=" + idMenu + " ]";
    }
    
}
