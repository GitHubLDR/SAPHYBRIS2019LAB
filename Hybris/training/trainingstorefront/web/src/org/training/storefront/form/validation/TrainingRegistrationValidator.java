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
import org.training.form.MyForm;


@Component("trainingRegistrationValidator")
public class TrainingRegistrationValidator implements Validator
{
	public static final Pattern EMAIL_REGEX = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b");

	public static final Pattern PHONE_REGEX = Pattern.compile("^[6-9][0-9]{9}$");

	@Override
	public boolean supports(final Class<?> aClass)
	{
		return MyForm.class.equals(aClass);
	}

	@Override
	public void validate(final Object object, final Errors errors)
	{
		final MyForm registerForm = (MyForm) object;
		final String titleCode = registerForm.getTitleCode();
		final String firstName = registerForm.getFirstName();
		final String lastName = registerForm.getLastName();
		final String email = registerForm.getEmail();
		final String pwd = registerForm.getPwd();

		final String checkPwd = registerForm.getCheckPwd();

		validateTitleCode(errors, titleCode);
		validateName(errors, firstName, "firstName", "register.firstName.invalid");
		validateName(errors, lastName, "lastName", "register.lastName.invalid");

		if (StringUtils.length(firstName) + StringUtils.length(lastName) > 255)
		{
			errors.rejectValue("lastName", "register.name.invalid");
			errors.rejectValue("firstName", "register.name.invalid");
		}


		validatePhone(errors, registerForm.getMobileNumber());
		validateEmail(errors, email);
		validatePassword(errors, pwd);
		comparePasswords(errors, pwd, checkPwd);
	}

	protected void comparePasswords(final Errors errors, final String pwd, final String checkPwd)
	{
		if (StringUtils.isNotEmpty(pwd) && StringUtils.isNotEmpty(checkPwd) && !StringUtils.equals(pwd, checkPwd))
		{
			errors.rejectValue("checkPwd", "validation.checkPwd.equals");
		}
		else
		{
			if (StringUtils.isEmpty(checkPwd))
			{
				errors.rejectValue("checkPwd", "register.checkPwd.invalid");
			}
		}
	}

	protected void validatePassword(final Errors errors, final String pwd)
	{
		if (StringUtils.isEmpty(pwd))
		{
			errors.rejectValue("pwd", "register.pwd.invalid");
		}
		else if (StringUtils.length(pwd) < 6 || StringUtils.length(pwd) > 255)
		{
			errors.rejectValue("pwd", "register.pwd.invalid");
		}
	}

	protected void validateEmail(final Errors errors, final String email)
	{
		if (StringUtils.isEmpty(email))
		{
			errors.rejectValue("email", "register.email.invalid");
		}
		else if (StringUtils.length(email) > 255 || !validateEmailAddress(email))
		{
			errors.rejectValue("email", "register.email.invalid");
		}
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

	protected void validateTitleCode(final Errors errors, final String titleCode)
	{
		if (StringUtils.isEmpty(titleCode))
		{
			errors.rejectValue("titleCode", "register.title.invalid");
		}
		else if (StringUtils.length(titleCode) > 255)
		{
			errors.rejectValue("titleCode", "register.title.invalid");
		}
	}

	public boolean validateEmailAddress(final String email)
	{
		final Matcher matcher = EMAIL_REGEX.matcher(email);
		return matcher.matches();
	}

	public boolean validatePhone(final String email)
	{
		final Matcher matcher = PHONE_REGEX.matcher(email);
		return matcher.matches();
	}
}
