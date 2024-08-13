package com.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
		    @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    private Long userId;
		    
		    @Column(nullable = false, unique = true)
		    private String username;
		    
		    @Column(nullable = false, unique = true)
		    private String email;
		    
		    @Column(nullable = false)
		    private String passwordHash;
		    
		    @Column(nullable = false, unique = true)
		    private String phoneNumber;
		    
		    @Column(nullable = false)
		    private String role;

			public Long getUserId() {
				return userId;
			}

			public void setUserId(Long userId) {
				this.userId = userId;
			}

			public String getUsername() {
				return username;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getPasswordHash() {
				return passwordHash;
			}

			public void setPasswordHash(String passwordHash) {
				this.passwordHash = passwordHash;
			}

			public String getPhoneNumber() {
				return phoneNumber;
			}

			public void setPhoneNumber(String phoneNumber) {
				this.phoneNumber = phoneNumber;
			}

			public String getRole() {
				return role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public static Object withUsername(String string) {
				// TODO Auto-generated method stub
				return null;
			}
	          
		   
		}




