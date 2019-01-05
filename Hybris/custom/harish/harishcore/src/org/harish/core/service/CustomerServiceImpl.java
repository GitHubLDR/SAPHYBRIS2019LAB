/**
 *
 */
package org.harish.core.service;

import java.util.List;

import org.harish.core.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.training.model.StudentModel;


/**
 * @author harish marsleno
 *
 */
public class CustomerServiceImpl implements CustomerService
{
	@Autowired
	private CustomerDao customerDao;

	/**
	 * @return the customerDao
	 */
	public CustomerDao getCustomerDao()
	{
		return customerDao;
	}

	/**
	 * @param customerDao
	 *           the customerDao to set
	 */
	public void setCustomerDao(final CustomerDao customerDao)
	{
		this.customerDao = customerDao;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.harish.core.service.CustomerService#getAllStudents()
	 */
	@Override
	public List<StudentModel> getAllStudents()
	{
		// YTODO Auto-generated method stub
		return customerDao.getAllStudents();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.harish.core.service.CustomerService#getStudentbyid(java.lang.String)
	 */
	@Override
	public StudentModel getStudentbyid(final String id)
	{
		// YTODO Auto-generated method stub
		return customerDao.getStudentbyid(id);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.harish.core.service.CustomerService#register(org.training.model.StudentModel)
	 */
	@Override
	public void register(final StudentModel student)
	{
		// YTODO Auto-generated method stub

		customerDao.register(student);

	}

}
