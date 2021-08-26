package br.com.carv.drugstore.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class City extends AbstractDomain {

	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false, length = 50)
	private String nameCity; 
	
	@JoinColumn(nullable = false)
	@ManyToOne
	private State state;
	
	public City() {
		
	}
	
	public City(String nameCity) {
		this.nameCity = nameCity;
	}
	
	public String getNameCity() {
		return nameCity;
	}
	
	public void setNameCity(String nameCity) {
		this.nameCity = nameCity;
	}
	
	public State getState() {
		return state;
	}
	
	public void setState(State state) {
		this.state = state;
	}

}
