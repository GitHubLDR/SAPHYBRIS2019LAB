package com.spring.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HelloController  {
	
	
	@RequestMapping(value= "/welcome", method=RequestMethod.GET)
	public String helloWorld(Model model)
	{
		/*ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","hello world");*/
		
		model.addAttribute("msg", "hello world");
		
		return "HelloPage";
	}
	
	

}
