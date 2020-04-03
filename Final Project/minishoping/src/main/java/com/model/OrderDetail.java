package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "orderdetail")
public class OrderDetail {

	@Id
	@Column(name = "id_order")
	private Integer idOrder;
	@NotNull
	@Column(name = "id_product")
	private Integer idProduct;
	@NotNull
	private Integer quantity;
	
	
	public OrderDetail() {
		super();
	}


	public OrderDetail(Integer idOrder, Integer idProduct, Integer quantity) {
		super();
		this.idOrder = idOrder;
		this.idProduct = idProduct;
		this.quantity = quantity;
	}


	public Integer getIdOrder() {
		return idOrder;
	}


	public void setIdOrder(Integer idOrder) {
		this.idOrder = idOrder;
	}


	public Integer getIdProduct() {
		return idProduct;
	}


	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	
}
