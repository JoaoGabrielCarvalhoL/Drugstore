package br.com.carv.drugstore.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity 
public class ItemSale extends AbstractDomain{

	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	private Integer amountItem; 
	
	@Column(nullable = false, precision = 10, scale = 2)
	private BigDecimal priceUnit; 
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Product product; 
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Employee employee;
	
	public ItemSale() {
		
	}

	public ItemSale(Integer amountItem, BigDecimal priceUnit, Product product, Employee employee) {
		super();
		this.amountItem = amountItem;
		this.priceUnit = priceUnit;
		this.product = product;
		this.employee = employee;
	}

	public Integer getAmountItem() {
		return amountItem;
	}

	public void setAmountItem(Integer amountItem) {
		this.amountItem = amountItem;
	}

	public BigDecimal getPriceUnit() {
		return priceUnit;
	}

	public void setPriceUnit(BigDecimal priceUnit) {
		this.priceUnit = priceUnit;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "ItemSale [amountItem=" + amountItem + ", priceUnit=" + priceUnit + ", product=" + product
				+ ", employee=" + employee + "]";
	}
	
	



}
