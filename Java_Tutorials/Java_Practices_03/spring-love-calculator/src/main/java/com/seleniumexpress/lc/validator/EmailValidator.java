//package com.seleniumexpress.lc.validator;
//
//import org.springframework.stereotype.Component;
//import org.springframework.validation.Errors;
//import org.springframework.validation.ValidationUtils;
//import org.springframework.validation.Validator;
//
//import com.selniumexpress.lc.api.UserRegistrationDTO;
//
//@Component
//public class EmailValidator implements Validator {
//
//	@Override
//	public boolean supports(Class<?> clazz) {
//
//		return UserRegistrationDTO.class.equals(clazz);
//	}
//
//	@Override
//	public void validate(Object target, Errors errors) {
//
//		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "communicationDTO.email", "email.empty");
//		
//		//Weather the email is ending with seleniumexpress.com
//		String email = ((UserRegistrationDTO)target).getCommunicationDTO().getEmail();
//		if(!email.endsWith("seleniumexpress.com"))
//		{
//			errors.rejectValue("communicationDTO.email", "email.invalidDomain");
//		}
//	}
//
//}
