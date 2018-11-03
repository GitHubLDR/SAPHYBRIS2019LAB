package com.hello.dao;

import com.hello.data.dto.StudentData;

public interface StudentDao {

	public boolean setStudentInfo(StudentData studentData);
	public Object getStudentDetails(String search);
}
