/**
 *
 */
package org.training.storefront.form.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.training.form.MyUpdateProfileForm;


/**
 * Validator for profile forms.
 */
@Component("myProfileValidator")
public class MyProfileValidator implements Validator
{

	public static final Pattern PHONE_REGEX = Pattern.compile("^[6-9][0-9]{9}$");


	@Override
	public boolean supports(final Class<?> aClass)
	{
		return MyUpdateProfileForm.class.equals(aClass);
	}

	@Override
	public void validate(final Object object, final Errors errors)
	{
		final MyUpdateProfileForm profileForm = (MyUpdateProfileForm) object;
		final String title = profileForm.getTitleCode();
		final String firstName = profileForm.getFirstName();
		final String lastName = profileForm.getLastName();

		validatePhone(errors, profileForm.getMobileNumber());

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

	public boolean validatePhone(final String email)
	{
		final Matcher matcher = PHONE_REGEX.matcher(email);
		return matcher.matches();
	}

	protected void validatePhone(final Errors errors, final String email)
	{
		if (StringUtils.isEmpty(email))
		{
			errors.rejectValue("mobileNumber", "please enter a valid phone Number");
		}
		else if (StringUtils.length(email) > 255 || !validatePhone(email))
		{
			errors.rejectValue("mobileNumber", "please enter a valid phone Number");
		}
	}
}


