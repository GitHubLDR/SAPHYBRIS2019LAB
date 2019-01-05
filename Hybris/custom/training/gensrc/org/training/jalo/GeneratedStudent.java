/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 5, 2018 11:39:07 PM                     ---
 * ----------------------------------------------------------------
 */
package org.training.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.training.constants.TrainingConstants;
import org.training.jalo.Courses;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Student}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStudent extends GenericItem
{
	/** Qualifier of the <code>Student.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Student.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Student.email</code> attribute **/
	public static final String EMAIL = "email";
	/** Qualifier of the <code>Student.phoneNumber</code> attribute **/
	public static final String PHONENUMBER = "phoneNumber";
	/** Qualifier of the <code>Student.gender</code> attribute **/
	public static final String GENDER = "gender";
	/** Qualifier of the <code>Student.feedback</code> attribute **/
	public static final String FEEDBACK = "feedback";
	/** Qualifier of the <code>Student.hobbies</code> attribute **/
	public static final String HOBBIES = "hobbies";
	/** Qualifier of the <code>Student.courses</code> attribute **/
	public static final String COURSES = "courses";
	/** Relation ordering override parameter constants for Student2CourseRel from ((training))*/
	protected static String STUDENT2COURSEREL_SRC_ORDERED = "relation.Student2CourseRel.source.ordered";
	protected static String STUDENT2COURSEREL_TGT_ORDERED = "relation.Student2CourseRel.target.ordered";
	/** Relation disable markmodifed parameter constants for Student2CourseRel from ((training))*/
	protected static String STUDENT2COURSEREL_MARKMODIFIED = "relation.Student2CourseRel.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(EMAIL, AttributeMode.INITIAL);
		tmp.put(PHONENUMBER, AttributeMode.INITIAL);
		tmp.put(GENDER, AttributeMode.INITIAL);
		tmp.put(FEEDBACK, AttributeMode.INITIAL);
		tmp.put(HOBBIES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.courses</code> attribute.
	 * @return the courses
	 */
	public List<Courses> getCourses(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedStudent.getCourses requires a session language", 0 );
		}
		final List<Courses> items = getLinkedItems( 
			ctx,
			true,
			TrainingConstants.Relations.STUDENT2COURSEREL,
			"Courses",
			ctx.getLanguage(),
			Utilities.getRelationOrderingOverride(STUDENT2COURSEREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(STUDENT2COURSEREL_TGT_ORDERED, true)
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.courses</code> attribute.
	 * @return the courses
	 */
	public List<Courses> getCourses()
	{
		return getCourses( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.courses</code> attribute. 
	 * @return the localized courses
	 */
	public Map<Language,List<Courses>> getAllCourses(final SessionContext ctx)
	{
		Map<Language,List<Courses>> values = getAllLinkedItems( 
			true,
			TrainingConstants.Relations.STUDENT2COURSEREL
		);
		return values;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.courses</code> attribute. 
	 * @return the localized courses
	 */
	public Map<Language,List<Courses>> getAllCourses()
	{
		return getAllCourses( getSession().getSessionContext() );
	}
	
	public long getCoursesCount(final SessionContext ctx, final Language lang)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TrainingConstants.Relations.STUDENT2COURSEREL,
			"Courses",
			lang
		);
	}
	
	public long getCoursesCount(final Language lang)
	{
		return getCoursesCount( getSession().getSessionContext(),lang );
	}
	
	public long getCoursesCount(final SessionContext ctx)
	{
		return getCoursesCount( ctx, ctx.getLanguage() );
	}
	
	public long getCoursesCount()
	{
		return getCoursesCount( getSession().getSessionContext(), getSession().getSessionContext().getLanguage() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.courses</code> attribute. 
	 * @param value the courses
	 */
	public void setCourses(final SessionContext ctx, final List<Courses> value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedStudent.setCourses requires a session language", 0 );
		}
		setLinkedItems( 
			ctx,
			true,
			TrainingConstants.Relations.STUDENT2COURSEREL,
			ctx.getLanguage(),
			value,
			Utilities.getRelationOrderingOverride(STUDENT2COURSEREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(STUDENT2COURSEREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(STUDENT2COURSEREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.courses</code> attribute. 
	 * @param value the courses
	 */
	public void setCourses(final List<Courses> value)
	{
		setCourses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.courses</code> attribute. 
	 * @param value the courses
	 */
	public void setAllCourses(final SessionContext ctx, final Map<Language,List<Courses>> value)
	{
		setAllLinkedItems( 
			getAllValuesSessionContext(ctx),
			true,
			TrainingConstants.Relations.STUDENT2COURSEREL,
			value
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.courses</code> attribute. 
	 * @param value the courses
	 */
	public void setAllCourses(final Map<Language,List<Courses>> value)
	{
		setAllCourses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to courses. 
	 * @param value the item to add to courses
	 */
	public void addToCourses(final SessionContext ctx, final Language lang, final Courses value)
	{
		if( lang == null )
		{
			throw new JaloInvalidParameterException("GeneratedStudent.addToCourses requires a language language", 0 );
		}
		addLinkedItems( 
			ctx,
			true,
			TrainingConstants.Relations.STUDENT2COURSEREL,
			lang,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(STUDENT2COURSEREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(STUDENT2COURSEREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(STUDENT2COURSEREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to courses. 
	 * @param value the item to add to courses
	 */
	public void addToCourses(final Language lang, final Courses value)
	{
		addToCourses( getSession().getSessionContext(), lang, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from courses. 
	 * @param value the item to remove from courses
	 */
	public void removeFromCourses(final SessionContext ctx, final Language lang, final Courses value)
	{
		if( lang == null )
		{
			throw new JaloInvalidParameterException("GeneratedStudent.removeFromCourses requires a session language", 0 );
		}
		removeLinkedItems( 
			ctx,
			true,
			TrainingConstants.Relations.STUDENT2COURSEREL,
			lang,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(STUDENT2COURSEREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(STUDENT2COURSEREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(STUDENT2COURSEREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from courses. 
	 * @param value the item to remove from courses
	 */
	public void removeFromCourses(final Language lang, final Courses value)
	{
		removeFromCourses( getSession().getSessionContext(), lang, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.email</code> attribute.
	 * @return the email
	 */
	public String getEmail(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedStudent.getEmail requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.email</code> attribute.
	 * @return the email
	 */
	public String getEmail()
	{
		return getEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.email</code> attribute. 
	 * @return the localized email
	 */
	public Map<Language,String> getAllEmail(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,EMAIL,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.email</code> attribute. 
	 * @return the localized email
	 */
	public Map<Language,String> getAllEmail()
	{
		return getAllEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedStudent.setEmail requires a session language", 0 );
		}
		setLocalizedProperty(ctx, EMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final String value)
	{
		setEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.email</code> attribute. 
	 * @param value the email
	 */
	public void setAllEmail(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,EMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.email</code> attribute. 
	 * @param value the email
	 */
	public void setAllEmail(final Map<Language,String> value)
	{
		setAllEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.feedback</code> attribute.
	 * @return the feedback
	 */
	public Map<Date,String> getAllFeedback(final SessionContext ctx)
	{
		Map<Date,String> map = (Map<Date,String>)getProperty( ctx, FEEDBACK);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.feedback</code> attribute.
	 * @return the feedback
	 */
	public Map<Date,String> getAllFeedback()
	{
		return getAllFeedback( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.feedback</code> attribute. 
	 * @param value the feedback
	 */
	public void setAllFeedback(final SessionContext ctx, final Map<Date,String> value)
	{
		setProperty(ctx, FEEDBACK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.feedback</code> attribute. 
	 * @param value the feedback
	 */
	public void setAllFeedback(final Map<Date,String> value)
	{
		setAllFeedback( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.gender</code> attribute.
	 * @return the gender
	 */
	public EnumerationValue getGender(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, GENDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.gender</code> attribute.
	 * @return the gender
	 */
	public EnumerationValue getGender()
	{
		return getGender( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.gender</code> attribute. 
	 * @param value the gender
	 */
	public void setGender(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, GENDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.gender</code> attribute. 
	 * @param value the gender
	 */
	public void setGender(final EnumerationValue value)
	{
		setGender( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.hobbies</code> attribute.
	 * @return the hobbies
	 */
	public List<String> getHobbies(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, HOBBIES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.hobbies</code> attribute.
	 * @return the hobbies
	 */
	public List<String> getHobbies()
	{
		return getHobbies( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.hobbies</code> attribute. 
	 * @param value the hobbies
	 */
	public void setHobbies(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, HOBBIES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.hobbies</code> attribute. 
	 * @param value the hobbies
	 */
	public void setHobbies(final List<String> value)
	{
		setHobbies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedStudent.getId requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.id</code> attribute. 
	 * @return the localized id
	 */
	public Map<Language,String> getAllId(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,ID,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.id</code> attribute. 
	 * @return the localized id
	 */
	public Map<Language,String> getAllId()
	{
		return getAllId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedStudent.setId requires a session language", 0 );
		}
		setLocalizedProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.id</code> attribute. 
	 * @param value the id
	 */
	public void setAllId(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.id</code> attribute. 
	 * @param value the id
	 */
	public void setAllId(final Map<Language,String> value)
	{
		setAllId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedStudent.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedStudent.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.phoneNumber</code> attribute.
	 * @return the phoneNumber
	 */
	public String getPhoneNumber(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedStudent.getPhoneNumber requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, PHONENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.phoneNumber</code> attribute.
	 * @return the phoneNumber
	 */
	public String getPhoneNumber()
	{
		return getPhoneNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.phoneNumber</code> attribute. 
	 * @return the localized phoneNumber
	 */
	public Map<Language,String> getAllPhoneNumber(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,PHONENUMBER,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.phoneNumber</code> attribute. 
	 * @return the localized phoneNumber
	 */
	public Map<Language,String> getAllPhoneNumber()
	{
		return getAllPhoneNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.phoneNumber</code> attribute. 
	 * @param value the phoneNumber
	 */
	public void setPhoneNumber(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedStudent.setPhoneNumber requires a session language", 0 );
		}
		setLocalizedProperty(ctx, PHONENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.phoneNumber</code> attribute. 
	 * @param value the phoneNumber
	 */
	public void setPhoneNumber(final String value)
	{
		setPhoneNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.phoneNumber</code> attribute. 
	 * @param value the phoneNumber
	 */
	public void setAllPhoneNumber(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,PHONENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.phoneNumber</code> attribute. 
	 * @param value the phoneNumber
	 */
	public void setAllPhoneNumber(final Map<Language,String> value)
	{
		setAllPhoneNumber( getSession().getSessionContext(), value );
	}
	
}
