/**
 *
 */
package org.training.facades.registration;

import de.hybris.platform.commercefacades.customer.CustomerFacade;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;


/**
 * @author harish marsleno
 *
 */
public interface MyCustomerFacade extends CustomerFacade
{
	void updatePhone(CustomerData customerData) throws DuplicateUidException;


}
