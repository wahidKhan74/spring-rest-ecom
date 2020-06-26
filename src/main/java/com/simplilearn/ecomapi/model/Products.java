package com.simplilearn.ecomapi.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Products {
	//properties
	private int id;
	private String name;
	private String description;
	private Date createdAt;
	private Date purchasedAt;
	private Date expiresAt;
	
	//no arg constructor
	public Products(){ }
	
	// constructor with feilds
	public Products(int id, String name, String description, Date createdAt, Date purchasedAt, Date expiresAt) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.createdAt = createdAt;
		this.purchasedAt = purchasedAt;
		this.expiresAt = expiresAt;
	}
	
	//getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getPurchasedAt() {
		return purchasedAt;
	}
	public void setPurchasedAt(Date purchasedAt) {
		this.purchasedAt = purchasedAt;
	}
	public Date getExpiresAt() {
		return expiresAt;
	}
	public void setExpiresAt(Date expiresAt) {
		this.expiresAt = expiresAt;
	}
	
	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", description=" + description + ", createdAt=" + createdAt
				+ ", purchasedAt=" + purchasedAt + ", expiresAt=" + expiresAt + "]";
	}
	
	
	
}
