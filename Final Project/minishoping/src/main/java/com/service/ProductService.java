package com.service;

import java.util.List;

import com.model.Product;

public interface ProductService {
	
	public Product getProduct(int idProduct);
	public void addProduct(Product product);
	public void updateProduct(Product product);
	public void deleteProduct(int idProduct);
	public List<Product> listProduct();

}
