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
package org.uhire22pp.setup;

import static org.uhire22pp.constants.Uhire22ppConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import org.uhire22pp.constants.Uhire22ppConstants;
import org.uhire22pp.service.Uhire22ppService;


@SystemSetup(extension = Uhire22ppConstants.EXTENSIONNAME)
public class Uhire22ppSystemSetup
{
	private final Uhire22ppService uhire22ppService;

	public Uhire22ppSystemSetup(final Uhire22ppService uhire22ppService)
	{
		this.uhire22ppService = uhire22ppService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		uhire22ppService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return Uhire22ppSystemSetup.class.getResourceAsStream("/uhire22pp/sap-hybris-platform.png");
	}
}
