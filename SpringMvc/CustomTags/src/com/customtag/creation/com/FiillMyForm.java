package com.customtag.creation.com;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.customtag.creation.com.student.copy.Employee;
import com.customtag.creation.com.student.copy.ListEmployee;

@Controller
public class FiillMyForm {
	
	@InitBinder
	public void InitBinder(WebDataBinder dataBinder) {

		StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, trimmer);

	}
	
	@RequestMapping("/")
	public String form(Model theModel) {
		theModel.addAttribute("employee", new Employee());
		return "user-interface";
		
		
	}
	
	@RequestMapping("processForm")
	public String processform(@Valid @ModelAttribute("employee") Employee theEmployee , BindingResult theBindingResult) {
		
		if(theBindingResult.hasErrors()) {
			return "user-interface";
			
		}else {
		
		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(theEmployee);
		for(Employee e:employees) {
			System.out.println(e.getEmpId()+" "+e.getFirstName()+" "+e.getLastName()+" "+e.getPhone()+" "+e.getEmail());
		}
		
		return "registration-success";
		}
		
	}

}
