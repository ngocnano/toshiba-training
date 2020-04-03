package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(CustomerDAOImpl.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) 
	{
		this.sessionFactory = sessionFactory;
	}

	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(customer);
		logger.info("thanh cong " + customer);
	}

	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(customer);
		logger.info("Person updated successfully, Person Details=" + customer);
	}

	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();		
		Customer p = (Customer) session.load(Customer.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Person deleted successfully, person details="+p);
		
	}

	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();		
		Customer p = (Customer) session.load(Customer.class, new Integer(id));
		logger.info("Customer loaded successfully, Customer details="+p);
		return p;
	}

	@SuppressWarnings("unchecked")
	public List<Customer> listCustomer() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Customer> customerList = session.createQuery("from Customer").list();
		for(Customer c : customerList){
			logger.info("Customer List::"+ c);
		}
		return customerList;
	}

}
