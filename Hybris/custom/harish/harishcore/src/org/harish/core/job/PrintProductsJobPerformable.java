/**
 *
 */
package org.harish.core.job;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author harish marsleno
 *
 */
public class PrintProductsJobPerformable extends AbstractJobPerformable<CronJobModel>
{

	@Autowired
	FlexibleSearchService flexibleSearchService;


	@Override
	public PerformResult perform(final CronJobModel arg0)
	{


		final SearchResult<ProductModel> result = flexibleSearchService.search("select {pk} from {Product}");
		for (final ProductModel model : result.getResult())
		{
			System.out.println("code : " + model.getCode() + " Name:" + model.getName() + " Description:" + model.getDescription());
		}




		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);

	}


	/**
	 * @return the flexibleSearchService
	 */
	public FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}


	/**
	 * @param flexibleSearchService
	 *           the flexibleSearchService to set
	 */
	@Override
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}

}
