package com.service.std;

import java.util.List;

import com.data.dto.StudentData;

public interface StudentService 
{
	public boolean setStudentInfo(StudentData studentData);
	public List<StudentData> getStudentDetails(String search);
}