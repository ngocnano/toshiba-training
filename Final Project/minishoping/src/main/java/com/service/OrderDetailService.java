package com.service;

import java.util.List;

import com.model.OrderDetail;

public interface OrderDetailService {
	public OrderDetail getOrderDetail(int idOrderDetail);
	public void addOrderDetail(OrderDetail orderDetail);
	public void updateOrderDetail(OrderDetail orderDetail);
	public void deleteOrderDetail(int idOrderDetail);
	public List<OrderDetail> listOrderDetail();
}
