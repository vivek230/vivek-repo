package com.seleniumexpress.lc.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.seleniumexpress.lc.api.UserInfoDTO;

@Controller
@SessionAttributes({"userInfo"})
public class LCAppController {

	@RequestMapping("/")
	public String showHomePage(Model model) {
		model.addAttribute("userInfo", new UserInfoDTO());
		return "home-page";
	}
	
	@RequestMapping("/process-homepage")
	public String showResultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result) {
		
		if (result.hasErrors()) {
			System.out.println("The form has errors");
			return "home-page";
		}
		return "result-page";
	}
	
	/*
	@RequestMapping("/")
	public String showHomePage(Model model) {
		UserInfoDTO userInfo = new UserInfoDTO();
		model.addAttribute("userInfo", userInfo);
		return "home-page";
	}
	
	@RequestMapping("/process-homepage")
	public String showResultPage(UserInfoDTO userInfoDTO, Model model) {
		System.out.println("user name: " + userInfoDTO.getUserName() + ", crush name: " + userInfoDTO.getCrushName());
		model.addAttribute("userInfo", userInfoDTO);
		return "result-page";
	}*/
	
	/*@RequestMapping("/process-homepage")
	public String showResultPage(@RequestParam("userName") String userName1, @RequestParam("crushName") String crushName1, Model model) {
		System.out.println("user name: " + userName1 + ", crush name: " + crushName1);
		model.addAttribute("userName", userName1);
		model.addAttribute("crushName", crushName1);
		return "result-page";
	}*/
}
