/**
 *
 */
package org.harish.facades.student;


import de.hybris.platform.commercefacades.product.data.StudentData;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.harish.core.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.training.model.StudentModel;


/**
 * @author harish marsleno
 *
 */
public class StudentFacadeImpl implements StudentFacade
{
	@Autowired
	private Converter<StudentModel, StudentData> studentConverter;

	@Autowired
	private Converter<StudentData, StudentModel> studentRegConverter;

	@Autowired
	private StudentService studentService;

	/**
	 * @return the studentConverter
	 */
	public Converter<StudentModel, StudentData> getStudentConverter()
	{
		return studentConverter;
	}

	/**
	 * @param studentConverter
	 *           the studentConverter to set
	 */
	public void setStudentConverter(final Converter<StudentModel, StudentData> studentConverter)
	{
		this.studentConverter = studentConverter;
	}

	/**
	 * @return the studentRegConverter
	 */
	public Converter<StudentData, StudentModel> getStudentRegConverter()
	{
		return studentRegConverter;
	}

	/**
	 * @param studentRegConverter
	 *           the studentRegConverter to set
	 */
	public void setStudentRegConverter(final Converter<StudentData, StudentModel> studentRegConverter)
	{
		this.studentRegConverter = studentRegConverter;
	}





	/*
	 * (non-Javadoc)
	 *
	 * @see org.harish.facades.student.StudentFacade#getAllStudents()
	 */
	@Override
	public List<StudentData> getAllStudents()
	{
		// YTODO Auto-generated method stub
		if (CollectionUtils.isNotEmpty(studentService.getAllStudents()))
		{

			return studentConverter.convertAll(studentService.getAllStudents());
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.harish.facades.student.StudentFacade#getStudentbyId(java.lang.String)
	 */
	@Override
	public StudentData getStudentbyId(final String id)
	{
		// YTODO Auto-generated method stub
		if (studentService.getStudentbyId(id) != null)
		{
			return studentConverter.convert(studentService.getStudentbyId(id));
		}

		return null;

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.harish.facades.student.StudentFacade#regStudent(de.hybris.platform.commercefacades.product.data.StudentData)
	 */
	@Override
	public void regStudent(final StudentData student)
	{
		// YTODO Auto-generated method stub
		studentService.regStudent(studentRegConverter.convert(student));

	}

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

}
