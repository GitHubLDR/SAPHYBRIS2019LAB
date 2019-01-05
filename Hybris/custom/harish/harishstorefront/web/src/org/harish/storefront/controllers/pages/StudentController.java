/**
 *
 */
package org.harish.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages;
import de.hybris.platform.acceleratorstorefrontcommons.forms.validation.StudentValidator;
import de.hybris.platform.commercefacades.product.data.StudentData;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.apache.commons.collections.CollectionUtils;
import org.harish.facades.student.StudentFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author harish marsleno
 *
 */

@Controller
@RequestMapping("student")

public class StudentController extends AbstractPageController
{
	@Resource(name = "studentFacade")
	private StudentFacade studentFacade;

	@Resource(name = "studentValidator")
	private StudentValidator studentValidator;





	@RequestMapping("all")
	public String getAllStudents(@ModelAttribute("student") final StudentData theStudent, final Model model)
	{
		if (CollectionUtils.isNotEmpty(studentFacade.getAllStudents()))
		{

			model.addAttribute("students", studentFacade.getAllStudents());

			return "/pages/layout/studentcontroller";
		}

		model.addAttribute("failure", " Sorry no message found for the id you have given");
		return "/pages/layout/studentcontroller";


	}

	@RequestMapping("{id}")
	public String getAllStudents(@ModelAttribute("student") final StudentData theStudent, @PathVariable final String id,
			final Model model)
	{
		if (studentFacade.getStudentbyId(id) != null)
		{

			model.addAttribute("students", studentFacade.getStudentbyId(id));

			return "/pages/layout/studentcontroller";

		}

		model.addAttribute("failure", " Sorry no message found for the id you have given");

		return "/pages/layout/studentcontroller";


	}


	@RequestMapping("registration")
	public String registerStudent(@Valid @ModelAttribute("student") final StudentData theStudent, final BindingResult result,
			final Model model)
	{


		studentValidator.validate(theStudent, result);

		if (result.hasErrors())
		{

			GlobalMessages.addErrorMessage(model, "form.global.error");


			return "/pages/layout/studentcontroller";
		}

		studentFacade.regStudent(theStudent);


		return "/pages/layout/studentcontroller";


	}

	/**
	 * @return the studentFacade
	 */
	public StudentFacade getStudentFacade()
	{
		return studentFacade;
	}

	/**
	 * @return the registrationValidator
	 */
	public Validator getStudentValidator()
	{
		return studentValidator;
	}











}
