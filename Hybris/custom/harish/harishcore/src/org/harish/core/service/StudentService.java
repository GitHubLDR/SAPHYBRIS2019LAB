/**
 *
 */
package org.harish.core.service;

import java.util.List;

import org.training.model.StudentModel;


/**
 * @author harish marsleno
 *
 */
public interface StudentService
{
	public List<StudentModel> getAllStudents();

	public StudentModel getStudentbyId(String id);

	public void regStudent(StudentModel student);
}
