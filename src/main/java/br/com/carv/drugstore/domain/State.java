package br.com.carv.drugstore.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class State extends AbstractDomain {

	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false, length = 30)
	private String nameState; 
	@Column(nullable = false, length = 2)
	private String acronymsState;
	
	
	public State() {
		
	}
	
	public State(String nameState, String acronymsState) {
		this.nameState = nameState;
		this.acronymsState = acronymsState;
	}
	
	public String getNameState() {
		return nameState;
	}
	
	public void setNameState(String nameState) {
		this.nameState = nameState;
	}
	
	public String getAcronymsState() {
		return acronymsState;
	}
	
	public void setAcronymsState(String acronymsState) {
		this.acronymsState = acronymsState;
	}
	


}
