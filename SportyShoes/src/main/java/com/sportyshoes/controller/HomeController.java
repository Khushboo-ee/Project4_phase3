package com.sportyshoes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	//Requesting home-page of the site
	@GetMapping("/home")
	public String homePage() {
		System.out.println("Home page....");
		return "home";
	}
	
	//redirecting to admin login page
	@GetMapping("/admin")
	public String AdminLogin() {
		System.out.println("Admin login page...");
		return "admin";
	}
	
}
