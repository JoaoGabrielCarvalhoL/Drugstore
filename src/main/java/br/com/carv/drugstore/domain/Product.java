package br.com.carv.drugstore.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
 

@Entity
public class Product extends AbstractDomain{

	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false, length = 100)
	private String description; 
	
	@Column(nullable = false)
	private Integer amountProduct; 
	
	@Column(nullable = false, precision = 10, scale = 2)
	private BigDecimal priceProduct; 
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Manufacturer manufacturer;
	
	public Product() {
		
	}
	
	public Product(String description, Integer amountProduct, BigDecimal priceProduct) {
		this.description = description;
		this.amountProduct = amountProduct;
		this.priceProduct = priceProduct;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getAmountProduct() {
		return amountProduct;
	}
	
	public void setAmountProduct(Integer amountProduct) {
		this.amountProduct = amountProduct;
	}
	
	public BigDecimal getPriceProduct() {
		return priceProduct;
	}
	
	public void setPriceProduct(BigDecimal priceProduct) {
		this.priceProduct = priceProduct;
	}
	
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Product [description=" + description + ", amountProduct=" + amountProduct + ", priceProduct="
				+ priceProduct + ", manufacturer=" + manufacturer + "]";
	}

	
}
