package com.service;

import java.util.List;

import com.model.Order;

public interface OrderService {

	public Order getOrder(int idOrder);
	public void addOrder(Order order);
	public void updateOrder(Order order);
	public void deleteOrder(int idOrder);
	public List<Order> listOrder();
}
