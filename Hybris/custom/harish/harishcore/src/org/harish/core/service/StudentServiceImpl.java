/**
*
*/
package org.harish.core.service;

import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.site.BaseSiteService;
import de.hybris.platform.store.services.BaseStoreService;

import java.util.List;

import org.harish.core.dao.StudentDao;
import org.harish.core.event.StudentRegistrationEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.training.model.StudentModel;


/**
 * @author harish marsleno
 *
 */
@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentDao studentDao;


	@Autowired
	private BaseStoreService baseStoreService;
	@Autowired
	private BaseSiteService baseSiteService;

	@Autowired
	private EventService eventService;
	@Autowired
	private CommonI18NService commonI18NService;

	/**
	 * @return the baseStoreService
	 */
	public BaseStoreService getBaseStoreService()
	{
		return baseStoreService;
	}

	/**
	 * @param baseStoreService
	 *           the baseStoreService to set
	 */
	public void setBaseStoreService(final BaseStoreService baseStoreService)
	{
		this.baseStoreService = baseStoreService;
	}

	/**
	 * @return the baseSiteService
	 */
	public BaseSiteService getBaseSiteService()
	{
		return baseSiteService;
	}

	/**
	 * @param baseSiteService
	 *           the baseSiteService to set
	 */
	public void setBaseSiteService(final BaseSiteService baseSiteService)
	{
		this.baseSiteService = baseSiteService;
	}

	/**
	 * @return the eventService
	 */
	public EventService getEventService()
	{
		return eventService;
	}

	/**
	 * @param eventService
	 *           the eventService to set
	 */
	public void setEventService(final EventService eventService)
	{
		this.eventService = eventService;
	}

	/**
	 * @return the commonI18NService
	 */
	public CommonI18NService getCommonI18NService()
	{
		return commonI18NService;
	}

	/**
	 * @param commonI18NService
	 *           the commonI18NService to set
	 */
	public void setCommonI18NService(final CommonI18NService commonI18NService)
	{
		this.commonI18NService = commonI18NService;
	}




	/**
	 * @return the studentDao
	 */
	public StudentDao getStudentDao()
	{
		return studentDao;
	}

	/**
	 * @param studentDao
	 *           the studentDao to set
	 */
	public void setStudentDao(final StudentDao studentDao)
	{
		this.studentDao = studentDao;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.harish.core.service.StudentService#getAllStudents()
	 */
	@Override
	public List<StudentModel> getAllStudents()
	{
		// YTODO Auto-generated method stub
		return studentDao.getAllStudents();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.harish.core.service.StudentService#getStudentbyId(java.lang.String)
	 */
	@Override
	public StudentModel getStudentbyId(final String id)
	{
		// YTODO Auto-generated method stub
		return studentDao.getStudentbyId(id);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.harish.core.service.StudentService#regStudent(org.training.model.StudentModel)
	 */
	@Override
	public void regStudent(final StudentModel student)
	{
		// YTODO Auto-generated method stub

		studentDao.regStudent(student);

		final StudentRegistrationEvent event = new StudentRegistrationEvent();
		event.setBaseStore(baseStoreService.getCurrentBaseStore());
		event.setSite(baseSiteService.getCurrentBaseSite());
		event.setCurrency(commonI18NService.getCurrentCurrency());
		event.setLanguage(commonI18NService.getCurrentLanguage());
		event.setStudent(student);
		eventService.publishEvent(event);


	}

}
