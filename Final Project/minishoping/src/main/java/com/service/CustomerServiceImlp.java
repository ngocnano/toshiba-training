package com.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.dao.CustomerDAO;
import com.model.Customer;

public class CustomerServiceImlp implements CustomerService{
	
	private CustomerDAO customerDAO;
	
	@Transactional
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		this.customerDAO.addCustomer(customer);
		
	}
	@Transactional
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		this.customerDAO.updateCustomer(customer);
	}
	@Transactional
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		this.customerDAO.deleteCustomer(id);
	}
	@Transactional
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomer(id);
	}
	@Transactional
	public List<Customer> listCustomer() {
		// TODO Auto-generated method stub
		return customerDAO.listCustomer();
	}
	@Transactional
	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

}
