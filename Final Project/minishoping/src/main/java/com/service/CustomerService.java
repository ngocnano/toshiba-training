package com.service;

import java.util.List;

import com.model.Customer;

public interface CustomerService {
	
	public void addCustomer(Customer customer);
	public void updateCustomer(Customer customer);
	public void deleteCustomer(int id);
	public Customer getCustomer(int id);
	public List<Customer> listCustomer();

}
