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
package de.hybris.platform.acceleratorstorefrontcommons.forms.validation;

import de.hybris.platform.commercefacades.product.data.StudentData;

import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


/**
 * Validates registration forms.
 */
@Component("myValidator")
public class MyValidator implements Validator
{
	public static final Pattern EMAIL_REGEX = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b");

	@Override
	public boolean supports(final Class<?> aClass)
	{
		return StudentData.class.equals(aClass);
	}

	@Override
	public void validate(final Object object, final Errors errors)
	{
		final StudentData registerForm = (StudentData) object;
		validateid(errors, registerForm.getId(), "id", "please enter the text into the id field");
		validateName(errors, registerForm.getName(), "name", "please enter the text into the id field");

	}



	protected void validateName(final Errors errors, final String name, final String propertyName, final String property)
	{
		if (StringUtils.isBlank(name))
		{
			errors.rejectValue(propertyName, property);
		}
		else if (StringUtils.length(name) > 255)
		{
			errors.rejectValue(propertyName, property);
		}
	}

	protected void validateid(final Errors errors, final String name, final String propertyName, final String property)
	{
		if (StringUtils.isBlank(name))
		{
			errors.rejectValue(propertyName, property);
		}
		else if (StringUtils.length(name) > 255)
		{
			errors.rejectValue(propertyName, property);
		}
	}


}
