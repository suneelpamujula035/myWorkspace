package com.seleniumexpress.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.lc.propertyeditor.NamePropertyEditor;
import com.seleniumexpress.lc.validator.UserNameValidator;
import com.selniumexpress.lc.api.CommunicationDTO;
import com.selniumexpress.lc.api.Phone;
import com.selniumexpress.lc.api.UserRegistrationDTO;

@Controller
public class RegistrationController {

//	@Autowired
//	private EmailValidator emailValidator;
	
	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO)
	{
		System.out.println("Inside showRegistrationPage method");
		//For setting default phone number in registration page
//		Phone phone = new Phone();
//		phone.setCountryCode("91");
//		phone.setUserNumber("2233445566");
//		CommunicationDTO communicationDTO = new CommunicationDTO();
//		communicationDTO.setPhone(phone);
//		userRegistrationDTO.setCommunicationDTO(communicationDTO);
		
		return "user-registration-page";
	}
	
	
	
	@RequestMapping("registation-success")
	public String processUserReg(@Valid @ModelAttribute("userReg")  UserRegistrationDTO userRegistrationDTO, BindingResult result)
	{
		
		//Calling the EmailValidator method
		//emailValidator.validate(userRegistrationDTO, result);
		
		
		System.out.println("Name value entered by the user is : "+" | "+userRegistrationDTO.getName()+" | ");
		if(result.hasErrors())
		{
			System.out.println("My page has errors..");
			List<ObjectError> allErrors = result.getAllErrors();
			for(ObjectError  error:allErrors)
			{
				System.out.println(error);
			}
			return "user-registration-page";
		}
		System.out.println("Inside processUserReg method");
		return "registation-success";
	}
	
	@InitBinder//It is used for pre-processing work----Before starting every handler method in controller @InitBinder method will execute
	public void initBinder(WebDataBinder binder)
	{
		System.out.println("Inside initBinder method");
		
		StringTrimmerEditor editor = new StringTrimmerEditor(true);//It is deleting white spaces in the name text box
		binder.registerCustomEditor(String.class, "name", editor);//It is converted from white spaces to null
		
		NamePropertyEditor namEditor = new NamePropertyEditor();//It is converting name field to Upper case letters
		binder.registerCustomEditor(String.class,"name", namEditor);//Here we can also run the program by removing "name" property
		
		//binder.setDisallowedFields("name");//If I do not want to bind specific text box data (disabling name field in result page)
		UserNameValidator validator = new UserNameValidator();
		binder.addValidators(validator);
		//binder.addValidators(new EmailValidator());
		
	}
}
