/**
 *
 */
package org.harish.core.dao;

import java.util.List;

import org.training.model.StudentModel;


/**
 * @author harish marsleno
 *
 */
public interface StudentDao
{
	public List<StudentModel> getAllStudents();

	public StudentModel getStudentbyId(String id);

	public void regStudent(StudentModel student);
}
