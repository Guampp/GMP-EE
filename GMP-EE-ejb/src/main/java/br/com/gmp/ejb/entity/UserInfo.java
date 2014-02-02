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
@Table(name = "user_info")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserInfo.findAll", query = "SELECT u FROM UserInfo u"),
    @NamedQuery(name = "UserInfo.findByActive", query = "SELECT u FROM UserInfo u WHERE u.active = :active"),
    @NamedQuery(name = "UserInfo.findByLogin", query = "SELECT u FROM UserInfo u WHERE u.login = :login"),
    @NamedQuery(name = "UserInfo.findByPass", query = "SELECT u FROM UserInfo u WHERE u.pass = :pass"),
    @NamedQuery(name = "UserInfo.findByUserName", query = "SELECT u FROM UserInfo u WHERE u.userName = :userName"),
    @NamedQuery(name = "UserInfo.findByPhone", query = "SELECT u FROM UserInfo u WHERE u.phone = :phone"),
    @NamedQuery(name = "UserInfo.findByEmail", query = "SELECT u FROM UserInfo u WHERE u.email = :email"),
    @NamedQuery(name = "UserInfo.findByAvt", query = "SELECT u FROM UserInfo u WHERE u.avt = :avt"),
    @NamedQuery(name = "UserInfo.findByDtmod", query = "SELECT u FROM UserInfo u WHERE u.dtmod = :dtmod"),
    @NamedQuery(name = "UserInfo.findByIdUserType", query = "SELECT u FROM UserInfo u WHERE u.userInfoPK.idUserType = :idUserType"),
    @NamedQuery(name = "UserInfo.findByIdAddress", query = "SELECT u FROM UserInfo u WHERE u.userInfoPK.idAddress = :idAddress"),
    @NamedQuery(name = "UserInfo.findByIdCompany", query = "SELECT u FROM UserInfo u WHERE u.userInfoPK.idCompany = :idCompany"),
    @NamedQuery(name = "UserInfo.findByIdProfile", query = "SELECT u FROM UserInfo u WHERE u.userInfoPK.idProfile = :idProfile"),
    @NamedQuery(name = "UserInfo.findByIdUserBase", query = "SELECT u FROM UserInfo u WHERE u.userInfoPK.idUserBase = :idUserBase")})
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UserInfoPK userInfoPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "active")
    private boolean active;
    @Size(max = 64)
    @Column(name = "login")
    private String login;
    @Size(max = 255)
    @Column(name = "pass")
    private String pass;
    @Size(max = 64)
    @Column(name = "user_name")
    private String userName;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Formato de telefone/fax inválido, deve ser xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 14)
    @Column(name = "phone")
    private String phone;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 96)
    @Column(name = "email")
    private String email;
    @Size(max = 64)
    @Column(name = "avt")
    private String avt;
    @Column(name = "dtmod")
    @Temporal(TemporalType.DATE)
    private Date dtmod;
    @JoinColumn(name = "id_user_type", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private UserType userType;
    @JoinColumn(name = "id_user_base", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private UserBase userBase;
    @JoinColumn(name = "id_profile", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Profile profile;
    @JoinColumn(name = "id_company", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Company company;
    @JoinColumn(name = "id_address", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Address address;

    public UserInfo() {
    }

    public UserInfo(UserInfoPK userInfoPK) {
        this.userInfoPK = userInfoPK;
    }

    public UserInfo(UserInfoPK userInfoPK, boolean active) {
        this.userInfoPK = userInfoPK;
        this.active = active;
    }

    public UserInfo(long idUserType, long idAddress, long idCompany, long idProfile, long idUserBase) {
        this.userInfoPK = new UserInfoPK(idUserType, idAddress, idCompany, idProfile, idUserBase);
    }

    public UserInfoPK getUserInfoPK() {
        return userInfoPK;
    }

    public void setUserInfoPK(UserInfoPK userInfoPK) {
        this.userInfoPK = userInfoPK;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public Date getDtmod() {
        return dtmod;
    }

    public void setDtmod(Date dtmod) {
        this.dtmod = dtmod;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public UserBase getUserBase() {
        return userBase;
    }

    public void setUserBase(UserBase userBase) {
        this.userBase = userBase;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
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
        hash += (userInfoPK != null ? userInfoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserInfo)) {
            return false;
        }
        UserInfo other = (UserInfo) object;
        if ((this.userInfoPK == null && other.userInfoPK != null) || (this.userInfoPK != null && !this.userInfoPK.equals(other.userInfoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.gmp.ejb.entity.UserInfo[ userInfoPK=" + userInfoPK + " ]";
    }
    
}
