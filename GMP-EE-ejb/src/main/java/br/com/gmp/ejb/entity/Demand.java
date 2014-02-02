/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.ejb.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author kaciano
 */
@Entity
@Table(name = "demand")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Demand.findAll", query = "SELECT d FROM Demand d"),
    @NamedQuery(name = "Demand.findById", query = "SELECT d FROM Demand d WHERE d.id = :id"),
    @NamedQuery(name = "Demand.findByFather", query = "SELECT d FROM Demand d WHERE d.father = :father"),
    @NamedQuery(name = "Demand.findByTitle", query = "SELECT d FROM Demand d WHERE d.title = :title")})
public class Demand implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "father")
    private BigInteger father;
    @Size(max = 255)
    @Column(name = "title")
    private String title;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "demand")
    private Collection<DemandInfo> demandInfoCollection;
    @JoinColumn(name = "id_user_base", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private UserBase idUserBase;

    public Demand() {
    }

    public Demand(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigInteger getFather() {
        return father;
    }

    public void setFather(BigInteger father) {
        this.father = father;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @XmlTransient
    public Collection<DemandInfo> getDemandInfoCollection() {
        return demandInfoCollection;
    }

    public void setDemandInfoCollection(Collection<DemandInfo> demandInfoCollection) {
        this.demandInfoCollection = demandInfoCollection;
    }

    public UserBase getIdUserBase() {
        return idUserBase;
    }

    public void setIdUserBase(UserBase idUserBase) {
        this.idUserBase = idUserBase;
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
        if (!(object instanceof Demand)) {
            return false;
        }
        Demand other = (Demand) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.gmp.ejb.entity.Demand[ id=" + id + " ]";
    }
    
}
