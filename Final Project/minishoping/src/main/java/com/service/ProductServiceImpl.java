package com.service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import com.dao.ProductDAO;
import com.model.Product;

public class ProductServiceImpl implements ProductService{
	
	private ProductDAO productDAO;

	@Transactional
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	@Transactional
	public Product getProduct(int idProduct) {
		// TODO Auto-generated method stub
		return productDAO.getProduct(idProduct);
	}
    
	@Transactional
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		this.productDAO.addProduct(product);
	}

	@Transactional
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		this.productDAO.updateProduct(product);
		
	}

	@Transactional
	public void deleteProduct(int idProduct) {
		// TODO Auto-generated method stub
		this.productDAO.deleteProduct(idProduct);
	}

	@Transactional
	public List<Product> listProduct() {
		// TODO Auto-generated method stub
		return this.productDAO.listProduct();
	}

}
