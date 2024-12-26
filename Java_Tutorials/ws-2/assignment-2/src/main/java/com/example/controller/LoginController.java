package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/myCustomLogin")
	public String customLogin()
	{
		return "login";
	}
	
	@GetMapping("/home")//secure page
	public String helloWorld()
	{
		return "home";
	}
}
