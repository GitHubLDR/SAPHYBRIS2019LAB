/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package org.uhire33p.setup;

import static org.uhire33p.constants.Uhire33pConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import org.uhire33p.constants.Uhire33pConstants;
import org.uhire33p.service.Uhire33pService;


@SystemSetup(extension = Uhire33pConstants.EXTENSIONNAME)
public class Uhire33pSystemSetup
{
	private final Uhire33pService uhire33pService;

	public Uhire33pSystemSetup(final Uhire33pService uhire33pService)
	{
		this.uhire33pService = uhire33pService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		uhire33pService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return Uhire33pSystemSetup.class.getResourceAsStream("/uhire33p/sap-hybris-platform.png");
	}
}
