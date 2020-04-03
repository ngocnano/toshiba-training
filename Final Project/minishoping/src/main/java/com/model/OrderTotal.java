package com.model;

import javax.validation.constraints.NotNull;

public class OrderTotal {
	
	private Integer idOrder;
	@NotNull
	private String date;
	@NotNull
	private Integer idCustomer;
	@NotNull
	private Integer idProduct;
	
	private Integer totalMoney;
	@NotNull
	private Integer quantity;
	public OrderTotal() {
		// TODO Auto-generated constructor stub
	}

	
	public OrderTotal(String date, Integer idCustomer) {
		super();
		this.date = date;
		this.idCustomer = idCustomer;
	}


	public OrderTotal(Order order, OrderDetail orderDetail) 
	{
		this.idOrder = order.getIdOrder();
		this.date = order.getDate();
		this.idCustomer = order.getIdCustomer();
		this.idProduct = orderDetail.getIdProduct();
		this.totalMoney = order.getTotalmoney();
		this.quantity = orderDetail.getQuantity();
	}
	
	public OrderTotal(String date) {
		super();
		this.date = date;
	}

	public OrderTotal(int idOrder, String date, int idCustomer, int idProduct, int totalMoney, int quantity) {
		super();
		this.idOrder = idOrder;
		this.date = date;
		this.idCustomer = idCustomer;
		this.idProduct = idProduct;
		this.totalMoney = totalMoney;
		this.quantity = quantity;
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

	public Integer getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}

	public Integer getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(Integer totalMoney) {
		this.totalMoney = totalMoney;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "OrderTotal [idOrder=" + idOrder + ", date=" + date + ", idCustomer=" + idCustomer + ", idProduct="
				+ idProduct + ", totalMoney=" + totalMoney + ", quantity=" + quantity + "]";
	}

   
	
	

}
