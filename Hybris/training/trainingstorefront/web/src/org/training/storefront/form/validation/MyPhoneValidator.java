/**
 *
 */
package org.training.storefront.form.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.training.form.MyUpdatePhoneForm;


/**
 * Validator for profile forms.
 */
@Component("myPhoneValidator")
public class MyPhoneValidator implements Validator
{

	public static final Pattern PHONE_REGEX = Pattern.compile("^[6-9][0-9]{9}$");


	@Override
	public boolean supports(final Class<?> aClass)
	{
		return MyUpdatePhoneForm.class.equals(aClass);
	}

	@Override
	public void validate(final Object object, final Errors errors)
	{
		final MyUpdatePhoneForm profileForm = (MyUpdatePhoneForm) object;

		validatePhone(errors, profileForm.getMobileNumber());


	}

	public boolean validatePhone(final String email)
	{
		final Matcher matcher = PHONE_REGEX.matcher(email);
		return matcher.matches();
	}

	protected void validatePhone(final Errors errors, final String email)
	{

		if (!validatePhone(email))
		{
			errors.rejectValue("mobileNumber", "please enter a valid phone Number");
		}
	}
}


