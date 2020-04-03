package com.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(ProductDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) 
	{
		this.sessionFactory = sessionFactory;
	}
	
	public Product getProduct(int idProduct) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Product product = (Product) session.load(Product.class, new Integer(idProduct));
		logger.info("Customer loaded successfully, Customer details=" + product);
		return product;
	}

	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(product);
	}

	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(product);
	}

	public void deleteProduct(int idProduct) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Product product = (Product) session.load(Product.class, new Integer(idProduct));
		if(null != product){
			session.delete(product);
		}
		logger.info("Person deleted successfully, person details=" + product);
	}

	@SuppressWarnings("unchecked")
	public List<Product> listProduct() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> productList = session.createQuery("from Product").list();
		for(Product c : productList){
			logger.info("Customer List::"+ c);
		}
		return productList;
	}

	}

