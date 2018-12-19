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
public interface CustomerFacade1
{

	List<StudentData> getAllStudents();

	StudentData getStudentbyid(String id);

	void register(StudentData student);

}
