package com.seleniumexpress.lc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.seleniumexpress.lc.api.UserRegistrationDTO;

public class UserNameValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return UserRegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "userName.empty", "User Name cannot be empty");
		
		String userName = ((UserRegistrationDTO) object).getUserName();
		if (!userName.contains("_")) {
			errors.rejectValue("userName", "userName.invalidString", "User Name must contain a '_'");
		}
	}

}
