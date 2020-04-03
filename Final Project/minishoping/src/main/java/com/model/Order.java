package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "orders") 
public class Order {

	@Id
	@Column(name = "id_order")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idOrder;
	@NotNull
	private String date;
	@NotNull
	@Column(name = "id_customer")
	private Integer idCustomer;
	@NotNull
	private Integer totalmoney;
	
	public Order() {
		super();
	}
	
	public Order(Integer idOrder, String date, Integer idCustomer, Integer totalmoney) {
		super();
		this.idOrder = idOrder;
		this.date = date;
		this.idCustomer = idCustomer;
		this.totalmoney = totalmoney;
	}

	public Integer getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(Integer idOrder) {
		this.idOrder = idOrder;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(Integer idCustomer) {
		this.idCustomer = idCustomer;
	}

	public Integer getTotalmoney() {
		return totalmoney;
	}

	public void setTotalmoney(Integer totalmoney) {
		this.totalmoney = totalmoney;
	}

	@Override
	public String toString() {
		return "Order [idOrder=" + idOrder + ", date=" + date + ", idCustomer=" + idCustomer + ", totalmoney="
				+ totalmoney + "]";
	}
	
	
	
}
