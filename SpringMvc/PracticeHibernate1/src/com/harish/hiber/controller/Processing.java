package com.harish.hiber.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.harish.hiber.entity.Student;

@Controller
public class Processing {
	
	@RequestMapping("form")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("student", new Student());
		
		return "ShowForm";
		
		}
	
	
	@RequestMapping("processForm")
	public String processForm(@ModelAttribute("student") Student theStudent, Model model) {
		
		DataMethods data = new DataMethods();
		
		data.insert(theStudent.getFirstName(), theStudent.getLastName(), theStudent.getEmail());
		model.addAttribute("message", "inserted successfully");
		
		
		return "ShowForm";	
	}
	
	@RequestMapping("getTable")
	public String getTable(@ModelAttribute("student") Student theStudent,Model model) {
		
		DataMethods data = new DataMethods();
		
		List<Student> list = data.read();
		
		
		model.addAttribute("list",list);
		model.addAttribute("id","ID");
		model.addAttribute("firstName","FIRSTNAME");
		model.addAttribute("lastName","LASTNAME");
		model.addAttribute("email","EMAIL");
		
		
		return "ShowForm";	
	}
	
	@RequestMapping("delete")
	public String delete(@ModelAttribute("student") Student theStudent,HttpServletRequest request) {
		
         DataMethods data = new DataMethods();
         
         String name = request.getParameter("fname");
         
         int a=Integer.parseInt(String.valueOf(name));
         System.out.println(a);
         data.delete(a);
        
         
		
         return "ShowForm";	
		
	}
	
	@RequestMapping("showUpdateForm")
	public String updateLink(@ModelAttribute("studentId") String id,Model theModel) {
		
         DataMethods data = new DataMethods();
         List<Student> list = data.updateform(Integer.parseInt(String.valueOf(id)));
         
         for(Student e:list){
         theModel.addAttribute("firstName",e.getFirstName());
         theModel.addAttribute("lastName",e.getLastName());
         theModel.addAttribute("email",e.getEmail());
         }
         System.out.println(list);
         
         return "updateForm";	
		
	}
	
	@RequestMapping("showUpdateForm")
	public String updateLink(@ModelAttribute("student") Student theStudent,Model theModel) {
		
         DataMethods data = new DataMethods();
         data.update(theStudent);
         
         
         return "showForm";	
		
	}
	
	
	

}
