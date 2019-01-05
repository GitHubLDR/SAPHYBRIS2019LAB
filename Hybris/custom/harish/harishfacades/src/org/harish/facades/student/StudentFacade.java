/**
 *
 */
package org.harish.facades.student;

import de.hybris.platform.commercefacades.product.data.StudentData;

import java.util.List;


/**
 * @author harish marsleno
 *
 */
public interface StudentFacade
{

	public List<StudentData> getAllStudents();

	public StudentData getStudentbyId(String id);

	public void regStudent(StudentData student);


}
