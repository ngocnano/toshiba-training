package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "category")
public class Category {
	
	@Id
	@Column(name = "id_category")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCategory;
	@NotNull
	@Column(name = "category_name")
	private String categoryName;
	
	public Category(Integer idCategory, String categoryName) {
		super();
		this.idCategory = idCategory;
		this.categoryName = categoryName;
	}

	public Category() {
		super();
	}

	public Integer getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Integer idCategory) {
		this.idCategory = idCategory;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
	

}
