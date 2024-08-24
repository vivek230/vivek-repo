package com.seleniumexpress.lc.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.seleniumexpress.lc.api.UserRegistrationDTO;

@Component
public class EmailValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return UserRegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "communicationDTO.email", "email.empty");
		
		String emailStr = ((UserRegistrationDTO) object).getCommunicationDTO().getEmail();
		
		if (!emailStr.endsWith("seleniumexpress.com")) {
			errors.rejectValue("communicationDTO.email", "email.invaildDomain");
		}
	}

}
