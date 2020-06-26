package com.simplilearn.ecomapi.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.ecomapi.model.Products;

@RestController
public class ProductController {
	
	public List<Products> getProductsList(){
		List<Products> list = new ArrayList<>();
		list.add(new Products(100,"Iphone 11","The phone",new Date(),new Date(),new Date()));
		list.add(new Products(101,"Car","The Best Car",new Date(),new Date(),new Date()));
		list.add(new Products(102,"Grinder","The Grinder",new Date(),new Date(),new Date()));
		list.add(new Products(103,"Lenovo Laptop","The Laptop",new Date(),new Date(),new Date()));
		return list;
	}
	
	@GetMapping("/products")
	public List<Products>displayAllProducts() {
		return getProductsList();
	}
	
	@GetMapping("/products/{id}")
	public Products displayProduct(@PathVariable("id") int id) {
		for(Products pr : getProductsList()) {
			if(pr.getId() ==id) {
				return pr;
			}
		}
		return null;
	}
	
	@GetMapping("/product")
	public Products displayProductByName(@PathParam("name") String name) {
		for(Products pr : getProductsList()) {
			if(pr.getName().equals(name)) {
				return pr;
			}
		}
		return null;
	}
	
	@PostMapping("/products")
	public List addProduct(@RequestBody Products product ) {
		List products = getProductsList();		
		products.add(product);
		return products;
	}
	
	@PutMapping("/products")
	public List<Products> updateProduct(@RequestBody Products product ) {
		List<Products> products = getProductsList();
		for(int i=0; i<products.size(); i++) {
			if(products.get(i).getId() == product.getId()) {
				products.set(i, product);
			}
		}
		return products;
	}
	
	@DeleteMapping("/products/{id}")
	public List<Products> removeProduct(@PathVariable("id") int id) {
		List<Products> products = getProductsList();
		for(int i=0; i<products.size(); i++) {
			if(products.get(i).getId() == id) {
				products.remove(i);
				return products;
			}
		}
		return null;
	}
}
