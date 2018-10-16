package com.reg.dao;

import com.data.dto.StudentData;
public interface StudentDao {

	public boolean setStudentInfo(StudentData studentData);
	public Object getStudentDetails(String search);
}

