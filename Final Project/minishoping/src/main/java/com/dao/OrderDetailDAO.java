package com.dao;

import java.util.List;

import com.model.OrderDetail;

public interface OrderDetailDAO {
	
	public OrderDetail getOrderDetail(int idOrder);
	public void addOrderDetail(OrderDetail orderDetail);
	public void updateOrderDetail(OrderDetail orderDetail);
	public void deleteOrderDetail(int idOrder);
	public List<OrderDetail> listOrderDetail();

}
