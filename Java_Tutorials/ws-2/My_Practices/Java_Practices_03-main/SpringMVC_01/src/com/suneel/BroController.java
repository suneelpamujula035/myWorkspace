package com.suneel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BroController {

	//@ResponseBody
//	@RequestMapping("/cricketbat")
//	public String giveCricketBatr()
//	{
//		return "/WEB-INF/view/MRFCricketbat.jsp";
//	}
	
	@RequestMapping("/cricketbat")
	public String giveCricketBatr()
	{
		return "MRFCricketbat";
	}
	
	
}
