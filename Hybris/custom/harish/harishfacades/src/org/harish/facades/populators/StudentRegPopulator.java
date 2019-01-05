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
import de.hybris.platform.commerceservices.i18n.CommerceCommonI18NService;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.harish.facades.product.data.GenderData;
import org.springframework.beans.factory.annotation.Autowired;
import org.training.model.StudentModel;


/**
 * Populates {@link GenderData} with name and code.
 */
public class StudentRegPopulator implements Populator<StudentData, StudentModel>
{

	@Autowired
	private CommerceCommonI18NService commerceCommonI18NService;


	/**
	 * @return the commerceCommonI18NService
	 */
	public CommerceCommonI18NService getCommerceCommonI18NService()
	{
		return commerceCommonI18NService;
	}


	/**
	 * @param commerceCommonI18NService
	 *           the commerceCommonI18NService to set
	 */
	public void setCommerceCommonI18NService(final CommerceCommonI18NService commerceCommonI18NService)
	{
		this.commerceCommonI18NService = commerceCommonI18NService;
	}


	/*
	 * (non-Javadoc)
	 *
	 */
	@Override
	public void populate(final StudentData source, final StudentModel target) throws ConversionException
	{
		// YTODO Auto-generated method stub


		target.setId(source.getId(), commerceCommonI18NService.getCurrentLocale());
		target.setName(source.getName(), commerceCommonI18NService.getCurrentLocale());
		target.setEmail(source.getEmail(), commerceCommonI18NService.getCurrentLocale());
		target.setPhoneNumber(source.getPhoneNumber(), commerceCommonI18NService.getCurrentLocale());

	}


}
