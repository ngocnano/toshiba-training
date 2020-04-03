package com.service;

import java.util.List;
import com.model.Category;

public interface CategoryService {
	
	public void addCategory(Category category);
	public void updateCategory(Category category);
	public void deleteCategory(int idCategory);
	public Category getCategory(int idCategory);
	public List<Category> listCategory();

}
