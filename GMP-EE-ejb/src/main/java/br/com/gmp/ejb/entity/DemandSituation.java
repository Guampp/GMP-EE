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
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author kaciano
 */
@Entity
@Table(name = "demand_situation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DemandSituation.findAll", query = "SELECT d FROM DemandSituation d"),
    @NamedQuery(name = "DemandSituation.findById", query = "SELECT d FROM DemandSituation d WHERE d.id = :id"),
    @NamedQuery(name = "DemandSituation.findByTitle", query = "SELECT d FROM DemandSituation d WHERE d.title = :title")})
public class DemandSituation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 255)
    @Column(name = "title")
    private String title;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "demandSituation")
    private Collection<DemandInfo> demandInfoCollection;

    public DemandSituation() {
    }

    public DemandSituation(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DemandSituation)) {
            return false;
        }
        DemandSituation other = (DemandSituation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.gmp.ejb.entity.DemandSituation[ id=" + id + " ]";
    }
    
}
