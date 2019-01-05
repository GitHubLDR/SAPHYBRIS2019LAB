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


import de.hybris.platform.commercefacades.product.converters.populator.ProductBasicPopulator;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.harish.core.model.ApparelStyleVariantProductModel;




/**
 * Populate the product data with the most basic product data
 */
public class HarisProductBasicPopulator extends ProductBasicPopulator<ProductModel, ProductData>
{


	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.commercefacades.product.converters.populator.ProductBasicPopulator#populate(de.hybris.platform.
	 * core.model.product.ProductModel, de.hybris.platform.commercefacades.product.data.ProductData)
	 */
	@Override
	public void populate(final ProductModel productModel, final ProductData productData) throws ConversionException
	{
		super.populate(productModel, productData);

		if (productModel instanceof ApparelStyleVariantProductModel)
		{

			final ApparelStyleVariantProductModel variantProduct = (ApparelStyleVariantProductModel) productModel;
			System.out.println("I am in the harishstylevariantproductpopulator");
			System.out.println("I am in the jdlafk harishstylevariantproductpopulator");
			productData.setMyText(variantProduct.getMyText());
		}



	}






}
