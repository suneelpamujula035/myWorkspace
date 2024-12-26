package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String WelcomeAll()
	{
		return "Welcome All api";
	}
	
	@RequestMapping("/admin")
	public String WelcomeAdmin()
	{
		return "Welcome Admin api";
	}
	
	@RequestMapping("/user")
	public String WelcomeUser()
	{
		return "Welcome User api";
	}
}
