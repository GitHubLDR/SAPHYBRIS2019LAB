package com.customtag.creation.com.student.copy;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.customtag.creation.com.validation.CourseCode;

public class Employee {
	
	@NotNull
	@CourseCode
	private String empId;
	
	@NotNull
	@Size(min=1, message = "Dear sir, you forgot to enter the first name")
	@Pattern(regexp="^[A-Za-z]*", message ="no numbers and special sign's are to be included")
	private String firstName;

	@NotNull
	@Size(min=1, message = "Dear sir, you forgot to enter the last name")
	@Pattern(regexp="^[A-Za-z]*", message ="no numbers and special sign's are to be included")
    private String lastName;
	
	@NotNull
	private String email;
	
	@NotNull
	@Pattern(regexp="^[0-9]{10}", message ="only 10 digits can be entered")
	private String phone;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
