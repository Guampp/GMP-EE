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
@Table(name = "company_info")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompanyInfo.findAll", query = "SELECT c FROM CompanyInfo c"),
    @NamedQuery(name = "CompanyInfo.findByActive", query = "SELECT c FROM CompanyInfo c WHERE c.active = :active"),
    @NamedQuery(name = "CompanyInfo.findByPhone", query = "SELECT c FROM CompanyInfo c WHERE c.phone = :phone"),
    @NamedQuery(name = "CompanyInfo.findByTpcomp", query = "SELECT c FROM CompanyInfo c WHERE c.tpcomp = :tpcomp"),
    @NamedQuery(name = "CompanyInfo.findByNmbcomp", query = "SELECT c FROM CompanyInfo c WHERE c.nmbcomp = :nmbcomp"),
    @NamedQuery(name = "CompanyInfo.findByEmail", query = "SELECT c FROM CompanyInfo c WHERE c.email = :email"),
    @NamedQuery(name = "CompanyInfo.findByAvt", query = "SELECT c FROM CompanyInfo c WHERE c.avt = :avt"),
    @NamedQuery(name = "CompanyInfo.findByDtreg", query = "SELECT c FROM CompanyInfo c WHERE c.dtreg = :dtreg"),
    @NamedQuery(name = "CompanyInfo.findByDtmod", query = "SELECT c FROM CompanyInfo c WHERE c.dtmod = :dtmod"),
    @NamedQuery(name = "CompanyInfo.findByIdAddress", query = "SELECT c FROM CompanyInfo c WHERE c.companyInfoPK.idAddress = :idAddress"),
    @NamedQuery(name = "CompanyInfo.findByIdCompany", query = "SELECT c FROM CompanyInfo c WHERE c.companyInfoPK.idCompany = :idCompany"),
    @NamedQuery(name = "CompanyInfo.findByIdCompanyType", query = "SELECT c FROM CompanyInfo c WHERE c.companyInfoPK.idCompanyType = :idCompanyType")})
public class CompanyInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CompanyInfoPK companyInfoPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "active")
    private boolean active;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Formato de telefone/fax inválido, deve ser xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 14)
    @Column(name = "phone")
    private String phone;
    @Column(name = "tpcomp")
    private Character tpcomp;
    @Size(max = 14)
    @Column(name = "nmbcomp")
    private String nmbcomp;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 96)
    @Column(name = "email")
    private String email;
    @Size(max = 64)
    @Column(name = "avt")
    private String avt;
    @Column(name = "dtreg")
    @Temporal(TemporalType.DATE)
    private Date dtreg;
    @Column(name = "dtmod")
    @Temporal(TemporalType.DATE)
    private Date dtmod;
    @JoinColumn(name = "id_company_type", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CompanyType companyType;
    @JoinColumn(name = "id_company", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Company company;
    @JoinColumn(name = "id_address", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Address address;

    public CompanyInfo() {
    }

    public CompanyInfo(CompanyInfoPK companyInfoPK) {
        this.companyInfoPK = companyInfoPK;
    }

    public CompanyInfo(CompanyInfoPK companyInfoPK, boolean active) {
        this.companyInfoPK = companyInfoPK;
        this.active = active;
    }

    public CompanyInfo(long idAddress, long idCompany, long idCompanyType) {
        this.companyInfoPK = new CompanyInfoPK(idAddress, idCompany, idCompanyType);
    }

    public CompanyInfoPK getCompanyInfoPK() {
        return companyInfoPK;
    }

    public void setCompanyInfoPK(CompanyInfoPK companyInfoPK) {
        this.companyInfoPK = companyInfoPK;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Character getTpcomp() {
        return tpcomp;
    }

    public void setTpcomp(Character tpcomp) {
        this.tpcomp = tpcomp;
    }

    public String getNmbcomp() {
        return nmbcomp;
    }

    public void setNmbcomp(String nmbcomp) {
        this.nmbcomp = nmbcomp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvt() {
        return avt;
    }

    public void setAvt(String avt) {
        this.avt = avt;
    }

    public Date getDtreg() {
        return dtreg;
    }

    public void setDtreg(Date dtreg) {
        this.dtreg = dtreg;
    }

    public Date getDtmod() {
        return dtmod;
    }

    public void setDtmod(Date dtmod) {
        this.dtmod = dtmod;
    }

    public CompanyType getCompanyType() {
        return companyType;
    }

    public void setCompanyType(CompanyType companyType) {
        this.companyType = companyType;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (companyInfoPK != null ? companyInfoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompanyInfo)) {
            return false;
        }
        CompanyInfo other = (CompanyInfo) object;
        if ((this.companyInfoPK == null && other.companyInfoPK != null) || (this.companyInfoPK != null && !this.companyInfoPK.equals(other.companyInfoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.gmp.ejb.entity.CompanyInfo[ companyInfoPK=" + companyInfoPK + " ]";
    }
    
}
