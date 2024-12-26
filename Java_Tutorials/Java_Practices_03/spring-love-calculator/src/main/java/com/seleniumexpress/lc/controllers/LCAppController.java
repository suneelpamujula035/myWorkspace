package com.seleniumexpress.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.seleniumexpress.lc.service.LCAppService;
import com.selniumexpress.lc.api.UserInfoDTO;

@Controller
@SessionAttributes("userInfo")//ModelAttribute and SessionAttribute name should be same
public class LCAppController {

	@Autowired
	private LCAppService lcappService;
	
	@RequestMapping("/")
	public String showHomepage(Model model)//For creating object and setting model object parameter
	{
		model.addAttribute("userInfo", new UserInfoDTO());
//		Cookie[] cookies = request.getCookies();
//		for(Cookie temp : cookies)
//		{
//			if("lcApp.userName".equals(temp.getName()))
//			{
//				String myUserName = temp.getValue();
//				userInfoDTO.setUserName(myUserName);
//			}
//		}
		return "home-page";
	}
	
	@RequestMapping("/result-page")
	public String showResultPage(Model model , @Valid UserInfoDTO userInfoDTO, BindingResult result)//We can also give different parameter names----(@RequestParam("userName") String userName5)
	{
		model.addAttribute("userInfo", userInfoDTO);
		model.addAttribute(BindingResult.MODEL_KEY_PREFIX+ " userInfo" , result);
		
		System.out.println(userInfoDTO.isTermAndCondition());
		if(result.hasErrors())
		{
			List<ObjectError> allErrors = result.getAllErrors();
			for(ObjectError temp:allErrors)
			{
				System.out.println(temp);
			}
		    System.out.println("my forms has errors.."); 
		    return "home-page";
		}
		
		String appResult = lcappService.calculateLove(userInfoDTO.getUserName(), userInfoDTO.getCrushName());
		userInfoDTO.setResult(appResult);
//		HttpSession session = request.getSession();
//		session.setAttribute("userName", userInfoDTO.getUserName());
//		session.setMaxInactiveInterval(120);
		
		
		
		
		//Create a cookie for the user name
		//Cookie theCookie = new Cookie("lcApp.userName", userInfoDTO.getUserName());
		//theCookie.setMaxAge(60*60*24);
		//Add the cookie to the response
		//response.addCookie(theCookie);
		
		//Write a service which will calculate the love % between user name and the crush name

		return "result-page";
	}
}
