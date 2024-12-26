package com.telusko.demo;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {

	@RequestMapping("/home")
	public String showHomePage()
	{
		System.out.println("showHomePage handler method");
		return "home";
	}
}
