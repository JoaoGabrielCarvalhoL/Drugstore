package br.com.carv.drugstore.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Manufacturer extends AbstractDomain {

	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false, length = 50)
	private String description;
	
	public Manufacturer() {
		
	}
	
	public Manufacturer(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

}
