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
package org.harish.facades.populators;

import de.hybris.platform.commercefacades.product.data.StudentData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.harish.facades.product.data.GenderData;
import org.training.model.StudentModel;


/**
 * Populates {@link GenderData} with name and code.
 */
public class StudentDataPopulator implements Populator<StudentModel, StudentData>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final StudentModel source, final StudentData target) throws ConversionException
	{
		// YTODO Auto-generated method stub

		target.setId(source.getId());
		target.setName(source.getName());
		target.setEmail(source.getEmail());
		target.setPhoneNumber(source.getPhoneNumber());

	}


}