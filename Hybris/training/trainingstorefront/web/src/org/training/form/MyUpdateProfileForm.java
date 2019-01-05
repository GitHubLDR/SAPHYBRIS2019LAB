/**
 *
 */
package org.training.form;

import de.hybris.platform.acceleratorstorefrontcommons.forms.UpdateProfileForm;

import java.util.Date;


/**
 * @author harish marsleno
 *
 */
public class MyUpdateProfileForm extends UpdateProfileForm
{

	private Date dateOfBirth;

	private String mobileNumber;

	private Integer age;

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth()
	{
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth
	 *           the dateOfBirth to set
	 */
	public void setDateOfBirth(final Date dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber()
	{
		return mobileNumber;
	}

	/**
	 * @param mobileNumber
	 *           the mobileNumber to set
	 */
	public void setMobileNumber(final String mobileNumber)
	{
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return the age
	 */
	public Integer getAge()
	{
		return age;
	}

	/**
	 * @param age
	 *           the age to set
	 */
	public void setAge(final Integer age)
	{
		this.age = age;
	}




}
