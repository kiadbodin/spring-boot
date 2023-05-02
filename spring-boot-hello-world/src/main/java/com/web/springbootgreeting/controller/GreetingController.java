package com.web.springbootgreeting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class GreetingController {
	
	//create greeting 
	@GetMapping("/")
	public String Index() {
		return "สวัสดีชาวโลก (Hello World)";
	}
	
}
