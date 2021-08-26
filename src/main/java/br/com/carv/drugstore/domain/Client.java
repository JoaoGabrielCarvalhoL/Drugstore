package br.com.carv.drugstore.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Client extends AbstractDomain {

	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false, length = 50)
	private String nameClient; 
	
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
	
	@JoinColumn(nullable = false)
	@ManyToOne
	private City city;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date registrationDate; 
	
	@Column(nullable = false)
	private Boolean releasedClient;
	
	public Client() {
		
	}

	public Client(String nameClient, String certificatePerson, String recordPerson, String street, String numberHouse,
			String district, String cep, String complement, String telephone, String cellphone, String email, City city,
			Date registrationDate, Boolean releasedClient) {
		super();
		this.nameClient = nameClient;
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
		this.city = city;
		this.registrationDate = registrationDate;
		this.releasedClient = releasedClient;
	}


	public String getNameClient() {
		return nameClient;
	}

	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
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

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Boolean getReleasedClient() {
		return releasedClient;
	}

	public void setReleasedClient(Boolean releasedClient) {
		this.releasedClient = releasedClient;
	}

	public City getCity() {
		return city;
	}
	
	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Client [nameClient=" + nameClient + ", certificatePerson=" + certificatePerson + ", recordPerson="
				+ recordPerson + ", street=" + street + ", numberHouse=" + numberHouse + ", district=" + district
				+ ", cep=" + cep + ", complement=" + complement + ", telephone=" + telephone + ", cellphone="
				+ cellphone + ", email=" + email + ", city=" + city + ", registrationDate=" + registrationDate
				+ ", releasedClient=" + releasedClient + "]";
	}
	
	
	
	
	
}
