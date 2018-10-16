package com.service.std;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

import com.data.dto.StudentData;
import com.reg.dao.StudentDao;
import com.reg.dao.StudentSpringJdbcImp;


@SuppressWarnings("deprecation")
public class StudentServiceImp implements StudentService
{

	private StudentDao studentDao;
	
	@Resource(name = "studentSpringJdbcImp")
	private StudentSpringJdbcImp studentSpringJdbcImp;
	
	@SuppressWarnings("unused")
	@Override
	public boolean setStudentInfo(StudentData studentData) {
		if(false)
		{

			return getStudentDao().setStudentInfo(studentData);

		}

		else if(true)
		{
			return getStudentSpringJdbcImp().setStudentInfo(studentData);
		}
		return false;
	}

	@SuppressWarnings("unused")
	@Override
	public List<StudentData> getStudentDetails(String search){
		
		if(false)
		{
			return this.jdbc(search);
		}
		
		else if(true)
		{
			return this.springJdbcTemplate(search);
		}
		
		return null;
	}
	
	public List<StudentData> jdbc(String search){
		ResultSet rs = (ResultSet) getStudentDao().getStudentDetails(search);
		try {
			if (rs != null) {
				List<StudentData> listOfStudents = new ArrayList<StudentData>();
				while (rs.next()) {
					StudentData data = new StudentData();
					data.setFirstName(rs.getString("firstName"));
					data.setLastName(rs.getString("lastName"));
					data.setEmail(rs.getString("email"));
					System.out.println(rs.getString("firstName") +" ---->" + rs.getString("lastName") + "-------> "+ rs.getString("email"));
					listOfStudents.add(data);
				}
				return listOfStudents.isEmpty()? null : listOfStudents;
			}
		}catch (Exception e) {
			System.out.println("Error at iteration student data");
			e.printStackTrace();
		}
		return null;
	}
	
	@SuppressWarnings("rawtypes")
	public List<StudentData> springJdbcTemplate(String search)
	{
		try{
		@SuppressWarnings("unchecked")
		List<Map<String, Object>> results = (List<Map<String, Object>>) getStudentSpringJdbcImp().getStudentDetails(search);
		List<StudentData> listOfStudents = new ArrayList<StudentData>();
			for (Map row : results) 
			{
				StudentData student = new StudentData();
				student.setFirstName((String)(row.get("firstName")));
				student.setLastName((String)row.get("lastName"));
				student.setEmail((String)row.get("email"));
				listOfStudents.add(student);
			}
		return listOfStudents;
		}catch (Exception e) {
			System.out.println("SQL expetion " + e.getMessage());
		}
		return null;
	}
	
	public StudentDao getStudentDao() {
		return studentDao;
	}
	
	@Required
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public StudentSpringJdbcImp getStudentSpringJdbcImp() {
		return studentSpringJdbcImp;
	}

	public void setStudentSpringJdbcImp(StudentSpringJdbcImp studentSpringJdbcImp) {
		this.studentSpringJdbcImp = studentSpringJdbcImp;
	}


}