package com.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="categories")
public class Category {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long categoryId;

	    @Column(nullable = false, unique = true)
	    private String name;

	    private String description;

	    @ManyToOne
	    @JoinColumn(name = "admin_id", nullable = false)
	    private User admin;

	    // Getters and Setters
	    public Long getCategoryId() {
	        return categoryId;
	    }

	    public void setCategoryId(Long categoryId) {
	        this.categoryId = categoryId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public User getAdmin() {
	        return admin;
	    }

	    public void setAdmin(User admin) {
	        this.admin = admin;
	    }
	}


