package com.simplilearn.ecomapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping(value="",method= RequestMethod.GET)
	public String showMessage() {
		return "Welcome to Ecom App";
	}
	
	@GetMapping("/home")
	public String showMessage2() {
		return "Welcome Once Again";
	}
	
}


// The @restcontroller annotation is used to dfined the Restful web services
// IT is a combination @Controller + @ResponseBody


// @RequestMapping() : IT is used to defined the Request URI to 
//access the Rest Endpoint  