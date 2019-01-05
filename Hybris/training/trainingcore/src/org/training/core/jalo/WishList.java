package org.training.core.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.AbstractOrderEntry;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.product.Unit;
import de.hybris.platform.jalo.type.ComposedType;

import org.apache.log4j.Logger;


public class WishList extends GeneratedWishList
{
	@SuppressWarnings("unused")
	private final static Logger LOG = Logger.getLogger(WishList.class.getName());

	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes)
			throws JaloBusinessException
	{
		// business code placed here will be executed before the item is created
		// then create the item
		final Item item = super.createItem(ctx, type, allAttributes);
		// business code placed here will be executed after the item was created
		// and return the item
		return item;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hybris.platform.jalo.order.AbstractOrder#createNewEntry(de.hybris.platform.jalo.SessionContext,
	 * de.hybris.platform.jalo.type.ComposedType, de.hybris.platform.jalo.product.Product, long,
	 * de.hybris.platform.jalo.product.Unit, int)
	 */
	@Override
	protected AbstractOrderEntry createNewEntry(final SessionContext arg0, final ComposedType arg1, final Product arg2,
			final long arg3, final Unit arg4, final int arg5)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hybris.platform.jalo.order.AbstractOrder#getAbstractOrderEntryTypeCode()
	 */
	@Override
	protected String getAbstractOrderEntryTypeCode()
	{
		// YTODO Auto-generated method stub
		return null;
	}

}
