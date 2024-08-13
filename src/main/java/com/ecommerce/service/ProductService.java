package com.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Product;
import com.ecommerce.repo.ProductRepository;

@Service
public class ProductService {
	

	    @Autowired
	    private ProductRepository productRepository;

	    public Product saveProduct(Product product) {
	        return productRepository.save(product);
	    }

	    public Optional<Product> getProductById(Long productId) {
	        return productRepository.findById(productId);
	    }

	    public List<Product> getAllProducts() {
	        return productRepository.findAll();
	    }

	    public void deleteProduct(Long productId) {
	        productRepository.deleteById(productId);
	    }

	    public Product updateProduct(Product product) {
	        return productRepository.save(product);
	    }


}
