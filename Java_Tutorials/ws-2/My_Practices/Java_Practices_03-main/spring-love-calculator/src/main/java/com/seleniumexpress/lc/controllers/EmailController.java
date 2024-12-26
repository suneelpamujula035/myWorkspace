package com.seleniumexpress.lc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.seleniumexpress.lc.service.LCAppEmailServiceImpl;
import com.selniumexpress.lc.api.EmailDTO;
import com.selniumexpress.lc.api.UserInfoDTO;

@Controller
public class EmailController {

	@Autowired
	private LCAppEmailServiceImpl lcAppEmailService;
	
	
	@RequestMapping("/send-email-page")
	public String sendEmail(Model model)//@CookieValue("lcApp.userName") String userName
	{
		//model.addAttribute("userName",userName);
		//model.addAttribute("emailDTO", new EmailDTO());
		//model.addAttribute("userName",userName.toUpperCase());
		return "send-email-page";
	}
	
	@RequestMapping("/email-success")
	public String processEmail(@SessionAttribute("userInfo") UserInfoDTO userInfoDTO, @ModelAttribute("emailDTO") EmailDTO emailDTO)
	{
		try
		{
		lcAppEmailService.sendEmail(userInfoDTO.getUserName() ,emailDTO.getUserEmail(), userInfoDTO.getResult());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
//		String userName = (String) session.getAttribute("userName");
//		String newuserName = "Mr "+userName;
//		model.addAttribute("userName", newuserName);
		return "email-success";
	}
}

