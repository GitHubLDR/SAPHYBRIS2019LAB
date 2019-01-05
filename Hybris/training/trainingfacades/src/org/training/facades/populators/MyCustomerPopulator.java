/**
 *
 */
package org.training.facades.populators;

import de.hybris.platform.commercefacades.user.converters.populator.CustomerPopulator;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.CustomerModel;


/**
 * @author harish marsleno
 *
 */
public class MyCustomerPopulator extends CustomerPopulator
{

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.commercefacades.user.converters.populator.CustomerPopulator#populate(de.hybris.platform.core.
	 * model.user.CustomerModel, de.hybris.platform.commercefacades.user.data.CustomerData)
	 */
	@Override
	public void populate(final CustomerModel source, final CustomerData target)
	{
		super.populate(source, target);
		if (source.getDateOfBirth() != null)
		{
			target.setDateOfBirth(source.getDateOfBirth());
			target.setAge(source.getAge());
		}
		if (source.getPhoneNumber() != null)
		{
			target.setPhoneNumber(source.getPhoneNumber());
		}



	}

}
