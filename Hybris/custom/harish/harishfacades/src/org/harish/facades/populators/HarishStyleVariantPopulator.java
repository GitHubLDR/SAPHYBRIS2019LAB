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

import org.harish.core.model.HarishStyleVariantProductModel;






/**
 * Populate the product data with the most basic product data
 */
public class HarishStyleVariantPopulator extends ProductBasicPopulator<ProductModel, ProductData>
{


	@Override
	public void populate(final ProductModel source, final ProductData productData) throws ConversionException
	{


		if (source instanceof HarishStyleVariantProductModel)
		{
			final HarishStyleVariantProductModel apparelProductModel = (HarishStyleVariantProductModel) source;

			productData.setTextField(apparelProductModel.getTextField());
		}



	}





}
