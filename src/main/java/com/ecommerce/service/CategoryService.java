package com.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Category;
import com.ecommerce.repo.CategoryRepository;

@Service
public class CategoryService {

	    @Autowired
	    private CategoryRepository categoryRepository;

	    public Category saveCategory(Category category) {
	        return categoryRepository.save(category);
	    }

	    public Optional<Category> getCategoryById(Long categoryId) {
	        return categoryRepository.findById(categoryId);
	    }

	    public List<Category> getAllCategories() {
	        return categoryRepository.findAll();
	    }

	    public void deleteCategory(Long categoryId) {
	        categoryRepository.deleteById(categoryId);
	    }

		public Category updateCategory(Category category) {
			// TODO Auto-generated method stub
			return null;
		}
	}

