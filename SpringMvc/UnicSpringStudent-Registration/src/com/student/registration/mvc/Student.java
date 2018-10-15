package com.student.registration.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {

	@NotNull(message = "is required")
	@Min(0)
	@Max(50)
	private int id;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	@Pattern(regexp = "^[a-zA-Z]*", message = "No Special Symbols are accepted")
	private String firstName;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	@Pattern(regexp = "^[a-zA-Z]*", message = "No Special Symbols are accepted")
	private String lastName;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}

}
