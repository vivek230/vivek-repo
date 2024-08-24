package com.seleniumexpress.lc.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.lc.api.CommunicationDTO;
import com.seleniumexpress.lc.api.Phone;
import com.seleniumexpress.lc.api.UserRegistrationDTO;
import com.seleniumexpress.lc.propertyeditor.NamePropertyEditor;
import com.seleniumexpress.lc.validator.EmailValidator;
import com.seleniumexpress.lc.validator.UserNameValidator;

@Controller
public class RegistrationController {

	@Autowired
	private EmailValidator emailValidator;
	
	@RequestMapping("register")
	public String showRegistrationPage(@ModelAttribute("userRegistrationDTO") UserRegistrationDTO userRegistrationDTO) {
		userRegistrationDTO.setName("Vivek");
		userRegistrationDTO.setUserName("vvivek");
		
		Phone phone = new Phone();
		phone.setCountryCode("91");
		phone.setUserNumber("12345");
		CommunicationDTO communicationDTO = new CommunicationDTO();
		communicationDTO.setPhone(phone);
		userRegistrationDTO.setCommunicationDTO(communicationDTO);
		return "user-registration-page";
	}
	
	@RequestMapping("registration-success")
	public String processUserReg(@Valid @ModelAttribute("userRegistrationDTO") UserRegistrationDTO userRegistrationDTO, BindingResult result) {
		
		System.out.println("name entered = |" + userRegistrationDTO.getName() + "|");
		
		//calling the validator manually
		//comment below and uncomment binder.addValidators(new EmailValidator()) in initBinder() method to call it by Spring
		//EmailValidator emailValidator = new EmailValidator();
		emailValidator.validate(userRegistrationDTO, result);
		
		if (result.hasErrors()) {
			System.out.println("my page has errors");
			
			for(ObjectError error: result.getAllErrors()) {
				System.out.println(error);
			}
			return "user-registration-page";
		}
		return "registration-success";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("Inside initBinder() method");
		//binder.setDisallowedFields("name");
		
		//StringTrimmerEditor editor = new StringTrimmerEditor(true);
		//binder.registerCustomEditor(String.class, "name", editor);
		
		NamePropertyEditor nameEditor = new NamePropertyEditor();
		binder.registerCustomEditor(String.class, "name", nameEditor);
		
		binder.addValidators(new UserNameValidator());
		
		//binder.addValidators(new EmailValidator());
	}
}
