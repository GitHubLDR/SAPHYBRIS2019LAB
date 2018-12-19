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

import de.hybris.platform.acceleratorstorefrontcommons.forms.UpdateProfileForm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


/**
 * Validator for profile forms.
 */
@Component("profileValidator")
public class ProfileValidator implements Validator
{

	public static final Pattern MOBILE_PATTERN = Pattern.compile("[0-9]{10}");


	@Override
	public boolean supports(final Class<?> aClass)
	{
		return UpdateProfileForm.class.equals(aClass);
	}

	@Override
	public void validate(final Object object, final Errors errors)
	{
		final UpdateProfileForm profileForm = (UpdateProfileForm) object;
		final String title = profileForm.getTitleCode();
		final String firstName = profileForm.getFirstName();
		final String lastName = profileForm.getLastName();
		final String contactPhone = profileForm.getContactPhone();

		validatePhone(errors, contactPhone);

		if (StringUtils.isEmpty(title))
		{
			errors.rejectValue("titleCode", "profile.title.invalid");
		}
		else if (StringUtils.length(title) > 255)
		{
			errors.rejectValue("titleCode", "profile.title.invalid");
		}

		if (StringUtils.isBlank(firstName))
		{
			errors.rejectValue("firstName", "profile.firstName.invalid");
		}
		else if (StringUtils.length(firstName) > 255)
		{
			errors.rejectValue("firstName", "profile.firstName.invalid");
		}

		if (StringUtils.isBlank(lastName))
		{
			errors.rejectValue("lastName", "profile.lastName.invalid");
		}
		else if (StringUtils.length(lastName) > 255)
		{
			errors.rejectValue("lastName", "profile.lastName.invalid");
		}
	}


	protected void validatePhone(final Errors errors, final String email)
	{

		if (!validatePhone(email))
		{
			errors.rejectValue("contactPhone", "the mobile number has to contain 10 digits");
		}
	}

	public boolean validatePhone(final String phone)
	{
		final Matcher matcher = MOBILE_PATTERN.matcher(phone);
		return matcher.matches();
	}

}
