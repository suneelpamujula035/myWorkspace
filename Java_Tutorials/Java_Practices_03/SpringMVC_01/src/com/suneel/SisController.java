package com.suneel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")//This is class level RequestMapping
public class SisController {

	@ResponseBody
	@RequestMapping("/makeupkit")//This is method level RequestMapping
	public String giveSugar()
	{
		return "just take makeup kit";
	}
	
	@ResponseBody
	@RequestMapping("/book")
	public String getBooks()
	{
		System.out.println("This is getBooks()..");
		return "Maths books";
	}
	
	@ResponseBody
	@RequestMapping("/bag")
	public String getBag()
	{
		return "Here is your bag";
	}
}
