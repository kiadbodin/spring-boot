package com.web.Allbarcode.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class MainController {
		
	public ModelAndView Home() {
		ModelAndView mav  = new ModelAndView("index");
		return mav;
	}
	
	@GetMapping("barcodes/list")
	public ModelAndView Barcodes() {	
		ModelAndView mav  = new ModelAndView("barcodeslist");		
		return mav;
	}
	
}
