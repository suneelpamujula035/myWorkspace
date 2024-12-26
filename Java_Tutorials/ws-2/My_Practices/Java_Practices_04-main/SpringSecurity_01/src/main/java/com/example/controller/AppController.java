package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@RequestMapping("/")
	public String getWelcome()
	{
		return "<h1>Welcome for ALL</h1>";
	}
	
	@RequestMapping("/admin")
	public String getAdmin()
	{
		return "<h1>Welcome Admin api</h1>";
	}
	
	@RequestMapping("/user")
	public String getUser()
	{
		return "<h1>Welcome user api<h1>";
	}
}
