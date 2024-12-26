package com.seleniumexpress.lc.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {

	@RequestMapping("/normalMethod")
	public String handlingMethod3 (Model model, HttpSession session)
	{
		//String lastName = (String) model2.getAttribute("firstName");
		
//		String newFirstName = "Mr "+ firstName;
//		model.addAttribute("firstName", newFirstName);
//		System.out.println("Inside new controller method , Printing first name   "+newFirstName);
		
		String address = (String) session.getAttribute("address");
		String newAddress = address + " Nellore";
		model.addAttribute("address", newAddress);
		
		session.invalidate();
		
		return "index";
	}
}
