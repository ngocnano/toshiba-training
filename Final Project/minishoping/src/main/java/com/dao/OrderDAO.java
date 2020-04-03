package com.dao;

import java.util.List;

import com.model.Order;

public interface OrderDAO {
	
	public Order getOrder(int idOrder);
	public void addOrder(Order order);
	public void updateOrder(Order order);
	public void deleteOrder(int idOrder);
	public List<Order> listOrder();

}
