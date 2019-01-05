/**
 *
 */
package org.harish.core.search.solrfacetsearch.provider.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.indexer.IndexerBatchContext;
import de.hybris.platform.solrfacetsearch.indexer.spi.InputDocument;
import de.hybris.platform.solrfacetsearch.provider.ValueResolver;
import de.hybris.platform.variants.model.VariantProductModel;

import java.util.Collection;

import org.harish.core.model.ApparelProductModel;


/**
 * @author harish marsleno
 *
 */
public class MystyleValueResolver implements ValueResolver<ProductModel>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.solrfacetsearch.provider.ValueResolver#resolve(de.hybris.platform.solrfacetsearch.indexer.spi.
	 * InputDocument, de.hybris.platform.solrfacetsearch.indexer.IndexerBatchContext, java.util.Collection,
	 * de.hybris.platform.core.model.ItemModel)
	 */
	@Override
	public void resolve(final InputDocument doc, final IndexerBatchContext indexerBatchContext,
			final Collection<IndexedProperty> list, final ProductModel productModel) throws FieldValueProviderException
	{

		doc.addField(list.iterator().next(), getmyStyleBaseProduct(productModel));
	}


	private String getmyStyleBaseProduct(final ProductModel productModel)
	{

		if (productModel instanceof VariantProductModel)
		{
			final ProductModel productModel1 = ((VariantProductModel) productModel).getBaseProduct();
			if (productModel1 instanceof ApparelProductModel && null != ((ApparelProductModel) productModel1).getMystyle())
			{
				return ((ApparelProductModel) productModel1).getMystyle();
			}
		}
		else if (null != ((ApparelProductModel) productModel).getMystyle())
		{
			return ((ApparelProductModel) productModel).getMystyle();
		}
		return null;
	}

}
