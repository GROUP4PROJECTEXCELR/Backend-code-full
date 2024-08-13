package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	    @Autowired
	    private ProductService productService;

	    @PreAuthorize("hasRole('ADMIN')")
	    @PostMapping
	    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
	        Product savedProduct = productService.saveProduct(product);
	        return ResponseEntity.ok(savedProduct);
	    }

	    @GetMapping
	    public ResponseEntity<List<Product>> getAllProducts() {
	        List<Product> products = productService.getAllProducts();
	        return ResponseEntity.ok(products);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
	        java.util.Optional<Product> product = productService.getProductById(id);
	        return product.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	    }

	    @PreAuthorize("hasRole('ADMIN')")
	    @PutMapping("/{id}")
	    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product) {
	        product.setProductId(id);
	        Product updatedProduct = productService.updateProduct(product);
	        return ResponseEntity.ok(updatedProduct);
	    }

	    @PreAuthorize("hasRole('ADMIN')")
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
	        productService.deleteProduct(id);
	        return ResponseEntity.noContent().build();
	    }
	}


