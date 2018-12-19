/**
 *
 */
package org.harish.core.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import java.util.ArrayList;
import java.util.List;

import org.harish.core.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.training.model.StudentModel;


/**
 * @author harish marsleno
 *
 */
public class PrintStudentsJobPerformable extends AbstractJobPerformable<CronJobModel>
{
	@Autowired
	StudentService studentService;

	/**
	 * @return the studentService
	 */
	public StudentService getStudentService()
	{
		return studentService;
	}

	/**
	 * @param studentService
	 *           the studentService to set
	 */
	public void setStudentService(final StudentService studentService)
	{
		this.studentService = studentService;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable#perform(de.hybris.platform.cronjob.model.
	 * CronJobModel)
	 */
	@Override
	public PerformResult perform(final CronJobModel arg0)
	{
		// YTODO Auto-generated method stub
		List<StudentModel> list = new ArrayList<>();
		list = studentService.getAllStudents();

		for (final StudentModel student : list)
		{

			System.out.println("id  :" + student.getId() + "  id:" + student.getName() + " email:" + student.getEmail()
					+ " phoneNumber:" + student.getPhoneNumber());
		}



		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);

	}

}
