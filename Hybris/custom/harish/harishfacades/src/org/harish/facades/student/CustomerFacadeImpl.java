/**
 *
 */
package org.harish.facades.student;

import de.hybris.platform.commercefacades.product.data.StudentData;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import org.harish.core.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.training.model.StudentModel;


/**
 * @author harish marsleno
 *
 */
public class CustomerFacadeImpl implements CustomerFacade1
{

	@Autowired
	private CustomerService customerService;

	@Autowired
	private Converter<StudentModel, StudentData> mycustomerConverter;

	@Autowired
	private Converter<StudentData, StudentModel> customerRegConverter;



	/**
	 * @return the mycustomerConverter
	 */
	public Converter<StudentModel, StudentData> getMycustomerConverter()
	{
		return mycustomerConverter;
	}

	/**
	 * @param mycustomerConverter
	 *           the mycustomerConverter to set
	 */
	public void setMycustomerConverter(final Converter<StudentModel, StudentData> mycustomerConverter)
	{
		this.mycustomerConverter = mycustomerConverter;
	}

	/**
	 * @return the customerService
	 */
	public CustomerService getCustomerService()
	{
		return customerService;
	}

	/**
	 * @param customerService
	 *           the customerService to set
	 */
	public void setCustomerService(final CustomerService customerService)
	{
		this.customerService = customerService;
	}



	/**
	 * @return the customerConverter
	 */

	/**
	 * @return the customerRegConverter
	 */
	public Converter<StudentData, StudentModel> getCustomerRegConverter()
	{
		return customerRegConverter;
	}

	/**
	 * @return the customerConverter1
	 */


	/**
	 * @param customerConverter1
	 *           the customerConverter1 to set
	 */


	/**
	 * @param customerRegConverter
	 *           the customerRegConverter to set
	 */
	public void setCustomerRegConverter(final Converter<StudentData, StudentModel> customerRegConverter)
	{
		this.customerRegConverter = customerRegConverter;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.harish.facades.student.CustomerFacade#getAllStudents()
	 */
	@Override
	public List<StudentData> getAllStudents()
	{
		// YTODO Auto-generated method stub

		return mycustomerConverter.convertAll(customerService.getAllStudents());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.harish.facades.student.CustomerFacade#getStudentbyid(java.lang.String)
	 */
	@Override
	public StudentData getStudentbyid(final String id)
	{
		// YTODO Auto-generated method stub
		return mycustomerConverter.convert(customerService.getStudentbyid(id));
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.harish.facades.student.CustomerFacade#register(de.hybris.platform.commercefacades.product.data.StudentData)
	 */
	@Override
	public void register(final StudentData student)
	{
		// YTODO Auto-generated method stub

		customerService.register(customerRegConverter.convert(student));

	}

}
