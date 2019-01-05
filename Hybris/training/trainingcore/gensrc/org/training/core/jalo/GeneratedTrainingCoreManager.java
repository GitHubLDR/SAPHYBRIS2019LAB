/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jan 5, 2019 11:09:48 AM                     ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.ApparelProduct;
import org.training.core.jalo.ApparelSizeVariantProduct;
import org.training.core.jalo.ApparelStyleVariantProduct;
import org.training.core.jalo.ElectronicsColorVariantProduct;

/**
 * Generated class for type <code>TrainingCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTrainingCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("phoneNumber", AttributeMode.INITIAL);
		tmp.put("dateOfBirth", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.dateOfBirth</code> attribute.
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth(final SessionContext ctx, final Customer item)
	{
		return (Date)item.getProperty( ctx, TrainingCoreConstants.Attributes.Customer.DATEOFBIRTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.dateOfBirth</code> attribute.
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth(final Customer item)
	{
		return getDateOfBirth( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.dateOfBirth</code> attribute. 
	 * @param value the dateOfBirth
	 */
	public void setDateOfBirth(final SessionContext ctx, final Customer item, final Date value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Customer.DATEOFBIRTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.dateOfBirth</code> attribute. 
	 * @param value the dateOfBirth
	 */
	public void setDateOfBirth(final Customer item, final Date value)
	{
		setDateOfBirth( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return TrainingCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.phoneNumber</code> attribute.
	 * @return the phoneNumber
	 */
	public String getPhoneNumber(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.Customer.PHONENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.phoneNumber</code> attribute.
	 * @return the phoneNumber
	 */
	public String getPhoneNumber(final Customer item)
	{
		return getPhoneNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.phoneNumber</code> attribute. 
	 * @param value the phoneNumber
	 */
	public void setPhoneNumber(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Customer.PHONENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.phoneNumber</code> attribute. 
	 * @param value the phoneNumber
	 */
	public void setPhoneNumber(final Customer item, final String value)
	{
		setPhoneNumber( getSession().getSessionContext(), item, value );
	}
	
}
