package br.com.carv.drugstore.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class User extends AbstractDomain{

	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false, length = 50)
	private String nameUser; 
	
	@Column(nullable = false, length = 15)
	private String certificatePerson; 
	
	@Column(nullable = false, length = 12)
	private String recordPerson; 
	
	@Column(nullable = false, length = 30)
	private String street; 
	
	@Column(nullable = false)
	private String numberHouse; 
	
	@Column(nullable = false)
	private String district; 
	
	@Column(nullable = false, length = 10)
	private String cep; 
	
	@Column(nullable = true)
	private String complement; 
	
	@Column(nullable = true)
	private String telephone;
	
	@Column(nullable = false)
	private String cellphone; 
	
	@Column(nullable = false, length = 30)
	private String email; 
	
	@Column(nullable = false, length = 32)
	private String passwordUser; 

	@Column(nullable = false)
	private Boolean isActive;
	
	@Column(nullable = false)
	private Character type;
	
	@JoinColumn(nullable = false)
	@ManyToOne
	private City city;
	
	public User() {
		
	}

	public User(String nameUser, String certificatePerson, String recordPerson, String street, String numberHouse,
			String district, String cep, String complement, String telephone, String cellphone, String email,
			String passwordUser, Boolean isActive, City city, Character type) {
		super();
		this.nameUser = nameUser;
		this.certificatePerson = certificatePerson;
		this.recordPerson = recordPerson;
		this.street = street;
		this.numberHouse = numberHouse;
		this.district = district;
		this.cep = cep;
		this.complement = complement;
		this.telephone = telephone;
		this.cellphone = cellphone;
		this.email = email;
		this.passwordUser = passwordUser;
		this.isActive = isActive;
		this.city = city;
		this.type = type;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getCertificatePerson() {
		return certificatePerson;
	}

	public void setCertificatePerson(String certificatePerson) {
		this.certificatePerson = certificatePerson;
	}

	public String getRecordPerson() {
		return recordPerson;
	}

	public void setRecordPerson(String recordPerson) {
		this.recordPerson = recordPerson;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumberHouse() {
		return numberHouse;
	}

	public void setNumberHouse(String numberHouse) {
		this.numberHouse = numberHouse;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswordUser() {
		return passwordUser;
	}

	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	public Character getType() {
		return type;
	}
	
	public void setType(Character type) {
		this.type = type;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "User [nameUser=" + nameUser + ", certificatePerson=" + certificatePerson + ", recordPerson="
				+ recordPerson + ", street=" + street + ", numberHouse=" + numberHouse + ", district=" + district
				+ ", cep=" + cep + ", complement=" + complement + ", telephone=" + telephone + ", cellphone="
				+ cellphone + ", email=" + email + ", passwordUser=" + passwordUser + ", isActive=" + isActive
				+ ", type=" + type + ", city=" + city + "]";
	}


	
	

}
