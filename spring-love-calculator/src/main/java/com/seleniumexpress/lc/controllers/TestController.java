package com.seleniumexpress.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	//@ResponseBody
	@RequestMapping("/test")
	public String sayHello() {
		return "hello-world";
	}
}
