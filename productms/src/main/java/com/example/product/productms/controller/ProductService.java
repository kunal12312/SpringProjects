package com.example.product.productms.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	public void printProductName(String productName){
		System.out.println("Product - " + productName);
	}

}
