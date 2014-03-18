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
@Table(name = "company_info")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompanyInfo.findAll", query = "SELECT c FROM CompanyInfo c"),
    @NamedQuery(name = "CompanyInfo.findById", query = "SELECT c FROM CompanyInfo c WHERE c.id = :id"),
    @NamedQuery(name = "CompanyInfo.findByActive", query = "SELECT c FROM CompanyInfo c WHERE c.active = :active"),
    @NamedQuery(name = "CompanyInfo.findByPhone", query = "SELECT c FROM CompanyInfo c WHERE c.phone = :phone"),
    @NamedQuery(name = "CompanyInfo.findByTpcomp", query = "SELECT c FROM CompanyInfo c WHERE c.tpcomp = :tpcomp"),
    @NamedQuery(name = "CompanyInfo.findByNmbcomp", query = "SELECT c FROM CompanyInfo c WHERE c.nmbcomp = :nmbcomp"),
    @NamedQuery(name = "CompanyInfo.findByEmail", query = "SELECT c FROM CompanyInfo c WHERE c.email = :email"),
    @NamedQuery(name = "CompanyInfo.findByAvt", query = "SELECT c FROM CompanyInfo c WHERE c.avt = :avt"),
    @NamedQuery(name = "CompanyInfo.findByDtreg", query = "SELECT c FROM CompanyInfo c WHERE c.dtreg = :dtreg"),
    @NamedQuery(name = "CompanyInfo.findByDtmod", query = "SELECT c FROM CompanyInfo c WHERE c.dtmod = :dtmod")})
public class CompanyInfo implements Serializable {
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
    @JoinColumn(name = "id_company_type", referencedColumnName = "id")
    @OneToOne
    private CompanyType idCompanyType;
    @JoinColumn(name = "id_company", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Company idCompany;
    @JoinColumn(name = "id_address", referencedColumnName = "id")
    @OneToOne
    private Address idAddress;

    public CompanyInfo() {
    }

    public CompanyInfo(Long id) {
        this.id = id;
    }

    public CompanyInfo(Long id, boolean active) {
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

    public CompanyType getIdCompanyType() {
        return idCompanyType;
    }

    public void setIdCompanyType(CompanyType idCompanyType) {
        this.idCompanyType = idCompanyType;
    }

    public Company getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Company idCompany) {
        this.idCompany = idCompany;
    }

    public Address getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Address idAddress) {
        this.idAddress = idAddress;
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
        if (!(object instanceof CompanyInfo)) {
            return false;
        }
        CompanyInfo other = (CompanyInfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.gmp.ejb.entity.CompanyInfo[ id=" + id + " ]";
    }
    
}
