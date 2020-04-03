package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.model.Order;

@Repository
public class OrderDAOImpl implements OrderDAO{

	private static final Logger logger = LoggerFactory.getLogger(OrderDAOImpl.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) 
	{
		this.sessionFactory = sessionFactory;
	}

	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(order);
		logger.info("thanh cong " + order);
	}

	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(order);
		logger.info("Person updated successfully, Person Details=" + order);
	}

	public void deleteOrder(int idOrder) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();		
		Order p = (Order) session.load(Order.class, new Integer(idOrder));
		if(null != p){
			session.delete(p);
		}
		logger.info("Person deleted successfully, person details="+p);
		
	}

	public Order getOrder(int idOrder) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();		
		Order p = (Order) session.load(Order.class, new Integer(idOrder));
		logger.info("Customer loaded successfully, Customer details="+p);
		return p;
	}

	@SuppressWarnings("unchecked")
	public List<Order> listOrder() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Order> listOrder = session.createQuery("from Order").list();
		for(Order c : listOrder){
			logger.info("Order List::"+ c);
		}
		return listOrder;
	}

}
