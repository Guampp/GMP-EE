/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.ejb.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author kaciano
 */
@Embeddable
public class DemandInfoPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_demand_priority")
    private long idDemandPriority;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_demand_situation")
    private long idDemandSituation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_demand_type")
    private long idDemandType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_demand")
    private long idDemand;

    public DemandInfoPK() {
    }

    public DemandInfoPK(long idDemandPriority, long idDemandSituation, long idDemandType, long idDemand) {
        this.idDemandPriority = idDemandPriority;
        this.idDemandSituation = idDemandSituation;
        this.idDemandType = idDemandType;
        this.idDemand = idDemand;
    }

    public long getIdDemandPriority() {
        return idDemandPriority;
    }

    public void setIdDemandPriority(long idDemandPriority) {
        this.idDemandPriority = idDemandPriority;
    }

    public long getIdDemandSituation() {
        return idDemandSituation;
    }

    public void setIdDemandSituation(long idDemandSituation) {
        this.idDemandSituation = idDemandSituation;
    }

    public long getIdDemandType() {
        return idDemandType;
    }

    public void setIdDemandType(long idDemandType) {
        this.idDemandType = idDemandType;
    }

    public long getIdDemand() {
        return idDemand;
    }

    public void setIdDemand(long idDemand) {
        this.idDemand = idDemand;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idDemandPriority;
        hash += (int) idDemandSituation;
        hash += (int) idDemandType;
        hash += (int) idDemand;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DemandInfoPK)) {
            return false;
        }
        DemandInfoPK other = (DemandInfoPK) object;
        if (this.idDemandPriority != other.idDemandPriority) {
            return false;
        }
        if (this.idDemandSituation != other.idDemandSituation) {
            return false;
        }
        if (this.idDemandType != other.idDemandType) {
            return false;
        }
        if (this.idDemand != other.idDemand) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.gmp.ejb.entity.DemandInfoPK[ idDemandPriority=" + idDemandPriority + ", idDemandSituation=" + idDemandSituation + ", idDemandType=" + idDemandType + ", idDemand=" + idDemand + " ]";
    }
    
}
