package br.com.carv.drugstore.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Sale extends AbstractDomain{

	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date saleTime; 
	
	@Column(nullable = false, precision = 10, scale = 2)
	private BigDecimal totalValueSale;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Client client; 
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Employee employee;
	
	public Sale() {
		
	}
	
	public Sale(Date saleTime, BigDecimal totalValueSale, Client client, Employee employee) {
		this.saleTime = saleTime;
		this.totalValueSale = totalValueSale;
		this.client = client;
		this.employee = employee;
	}

	public Date getSaleTime() {
		return saleTime;
	}

	public void setSaleTime(Date saleTime) {
		this.saleTime = saleTime;
	}

	public BigDecimal getTotalValueSale() {
		return totalValueSale;
	}

	public void setTotalValueSale(BigDecimal totalValueSale) {
		this.totalValueSale = totalValueSale;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Sale [saleTime=" + saleTime + ", totalValueSale=" + totalValueSale + ", client=" + client
				+ ", employee=" + employee + "]";
	}
	
	

}
