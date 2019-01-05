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
public interface CustomerService
{

	List<StudentModel> getAllStudents();

	StudentModel getStudentbyid(String id);

	void register(StudentModel student);

}
