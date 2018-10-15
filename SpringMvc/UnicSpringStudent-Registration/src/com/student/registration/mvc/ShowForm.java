package com.student.registration.mvc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

@Controller
public class ShowForm {

	@InitBinder
	public void InitBinder(WebDataBinder dataBinder) {

		StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, trimmer);

	}

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {

		theModel.addAttribute("student", new Student());
		return "registration-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student theStudent, BindingResult theBindingResult,
			Model model) throws SQLException {

		if (theBindingResult.hasErrors()) {

			return "registration-form";

		} else {

			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			DriverClass dc = (DriverClass) context.getBean("id3");

			String message = "your registration is done successfully";

			String sql = "insert into student values(?,?,?,?)";

			int i = dc.getJt().update(sql, new Object[] { theStudent.getId(), theStudent.getFirstName(),
					theStudent.getLastName(), theStudent.getEmail() });

			System.out.println(i + " records inserted");

			model.addAttribute("message", message);

			return "registration-success";

		}

	}

	@RequestMapping("/searchTable")
	public String searchTable(HttpServletRequest request, Model model) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DriverClass dc = (DriverClass) context.getBean("id3");

		String name = request.getParameter("search");

		List<Map<String, Object>> list = dc.getJt().queryForList(
				"select * from student where firstName like '%" + name + "%' OR lastName like '%" + name + "%'");

		/*
		 * for (Map<String, Object> map : list) { for (Map.Entry<String, Object> entry :
		 * map.entrySet()) {
		 * 
		 * System.out.println(entry.getKey()+" "+entry.getValue()); } }
		 */
		List<Student> listOfStudents = new ArrayList<Student>();
		for (Map row : list) {
			Student student = new Student();
			student.setId((int) (row.get("id")));
			student.setFirstName((String) (row.get("firstName")));
			student.setLastName((String) row.get("lastName"));
			student.setEmail((String) row.get("email"));
			listOfStudents.add(student);
		}

		if (listOfStudents.isEmpty()) {
			model.addAttribute("message", "Sorry! there are no matches found for the search you typed in");

		} else {
			model.addAttribute("id", "id");
			model.addAttribute("firstName", "FirstName");
			model.addAttribute("lastName", "LastName");
			model.addAttribute("email", "Email");

			model.addAttribute("print", listOfStudents);

		}

		return "registration-success";

	}

}
