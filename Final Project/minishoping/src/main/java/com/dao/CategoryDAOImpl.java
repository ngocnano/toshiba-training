package com.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.model.Category;

@Repository
public class CategoryDAOImpl implements CategoryDao{
	
	
	private static final Logger logger = LoggerFactory.getLogger(CustomerDAOImpl.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) 
	{
		this.sessionFactory = sessionFactory;
	}

	public void addCategory(Category category) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(category);
		logger.info("thanh cong " + category);
	}

	public void updateCategory(Category category) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(category);
		logger.info("Person updated successfully, Person Details=" + category);
	}

	public void deleteCategory(int idCategory) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();		
		Category p = (Category) session.load(Category.class, new Integer(idCategory));
		if(null != p){
			session.delete(p);
		}
		logger.info("Person deleted successfully, person details="+p);
	}

	public Category getCategory(int idCategory) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();		
		Category p = (Category) session.load(Category.class, new Integer(idCategory));
		logger.info("Customer loaded successfully, Customer details="+p);
		return p;
	}

	@SuppressWarnings("unchecked")
	public List<Category> listCategory() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Category> categoryList = session.createQuery("from Category").list();
		for(Category c : categoryList){
			logger.info("Category List::"+ c);
		}
		return categoryList;
	}

}
