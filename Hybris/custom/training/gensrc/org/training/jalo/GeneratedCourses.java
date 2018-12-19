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
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.training.constants.TrainingConstants;
import org.training.jalo.Student;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Courses}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCourses extends GenericItem
{
	/** Qualifier of the <code>Courses.courseName</code> attribute **/
	public static final String COURSENAME = "courseName";
	/** Qualifier of the <code>Courses.fee</code> attribute **/
	public static final String FEE = "fee";
	/** Qualifier of the <code>Courses.students</code> attribute **/
	public static final String STUDENTS = "students";
	/** Relation ordering override parameter constants for Student2CourseRel from ((training))*/
	protected static String STUDENT2COURSEREL_SRC_ORDERED = "relation.Student2CourseRel.source.ordered";
	protected static String STUDENT2COURSEREL_TGT_ORDERED = "relation.Student2CourseRel.target.ordered";
	/** Relation disable markmodifed parameter constants for Student2CourseRel from ((training))*/
	protected static String STUDENT2COURSEREL_MARKMODIFIED = "relation.Student2CourseRel.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COURSENAME, AttributeMode.INITIAL);
		tmp.put(FEE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.courseName</code> attribute.
	 * @return the courseName
	 */
	public String getCourseName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCourses.getCourseName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, COURSENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.courseName</code> attribute.
	 * @return the courseName
	 */
	public String getCourseName()
	{
		return getCourseName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.courseName</code> attribute. 
	 * @return the localized courseName
	 */
	public Map<Language,String> getAllCourseName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,COURSENAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.courseName</code> attribute. 
	 * @return the localized courseName
	 */
	public Map<Language,String> getAllCourseName()
	{
		return getAllCourseName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.courseName</code> attribute. 
	 * @param value the courseName
	 */
	public void setCourseName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCourses.setCourseName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, COURSENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.courseName</code> attribute. 
	 * @param value the courseName
	 */
	public void setCourseName(final String value)
	{
		setCourseName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.courseName</code> attribute. 
	 * @param value the courseName
	 */
	public void setAllCourseName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,COURSENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.courseName</code> attribute. 
	 * @param value the courseName
	 */
	public void setAllCourseName(final Map<Language,String> value)
	{
		setAllCourseName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.fee</code> attribute.
	 * @return the fee
	 */
	public String getFee(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCourses.getFee requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, FEE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.fee</code> attribute.
	 * @return the fee
	 */
	public String getFee()
	{
		return getFee( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.fee</code> attribute. 
	 * @return the localized fee
	 */
	public Map<Language,String> getAllFee(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,FEE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.fee</code> attribute. 
	 * @return the localized fee
	 */
	public Map<Language,String> getAllFee()
	{
		return getAllFee( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.fee</code> attribute. 
	 * @param value the fee
	 */
	public void setFee(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCourses.setFee requires a session language", 0 );
		}
		setLocalizedProperty(ctx, FEE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.fee</code> attribute. 
	 * @param value the fee
	 */
	public void setFee(final String value)
	{
		setFee( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.fee</code> attribute. 
	 * @param value the fee
	 */
	public void setAllFee(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,FEE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.fee</code> attribute. 
	 * @param value the fee
	 */
	public void setAllFee(final Map<Language,String> value)
	{
		setAllFee( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.students</code> attribute.
	 * @return the students
	 */
	public List<Student> getStudents(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCourses.getStudents requires a session language", 0 );
		}
		final List<Student> items = getLinkedItems( 
			ctx,
			false,
			TrainingConstants.Relations.STUDENT2COURSEREL,
			"Student",
			ctx.getLanguage(),
			Utilities.getRelationOrderingOverride(STUDENT2COURSEREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(STUDENT2COURSEREL_TGT_ORDERED, true)
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.students</code> attribute.
	 * @return the students
	 */
	public List<Student> getStudents()
	{
		return getStudents( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.students</code> attribute. 
	 * @return the localized students
	 */
	public Map<Language,List<Student>> getAllStudents(final SessionContext ctx)
	{
		Map<Language,List<Student>> values = getAllLinkedItems( 
			false,
			TrainingConstants.Relations.STUDENT2COURSEREL
		);
		return values;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.students</code> attribute. 
	 * @return the localized students
	 */
	public Map<Language,List<Student>> getAllStudents()
	{
		return getAllStudents( getSession().getSessionContext() );
	}
	
	public long getStudentsCount(final SessionContext ctx, final Language lang)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TrainingConstants.Relations.STUDENT2COURSEREL,
			"Student",
			lang
		);
	}
	
	public long getStudentsCount(final Language lang)
	{
		return getStudentsCount( getSession().getSessionContext(),lang );
	}
	
	public long getStudentsCount(final SessionContext ctx)
	{
		return getStudentsCount( ctx, ctx.getLanguage() );
	}
	
	public long getStudentsCount()
	{
		return getStudentsCount( getSession().getSessionContext(), getSession().getSessionContext().getLanguage() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.students</code> attribute. 
	 * @param value the students
	 */
	public void setStudents(final SessionContext ctx, final List<Student> value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCourses.setStudents requires a session language", 0 );
		}
		setLinkedItems( 
			ctx,
			false,
			TrainingConstants.Relations.STUDENT2COURSEREL,
			ctx.getLanguage(),
			value,
			Utilities.getRelationOrderingOverride(STUDENT2COURSEREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(STUDENT2COURSEREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(STUDENT2COURSEREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.students</code> attribute. 
	 * @param value the students
	 */
	public void setStudents(final List<Student> value)
	{
		setStudents( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.students</code> attribute. 
	 * @param value the students
	 */
	public void setAllStudents(final SessionContext ctx, final Map<Language,List<Student>> value)
	{
		setAllLinkedItems( 
			getAllValuesSessionContext(ctx),
			false,
			TrainingConstants.Relations.STUDENT2COURSEREL,
			value
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.students</code> attribute. 
	 * @param value the students
	 */
	public void setAllStudents(final Map<Language,List<Student>> value)
	{
		setAllStudents( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to students. 
	 * @param value the item to add to students
	 */
	public void addToStudents(final SessionContext ctx, final Language lang, final Student value)
	{
		if( lang == null )
		{
			throw new JaloInvalidParameterException("GeneratedCourses.addToStudents requires a language language", 0 );
		}
		addLinkedItems( 
			ctx,
			false,
			TrainingConstants.Relations.STUDENT2COURSEREL,
			lang,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(STUDENT2COURSEREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(STUDENT2COURSEREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(STUDENT2COURSEREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to students. 
	 * @param value the item to add to students
	 */
	public void addToStudents(final Language lang, final Student value)
	{
		addToStudents( getSession().getSessionContext(), lang, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from students. 
	 * @param value the item to remove from students
	 */
	public void removeFromStudents(final SessionContext ctx, final Language lang, final Student value)
	{
		if( lang == null )
		{
			throw new JaloInvalidParameterException("GeneratedCourses.removeFromStudents requires a session language", 0 );
		}
		removeLinkedItems( 
			ctx,
			false,
			TrainingConstants.Relations.STUDENT2COURSEREL,
			lang,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(STUDENT2COURSEREL_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(STUDENT2COURSEREL_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(STUDENT2COURSEREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from students. 
	 * @param value the item to remove from students
	 */
	public void removeFromStudents(final Language lang, final Student value)
	{
		removeFromStudents( getSession().getSessionContext(), lang, value );
	}
	
}
