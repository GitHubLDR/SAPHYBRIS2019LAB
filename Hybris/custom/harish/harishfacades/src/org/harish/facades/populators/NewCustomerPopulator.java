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

import de.hybris.platform.commercefacades.user.converters.populator.CustomerPopulator;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.harish.facades.product.data.GenderData;




/**
 * Populates {@link GenderData} with name and code.
 */
public class NewCustomerPopulator extends CustomerPopulator
{

	@Override
	public void populate(final CustomerModel source, final CustomerData target) throws ConversionException
	{
		super.populate(source, target);
		// YTODO Auto-generated method stub

		System.out.println("if this gets executed then my populator is working");
		target.setContactPhone(source.getContactPhone());



	}

}
