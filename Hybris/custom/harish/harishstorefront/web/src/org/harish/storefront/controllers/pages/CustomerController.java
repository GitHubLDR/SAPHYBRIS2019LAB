/**
 *
 */
package org.harish.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages;
import de.hybris.platform.acceleratorstorefrontcommons.forms.validation.MyValidator;
import de.hybris.platform.commercefacades.product.data.StudentData;

import javax.validation.Valid;

import org.apache.commons.collections.CollectionUtils;
import org.harish.facades.student.CustomerFacade1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author harish marsleno
 *
 */
@Controller
@RequestMapping("customerpage")
public class CustomerController extends AbstractPageController
{
	@Autowired
	private MyValidator myValidator;
	@Autowired
	private CustomerFacade1 customerFacade1;

	/**
	 * @return the customerFacade1
	 */
	public CustomerFacade1 getCustomerFacade1()
	{
		return customerFacade1;
	}


	/**
	 * @param customerFacade1
	 *           the customerFacade1 to set
	 */
	public void setCustomerFacade1(final CustomerFacade1 customerFacade1)
	{
		this.customerFacade1 = customerFacade1;
	}


	/**
	 *
	 *
	 *
	 * /**
	 *
	 * @return the studentFacade
	 */



	@RequestMapping("all")
	public String getAllStudents(@ModelAttribute("student") final StudentData theStudent, final Model model)
	{

		if (CollectionUtils.isNotEmpty(customerFacade1.getAllStudents()))
		{
			model.addAttribute("students", customerFacade1.getAllStudents());

			return "/pages/layout/customercontroller";
		}

		model.addAttribute("fail", "there are no students available");

		return "/pages/layout/customercontroller";

	}


	@RequestMapping("{id}")
	public String getstudentByid(@ModelAttribute("student") final StudentData theStudent, final Model model,
			@PathVariable final String id)
	{

		if (customerFacade1.getStudentbyid(id) != null)
		{
			model.addAttribute("students", customerFacade1.getStudentbyid(id));

			return "/pages/layout/customercontroller";
		}

		model.addAttribute("fail", "there are no students available");

		return "/pages/layout/customercontroller";

	}


	@RequestMapping("registration")
	public String getAllStudents(@Valid @ModelAttribute("student") final StudentData theStudent, final Model model,
			final BindingResult result)
	{

		myValidator.validate(theStudent, result);

		if (result.hasErrors())
		{

			model.addAttribute(new StudentData());
			GlobalMessages.addErrorMessage(model, "form.global.error");

			return "/pages/layout/customercontroller";

		}
		customerFacade1.register(theStudent);


		return "/pages/layout/customercontroller";

	}


	/**
	 * @return the myValidator
	 */
	public MyValidator getMyValidator()
	{
		return myValidator;
	}


	/**
	 * @param myValidator
	 *           the myValidator to set
	 */
	public void setMyValidator(final MyValidator myValidator)
	{
		this.myValidator = myValidator;
	}










}
