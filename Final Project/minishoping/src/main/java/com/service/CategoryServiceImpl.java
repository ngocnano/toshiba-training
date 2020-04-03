package com.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.dao.CategoryDao;
import com.model.Category;

public class CategoryServiceImpl implements CategoryService{
	
	private CategoryDao categoryDAO;

	@Transactional
	public void setCategoryDAO(CategoryDao categoryDAO) {
		this.categoryDAO = categoryDAO;
	}
    
	@Transactional
	public void addCategory(Category category) {
		// TODO Auto-generated method stub
		this.categoryDAO.addCategory(category);
	}

	@Transactional
	public void updateCategory(Category category) {
		// TODO Auto-generated method stub
		this.categoryDAO.updateCategory(category);
	}

	@Transactional
	public void deleteCategory(int idCategory) {
		// TODO Auto-generated method stub
		this.categoryDAO.deleteCategory(idCategory);
	}

	@Transactional
	public Category getCategory(int idCategory) {
		// TODO Auto-generated method stub
		return this.categoryDAO.getCategory(idCategory);
	}

	@Transactional
	public List<Category> listCategory() {
		// TODO Auto-generated method stub
		return this.categoryDAO.listCategory();
	}

}
