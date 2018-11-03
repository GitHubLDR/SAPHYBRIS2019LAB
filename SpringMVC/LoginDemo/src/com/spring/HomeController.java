package com.spring;

import javax.servlet.ServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController
{

	@RequestMapping(value= "/hello", method=RequestMethod.POST)
	public String helloWorld(Model model, ServletRequest request)
	{
		String name=request.getParameter("name");
		String password=request.getParameter("pass");
        if(password!=null && password.equals("admin"))
       {
	  	 String message=("Welcome"+"  " +name);
    	 model.addAttribute("message",message);
    	 return "hellopage";
       }
       else
       {
    	   String message=("Error"+"  " +name);
    	   model.addAttribute("message", message);
    	   return "errorpage";
       }}}
