/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package org.training.form;

import de.hybris.platform.acceleratorstorefrontcommons.forms.RegisterForm;

import java.util.Date;


/**
 * Form object for registration
 */
public class MyForm extends RegisterForm
{

	private Date dateOfBirth;


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


}
