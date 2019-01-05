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
import de.hybris.platform.variants.jalo.VariantProduct;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.harish.core.constants.HarishCoreConstants;

/**
 * Generated class for type {@link org.harish.core.jalo.HarishStyleVariantProduct HarishStyleVariantProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHarishStyleVariantProduct extends VariantProduct
{
	/** Qualifier of the <code>HarishStyleVariantProduct.textField</code> attribute **/
	public static final String TEXTFIELD = "textField";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(VariantProduct.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TEXTFIELD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HarishStyleVariantProduct.textField</code> attribute.
	 * @return the textField
	 */
	public String getTextField(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedHarishStyleVariantProduct.getTextField requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, TEXTFIELD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HarishStyleVariantProduct.textField</code> attribute.
	 * @return the textField
	 */
	public String getTextField()
	{
		return getTextField( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HarishStyleVariantProduct.textField</code> attribute. 
	 * @return the localized textField
	 */
	public Map<Language,String> getAllTextField(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,TEXTFIELD,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HarishStyleVariantProduct.textField</code> attribute. 
	 * @return the localized textField
	 */
	public Map<Language,String> getAllTextField()
	{
		return getAllTextField( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HarishStyleVariantProduct.textField</code> attribute. 
	 * @param value the textField
	 */
	public void setTextField(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedHarishStyleVariantProduct.setTextField requires a session language", 0 );
		}
		setLocalizedProperty(ctx, TEXTFIELD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HarishStyleVariantProduct.textField</code> attribute. 
	 * @param value the textField
	 */
	public void setTextField(final String value)
	{
		setTextField( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HarishStyleVariantProduct.textField</code> attribute. 
	 * @param value the textField
	 */
	public void setAllTextField(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,TEXTFIELD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HarishStyleVariantProduct.textField</code> attribute. 
	 * @param value the textField
	 */
	public void setAllTextField(final Map<Language,String> value)
	{
		setAllTextField( getSession().getSessionContext(), value );
	}
	
}
