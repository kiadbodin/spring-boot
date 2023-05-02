package com.web.springbootthymeleaf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {
	
	@GetMapping("/")
	public ModelAndView Index() {
		ModelAndView mav =new ModelAndView("index");
		return mav;
	}
		
}
