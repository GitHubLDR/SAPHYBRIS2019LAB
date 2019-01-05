/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 17, 2018 9:19:36 PM                     ---
 * ----------------------------------------------------------------
 */
package org.harish.core.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.harish.core.constants.HarishCoreConstants;

/**
 * Generated class for type {@link org.harish.core.jalo.ApparelProduct ApparelProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedApparelProduct extends Product
{
	/** Qualifier of the <code>ApparelProduct.genders</code> attribute **/
	public static final String GENDERS = "genders";
	/** Qualifier of the <code>ApparelProduct.mystyle</code> attribute **/
	public static final String MYSTYLE = "mystyle";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(GENDERS, AttributeMode.INITIAL);
		tmp.put(MYSTYLE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.genders</code> attribute.
	 * @return the genders - List of genders that the ApparelProduct is designed for
	 */
	public List<EnumerationValue> getGenders(final SessionContext ctx)
	{
		List<EnumerationValue> coll = (List<EnumerationValue>)getProperty( ctx, GENDERS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.genders</code> attribute.
	 * @return the genders - List of genders that the ApparelProduct is designed for
	 */
	public List<EnumerationValue> getGenders()
	{
		return getGenders( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.genders</code> attribute. 
	 * @param value the genders - List of genders that the ApparelProduct is designed for
	 */
	public void setGenders(final SessionContext ctx, final List<EnumerationValue> value)
	{
		setProperty(ctx, GENDERS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.genders</code> attribute. 
	 * @param value the genders - List of genders that the ApparelProduct is designed for
	 */
	public void setGenders(final List<EnumerationValue> value)
	{
		setGenders( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.mystyle</code> attribute.
	 * @return the mystyle - List of genders that the ApparelProduct is designed for
	 */
	public String getMystyle(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedApparelProduct.getMystyle requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, MYSTYLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.mystyle</code> attribute.
	 * @return the mystyle - List of genders that the ApparelProduct is designed for
	 */
	public String getMystyle()
	{
		return getMystyle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.mystyle</code> attribute. 
	 * @return the localized mystyle - List of genders that the ApparelProduct is designed for
	 */
	public Map<Language,String> getAllMystyle(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,MYSTYLE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.mystyle</code> attribute. 
	 * @return the localized mystyle - List of genders that the ApparelProduct is designed for
	 */
	public Map<Language,String> getAllMystyle()
	{
		return getAllMystyle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.mystyle</code> attribute. 
	 * @param value the mystyle - List of genders that the ApparelProduct is designed for
	 */
	public void setMystyle(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedApparelProduct.setMystyle requires a session language", 0 );
		}
		setLocalizedProperty(ctx, MYSTYLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.mystyle</code> attribute. 
	 * @param value the mystyle - List of genders that the ApparelProduct is designed for
	 */
	public void setMystyle(final String value)
	{
		setMystyle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.mystyle</code> attribute. 
	 * @param value the mystyle - List of genders that the ApparelProduct is designed for
	 */
	public void setAllMystyle(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,MYSTYLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.mystyle</code> attribute. 
	 * @param value the mystyle - List of genders that the ApparelProduct is designed for
	 */
	public void setAllMystyle(final Map<Language,String> value)
	{
		setAllMystyle( getSession().getSessionContext(), value );
	}
	
}
