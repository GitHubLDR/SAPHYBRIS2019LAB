/**
 *
 */
package org.harish.core.dao;

import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.training.model.StudentModel;


/**
 * @author harish marsleno
 *
 */
public class CustomerDaoImpl implements CustomerDao
{

	@Autowired
	private FlexibleSearchService flexibleSearchService;

	@Autowired
	private ModelService modelService;

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
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}

	/**
	 * @return the modelService
	 */
	public ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.harish.core.dao.CustomerDao#getAllStudents()
	 */
	@Override
	public List<StudentModel> getAllStudents()
	{
		// YTODO Auto-generated method stub

		final SearchResult<StudentModel> searchResult = flexibleSearchService.search("select {pk} from {student}");

		if (CollectionUtils.isNotEmpty(searchResult.getResult()))
		{
			return searchResult.getResult();
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.harish.core.dao.CustomerDao#getStudentbyid()
	 */
	@Override
	public StudentModel getStudentbyid(final String id)
	{
		// YTODO Auto-generated method stub
		final Map<String, String> param = new HashMap<>();

		param.put("id", id);

		final SearchResult<StudentModel> searchResult = flexibleSearchService.search("select {pk} from {student} where {id} = ?id",
				param);

		if (CollectionUtils.isNotEmpty(searchResult.getResult()))
		{
			return searchResult.getResult().get(0);
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.harish.core.dao.CustomerDao#register(org.training.model.StudentModel)
	 */
	@Override
	public void register(final StudentModel student)
	{
		// YTODO Auto-generated method stub
		modelService.save(student);


	}

}
