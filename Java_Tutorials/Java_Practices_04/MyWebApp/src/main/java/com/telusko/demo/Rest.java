package com.telusko.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.service.WelcomeService;

@RestController
public class Rest {

	@Autowired
	private WelcomeService welcomeService;
	
	@RequestMapping("/rest")
	public String helloRest()
	{
		System.out.println("Inside Rest Controller>>>>>>>>>");
		return welcomeService.retrieveWelcomeMessage();
	}
	
}
