package com.example.product.productms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductUIController {
	
	@RequestMapping("/home")
	public ModelAndView home(){
		return new ModelAndView("product");
	}

}
