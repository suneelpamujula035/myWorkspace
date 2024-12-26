package com.seleniumexpress.lc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.selniumexpress.lc.api.UserRegistrationDTO;

public class UserNameValidator implements Validator {

	//Check if the UserNameValidator supports a given object
	@Override
	public boolean supports(Class<?> clazz) {

		return UserRegistrationDTO.class.equals(clazz);
	}

	//We need to write our custom validation logic
	@Override
	public void validate(Object object, Errors errors) {

		//To check if the field is null
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "userName.empty", "UserName can't be empty");
		//The String should contain a '_'
		String userName = ((UserRegistrationDTO)object).getUserName();
		if(!userName.contains("_"))
		{
			errors.rejectValue("userName", "userName.invalidString", "String must contain a '_' ");
		}
	}

}
