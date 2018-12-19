/**
 *
 */
package org.harish.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.commercefacades.product.ProductFacade;
import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commercefacades.product.data.ProductData;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author harish marsleno
 *
 */
@Controller
@RequestMapping("mypage")
public class MyController extends AbstractPageController
{

	@Resource(name = "productVariantFacade")
	private ProductFacade productFacade;


	@RequestMapping("{code}")
	public String printProductData(@PathVariable final String code, final Model model)
	{
		final List<ProductOption> basicOptions = Arrays.asList(ProductOption.BASIC);

		final ProductData basicData = productFacade.getProductForCodeAndOptions(code, basicOptions);

		model.addAttribute("basicData", basicData);

		//the next method will print the category

		final List<ProductOption> categoryOptions = Arrays.asList(ProductOption.CATEGORIES);

		final ProductData categoryData = productFacade.getProductForCodeAndOptions(code, categoryOptions);

		model.addAttribute("categoryData", categoryData);

		//this method will print price

		final List<ProductOption> priceOptions = Arrays.asList(ProductOption.PRICE);

		final ProductData priceData = productFacade.getProductForCodeAndOptions(code, priceOptions);

		model.addAttribute("priceData", priceData);

		//this method will print images

		final List<ProductOption> galleryOptions = Arrays.asList(ProductOption.GALLERY);

		final ProductData galleryData = productFacade.getProductForCodeAndOptions(code, galleryOptions);

		model.addAttribute("galleryData", galleryData);


		//this method will print images

		final List<ProductOption> myvaluesOptions = Arrays.asList(ProductOption.MYVALUES);

		final ProductData myvaluesData = productFacade.getProductForCodeAndOptions(code, myvaluesOptions);

		model.addAttribute("myvaluesData", myvaluesData);




		return "/pages/layout/mypage";
	}

}
