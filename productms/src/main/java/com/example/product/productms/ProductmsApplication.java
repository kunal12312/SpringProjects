package com.example.product.productms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ProductmsApplication {

	public static void main(String[] args) {
		System.out.println("Context loadingmmm");
		SpringApplication.run(ProductmsApplication.class, args);
		
		System.out.println("Context loading");
	}

}
