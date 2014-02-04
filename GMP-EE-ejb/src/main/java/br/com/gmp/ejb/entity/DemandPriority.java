/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.ejb.entity;

import java.io.Serializable;
import java.util.List;
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
@Table(name = "demand_priority")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DemandPriority.findAll", query = "SELECT d FROM DemandPriority d"),
    @NamedQuery(name = "DemandPriority.findById", query = "SELECT d FROM DemandPriority d WHERE d.id = :id"),
    @NamedQuery(name = "DemandPriority.findByTitle", query = "SELECT d FROM DemandPriority d WHERE d.title = :title")})
public class DemandPriority implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 255)
    @Column(name = "title")
    private String title;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "demandPriority")
    private List<DemandInfo> demandInfoList;

    public DemandPriority() {
    }

    public DemandPriority(Long id) {
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
    public List<DemandInfo> getDemandInfoList() {
        return demandInfoList;
    }

    public void setDemandInfoList(List<DemandInfo> demandInfoList) {
        this.demandInfoList = demandInfoList;
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
        if (!(object instanceof DemandPriority)) {
            return false;
        }
        DemandPriority other = (DemandPriority) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.gmp.ejb.entity.DemandPriority[ id=" + id + " ]";
    }
    
}
