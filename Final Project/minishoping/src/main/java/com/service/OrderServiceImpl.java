package com.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.dao.OrderDAO;
import com.model.Order;


public class OrderServiceImpl implements OrderService{

	private OrderDAO orderDAO;

	@Transactional
	public void setOrderDAO(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}

	@Transactional
	public Order getOrder(int idOrder) {
		// TODO Auto-generated method stub
		return this.orderDAO.getOrder(idOrder);
	}

	@Transactional
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		this.orderDAO.addOrder(order);
	}

	@Transactional
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		this.orderDAO.updateOrder(order);
	}

	@Transactional
	public void deleteOrder(int idOrder) {
		// TODO Auto-generated method stub
		this.orderDAO.deleteOrder(idOrder);
	}

	@Transactional
	public List<Order> listOrder() {
		// TODO Auto-generated method stub
		return this.orderDAO.listOrder();
	}


}
