package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/")
	public String getWelcome()
	{
		return "Welcome to ALL api";
	}
	
	@RequestMapping("/user")
	public String getUserWelcome()
	{
		return "Welcome to USER api";
	}
	
	@RequestMapping("/admin")
	public String getAdminWelcome()
	{
		return "Welcome to ADMIN api";
	}
}
