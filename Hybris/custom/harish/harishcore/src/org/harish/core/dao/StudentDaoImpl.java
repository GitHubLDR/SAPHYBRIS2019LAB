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
public class StudentDaoImpl implements StudentDao
{

	@Autowired
	private ModelService modelService;

	@Autowired
	private FlexibleSearchService flexibleSearchService;




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

	/*
	 * (non-Javadoc)
	 *
	 * @see org.harish.core.dao.StudentDao#getAllStudents()
	 */
	@Override
	public List<StudentModel> getAllStudents()
	{
		// YTODO Auto-generated method stub

		final SearchResult<StudentModel> searchResult = flexibleSearchService.search("select {pk} from {Student}");

		if (CollectionUtils.isNotEmpty(searchResult.getResult()))
		{
			return searchResult.getResult();
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.harish.core.dao.StudentDao#getStudentbyId(java.lang.String)
	 */
	@Override
	public StudentModel getStudentbyId(final String id)
	{


		final Map<String, String> param = new HashMap();

		param.put("id", id);

		final SearchResult<StudentModel> searchResult = flexibleSearchService.search("select {pk} from {Student} where {id} = ?id",
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
	 * @see org.harish.core.dao.StudentDao#regStudent(org.training.model.StudentModel)
	 */
	@Override
	public void regStudent(final StudentModel student)
	{
		// YTODO Auto-generated method stub

		modelService.save(student);



	}

}
