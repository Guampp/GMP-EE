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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
    @NamedQuery(name = "DemandInfo.findByActive", query = "SELECT d FROM DemandInfo d WHERE d.active = :active"),
    @NamedQuery(name = "DemandInfo.findByNotes", query = "SELECT d FROM DemandInfo d WHERE d.notes = :notes"),
    @NamedQuery(name = "DemandInfo.findByAccomplished", query = "SELECT d FROM DemandInfo d WHERE d.accomplished = :accomplished"),
    @NamedQuery(name = "DemandInfo.findByTimeSpent", query = "SELECT d FROM DemandInfo d WHERE d.timeSpent = :timeSpent"),
    @NamedQuery(name = "DemandInfo.findByDtmod", query = "SELECT d FROM DemandInfo d WHERE d.dtmod = :dtmod"),
    @NamedQuery(name = "DemandInfo.findByIdDemandPriority", query = "SELECT d FROM DemandInfo d WHERE d.demandInfoPK.idDemandPriority = :idDemandPriority"),
    @NamedQuery(name = "DemandInfo.findByIdDemandSituation", query = "SELECT d FROM DemandInfo d WHERE d.demandInfoPK.idDemandSituation = :idDemandSituation"),
    @NamedQuery(name = "DemandInfo.findByIdDemandType", query = "SELECT d FROM DemandInfo d WHERE d.demandInfoPK.idDemandType = :idDemandType"),
    @NamedQuery(name = "DemandInfo.findByIdDemand", query = "SELECT d FROM DemandInfo d WHERE d.demandInfoPK.idDemand = :idDemand")})
public class DemandInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DemandInfoPK demandInfoPK;
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
    @JoinColumn(name = "id_demand_type", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DemandType demandType;
    @JoinColumn(name = "id_demand_situation", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DemandSituation demandSituation;
    @JoinColumn(name = "id_demand_priority", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DemandPriority demandPriority;
    @JoinColumn(name = "id_demand", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Demand demand;

    public DemandInfo() {
    }

    public DemandInfo(DemandInfoPK demandInfoPK) {
        this.demandInfoPK = demandInfoPK;
    }

    public DemandInfo(DemandInfoPK demandInfoPK, boolean active) {
        this.demandInfoPK = demandInfoPK;
        this.active = active;
    }

    public DemandInfo(long idDemandPriority, long idDemandSituation, long idDemandType, long idDemand) {
        this.demandInfoPK = new DemandInfoPK(idDemandPriority, idDemandSituation, idDemandType, idDemand);
    }

    public DemandInfoPK getDemandInfoPK() {
        return demandInfoPK;
    }

    public void setDemandInfoPK(DemandInfoPK demandInfoPK) {
        this.demandInfoPK = demandInfoPK;
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

    public DemandType getDemandType() {
        return demandType;
    }

    public void setDemandType(DemandType demandType) {
        this.demandType = demandType;
    }

    public DemandSituation getDemandSituation() {
        return demandSituation;
    }

    public void setDemandSituation(DemandSituation demandSituation) {
        this.demandSituation = demandSituation;
    }

    public DemandPriority getDemandPriority() {
        return demandPriority;
    }

    public void setDemandPriority(DemandPriority demandPriority) {
        this.demandPriority = demandPriority;
    }

    public Demand getDemand() {
        return demand;
    }

    public void setDemand(Demand demand) {
        this.demand = demand;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (demandInfoPK != null ? demandInfoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DemandInfo)) {
            return false;
        }
        DemandInfo other = (DemandInfo) object;
        if ((this.demandInfoPK == null && other.demandInfoPK != null) || (this.demandInfoPK != null && !this.demandInfoPK.equals(other.demandInfoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.gmp.ejb.entity.DemandInfo[ demandInfoPK=" + demandInfoPK + " ]";
    }
    
}
