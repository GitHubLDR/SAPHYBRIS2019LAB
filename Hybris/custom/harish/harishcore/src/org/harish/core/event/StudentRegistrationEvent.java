/**
 *
 */
package org.harish.core.event;

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.event.AbstractCommerceUserEvent;

import org.training.model.StudentModel;


/**
 * @author harish marsleno
 *
 */
public class StudentRegistrationEvent extends AbstractCommerceUserEvent<BaseSiteModel>
{

	private StudentModel student;

	/**
	 * @return the student
	 */
	public StudentModel getStudent()
	{
		return student;
	}

	/**
	 * @param student
	 *           the student to set
	 */
	public void setStudent(final StudentModel student)
	{
		this.student = student;
	}

}
