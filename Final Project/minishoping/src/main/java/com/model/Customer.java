package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@Column(name = "id_customer")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCustomer;
	@NotNull
	@Column(name = "customer_name")
	private String customerName;
	
	public Customer() 
	{
		
	}

	public Customer(Integer idCustomer, String customerName) {
		super();
		this.idCustomer = idCustomer;
		this.customerName = customerName;
	}

	public Integer getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(Integer idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
