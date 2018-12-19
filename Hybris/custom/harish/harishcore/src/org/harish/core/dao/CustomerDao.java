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
public interface CustomerDao
{

	List<StudentModel> getAllStudents();

	StudentModel getStudentbyid(String id);

	void register(StudentModel student);


}
