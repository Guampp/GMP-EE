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
@Table(name = "user_base")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserBase.findAll", query = "SELECT u FROM UserBase u"),
    @NamedQuery(name = "UserBase.findById", query = "SELECT u FROM UserBase u WHERE u.id = :id"),
    @NamedQuery(name = "UserBase.findByLogin", query = "SELECT u FROM UserBase u WHERE u.login = :login")})
public class UserBase implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 64)
    @Column(name = "login")
    private String login;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userBase")
    private List<UserInfo> userInfoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUserBase")
    private List<DemandInfo> demandInfoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUserBase")
    private List<Demand> demandList;

    public UserBase() {
    }

    public UserBase(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @XmlTransient
    public List<UserInfo> getUserInfoList() {
        return userInfoList;
    }

    public void setUserInfoList(List<UserInfo> userInfoList) {
        this.userInfoList = userInfoList;
    }

    @XmlTransient
    public List<DemandInfo> getDemandInfoList() {
        return demandInfoList;
    }

    public void setDemandInfoList(List<DemandInfo> demandInfoList) {
        this.demandInfoList = demandInfoList;
    }

    @XmlTransient
    public List<Demand> getDemandList() {
        return demandList;
    }

    public void setDemandList(List<Demand> demandList) {
        this.demandList = demandList;
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
        if (!(object instanceof UserBase)) {
            return false;
        }
        UserBase other = (UserBase) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.gmp.ejb.entity.UserBase[ id=" + id + " ]";
    }
    
}
