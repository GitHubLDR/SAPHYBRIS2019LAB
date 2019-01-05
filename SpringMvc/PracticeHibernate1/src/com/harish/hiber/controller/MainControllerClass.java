package com.harish.hiber.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.harish.hiber.entity.Student;

@Controller
public class MainControllerClass {
	@RequestMapping("/")
	public String mainpage() {
		return "MainView";
		
	}
	
	


}
