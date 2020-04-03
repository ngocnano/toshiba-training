package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.model.Order;
import com.model.OrderDetail;

@Repository
public class OrderDetailDAOImpl implements OrderDetailDAO{
	
private static final Logger logger = LoggerFactory.getLogger(OrderDetailDAOImpl.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) 
	{
		this.sessionFactory = sessionFactory;
	}

	public void addOrderDetail(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(orderDetail);
		logger.info("thanh cong " + orderDetail);
	}

	public void updateOrderDetail(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(orderDetail);
		logger.info("Person updated successfully, Person Details=" + orderDetail);
	}

	public void deleteOrderDetail(int idOrder) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();		
		OrderDetail p = (OrderDetail) session.load(OrderDetail.class, new Integer(idOrder));
		if(null != p){
			session.delete(p);
		}
		logger.info("Person deleted successfully, person details="+p);
		
	}

	public OrderDetail getOrderDetail(int idOrder) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();		
		OrderDetail p = (OrderDetail) session.load(OrderDetail.class, new Integer(idOrder));
		logger.info("Customer loaded successfully, Customer details="+p);
		return p;
	}

	@SuppressWarnings("unchecked")
	public List<OrderDetail> listOrderDetail() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<OrderDetail> orderDetailList = session.createQuery("from OrderDetail").list();
		for(OrderDetail c : orderDetailList){
			logger.info("Customer List::"+ c);
		}
		return orderDetailList;
	}

}
