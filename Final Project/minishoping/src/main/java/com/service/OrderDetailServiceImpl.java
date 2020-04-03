package com.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.dao.OrderDetailDAO;
import com.model.OrderDetail;

public class OrderDetailServiceImpl implements OrderDetailService{
	
	private OrderDetailDAO orderDetailDAO;
	
	@Transactional
	public void setOrderDetailDAO(OrderDetailDAO orderDetailDAO) {
		this.orderDetailDAO = orderDetailDAO;
	}

	@Transactional
	public OrderDetail getOrderDetail(int idOrder) {
		// TODO Auto-generated method stub
		return this.orderDetailDAO.getOrderDetail(idOrder);
	}

	@Transactional
	public void addOrderDetail(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		this.orderDetailDAO.addOrderDetail(orderDetail);
	}

	@Transactional
	public void updateOrderDetail(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		this.orderDetailDAO.updateOrderDetail(orderDetail);
	}

	@Transactional
	public void deleteOrderDetail(int idOrder) {
		// TODO Auto-generated method stub
		this.orderDetailDAO.deleteOrderDetail(idOrder);
	}

	@Transactional
	public List<OrderDetail> listOrderDetail() {
		// TODO Auto-generated method stub
		return this.orderDetailDAO.listOrderDetail();
	}

}
