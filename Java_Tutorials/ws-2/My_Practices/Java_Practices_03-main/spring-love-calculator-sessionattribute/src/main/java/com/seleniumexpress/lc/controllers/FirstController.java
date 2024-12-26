package com.seleniumexpress.lc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({"firstName","lastName"})
public class FirstController {

	@RequestMapping("/first")
	public String handlingMethod1(Model model, HttpServletRequest request)
	{
		model.addAttribute("firstName", "Suneel");
		model.addAttribute("lastName", "Kumar");

		model.addAttribute("next", "second");
		
		HttpSession session = request.getSession();
		session.setAttribute("address", "Banglore");
		return "index";
	}
	
	@RequestMapping("/second")
	public String handlingMethod2(Model model1)//SessionStatus status
	{
		String firstName = (String) model1.getAttribute("firstName");
		System.out.println(firstName);
		String lastName = (String) model1.getAttribute("lastName");
		System.out.println(lastName);
		
		model1.addAttribute("next", "third");
		
		//removing the session attributes from the session scope
		//status.setComplete();

		return "index";
	}
	
	@RequestMapping("/third")
	public String handlingMethod3(Model model2, HttpSession session , SessionStatus status)//SessionStatus status ---- Used for stopping specific handler method
	{
		String lastName = (String) model2.getAttribute("firstName");
		System.out.println("Third request : fetching from model "+lastName);
		
		model2.addAttribute("next", "normalMethod");
		status.setComplete();
		
		String address = (String) session.getAttribute("address");
		String newAddress = address + " Home Sweet Home";
		model2.addAttribute("address", newAddress);
		
		return "index";
	}
}
