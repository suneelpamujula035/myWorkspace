package com.home.mycafe.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeControllers {

	@RequestMapping("/cafe")
	public String showWelcomPage(Model model)
	{
		//sending data to view (jsp page)
		
		String myName = "Suneel Kumar";
		
		model.addAttribute("myNameValue", myName);
		model.addAttribute("myWebsiteTitle", "MOM'S CAFE");
		return "welcome-page";
	}
	
	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest request, Model model)
	{
		String userEnteredValue = request.getParameter("foodType");
		model.addAttribute("userEnteredValue", userEnteredValue);

		return "process-order";
	}
}
