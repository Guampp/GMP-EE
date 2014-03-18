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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kaciano
 */
@Entity
@Table(name = "address")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Address.findAll", query = "SELECT a FROM Address a"),
    @NamedQuery(name = "Address.findById", query = "SELECT a FROM Address a WHERE a.id = :id"),
    @NamedQuery(name = "Address.findByStreet", query = "SELECT a FROM Address a WHERE a.street = :street"),
    @NamedQuery(name = "Address.findByNbhood", query = "SELECT a FROM Address a WHERE a.nbhood = :nbhood"),
    @NamedQuery(name = "Address.findByNumber", query = "SELECT a FROM Address a WHERE a.number = :number"),
    @NamedQuery(name = "Address.findByCity", query = "SELECT a FROM Address a WHERE a.city = :city"),
    @NamedQuery(name = "Address.findBySt", query = "SELECT a FROM Address a WHERE a.st = :st"),
    @NamedQuery(name = "Address.findByPCode", query = "SELECT a FROM Address a WHERE a.pCode = :pCode"),
    @NamedQuery(name = "Address.findByCompl", query = "SELECT a FROM Address a WHERE a.compl = :compl"),
    @NamedQuery(name = "Address.findByCountry", query = "SELECT a FROM Address a WHERE a.country = :country")})
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 64)
    @Column(name = "street")
    private String street;
    @Size(max = 64)
    @Column(name = "nbhood")
    private String nbhood;
    @Size(max = 5)
    @Column(name = "number")
    private String number;
    @Size(max = 64)
    @Column(name = "city")
    private String city;
    @Size(max = 2)
    @Column(name = "st")
    private String st;
    @Size(max = 10)
    @Column(name = "p_code")
    private String pCode;
    @Size(max = 255)
    @Column(name = "compl")
    private String compl;
    @Size(max = 64)
    @Column(name = "country")
    private String country;
    @OneToOne(mappedBy = "idAddress")
    private UserInfo userInfo;
    @OneToOne(mappedBy = "idAddress")
    private CompanyInfo companyInfo;

    public Address() {
    }

    public Address(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNbhood() {
        return nbhood;
    }

    public void setNbhood(String nbhood) {
        this.nbhood = nbhood;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getPCode() {
        return pCode;
    }

    public void setPCode(String pCode) {
        this.pCode = pCode;
    }

    public String getCompl() {
        return compl;
    }

    public void setCompl(String compl) {
        this.compl = compl;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public CompanyInfo getCompanyInfo() {
        return companyInfo;
    }

    public void setCompanyInfo(CompanyInfo companyInfo) {
        this.companyInfo = companyInfo;
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
        if (!(object instanceof Address)) {
            return false;
        }
        Address other = (Address) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.gmp.ejb.entity.Address[ id=" + id + " ]";
    }
    
}
