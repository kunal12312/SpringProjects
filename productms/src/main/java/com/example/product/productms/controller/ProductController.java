package com.example.product.productms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.productms.model.Product;

@RestController
@RequestMapping(value = "/productms/api")
public class ProductController {
	
	@Autowired
	ProductService productSvc;
	
	@GetMapping("/product/{productId}")
	public Product getProduct(@RequestParam("username") String name, @PathVariable("productId") String id){
	
		
		productSvc.printProductName(name); 
		
		Product product = new Product();
		product.setName(name);
		product.setId(id);
		
		return product;
	}
	
	
	@PostMapping("/createProduct")
	public String createProduct(){
	
		
		
		System.out.println("Record created");
		
		
		return "Record created";
	}
	

}
