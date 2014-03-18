/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.ejb.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kaciano
 */
@Entity
@Table(name = "demand_info")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DemandInfo.findAll", query = "SELECT d FROM DemandInfo d"),
    @NamedQuery(name = "DemandInfo.findById", query = "SELECT d FROM DemandInfo d WHERE d.id = :id"),
    @NamedQuery(name = "DemandInfo.findByActive", query = "SELECT d FROM DemandInfo d WHERE d.active = :active"),
    @NamedQuery(name = "DemandInfo.findByNotes", query = "SELECT d FROM DemandInfo d WHERE d.notes = :notes"),
    @NamedQuery(name = "DemandInfo.findByAccomplished", query = "SELECT d FROM DemandInfo d WHERE d.accomplished = :accomplished"),
    @NamedQuery(name = "DemandInfo.findByTimeSpent", query = "SELECT d FROM DemandInfo d WHERE d.timeSpent = :timeSpent"),
    @NamedQuery(name = "DemandInfo.findByDtmod", query = "SELECT d FROM DemandInfo d WHERE d.dtmod = :dtmod")})
public class DemandInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "active")
    private boolean active;
    @Size(max = 512)
    @Column(name = "notes")
    private String notes;
    @Column(name = "accomplished")
    private Short accomplished;
    @Column(name = "time_spent")
    private Short timeSpent;
    @Column(name = "dtmod")
    @Temporal(TemporalType.DATE)
    private Date dtmod;
    @JoinColumn(name = "id_user_base", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private UserBase idUserBase;
    @JoinColumn(name = "id_demand_type", referencedColumnName = "id")
    @OneToOne
    private DemandType idDemandType;
    @JoinColumn(name = "id_demand_situation", referencedColumnName = "id")
    @OneToOne
    private DemandSituation idDemandSituation;
    @JoinColumn(name = "id_demand_priority", referencedColumnName = "id")
    @OneToOne
    private DemandPriority idDemandPriority;
    @JoinColumn(name = "id_demand", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Demand idDemand;

    public DemandInfo() {
    }

    public DemandInfo(Long id) {
        this.id = id;
    }

    public DemandInfo(Long id, boolean active) {
        this.id = id;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Short getAccomplished() {
        return accomplished;
    }

    public void setAccomplished(Short accomplished) {
        this.accomplished = accomplished;
    }

    public Short getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(Short timeSpent) {
        this.timeSpent = timeSpent;
    }

    public Date getDtmod() {
        return dtmod;
    }

    public void setDtmod(Date dtmod) {
        this.dtmod = dtmod;
    }

    public UserBase getIdUserBase() {
        return idUserBase;
    }

    public void setIdUserBase(UserBase idUserBase) {
        this.idUserBase = idUserBase;
    }

    public DemandType getIdDemandType() {
        return idDemandType;
    }

    public void setIdDemandType(DemandType idDemandType) {
        this.idDemandType = idDemandType;
    }

    public DemandSituation getIdDemandSituation() {
        return idDemandSituation;
    }

    public void setIdDemandSituation(DemandSituation idDemandSituation) {
        this.idDemandSituation = idDemandSituation;
    }

    public DemandPriority getIdDemandPriority() {
        return idDemandPriority;
    }

    public void setIdDemandPriority(DemandPriority idDemandPriority) {
        this.idDemandPriority = idDemandPriority;
    }

    public Demand getIdDemand() {
        return idDemand;
    }

    public void setIdDemand(Demand idDemand) {
        this.idDemand = idDemand;
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
        if (!(object instanceof DemandInfo)) {
            return false;
        }
        DemandInfo other = (DemandInfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.gmp.ejb.entity.DemandInfo[ id=" + id + " ]";
    }
    
}
