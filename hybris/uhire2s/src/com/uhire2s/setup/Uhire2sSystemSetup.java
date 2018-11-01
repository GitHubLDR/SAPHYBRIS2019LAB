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
package com.uhire2s.setup;

import static com.uhire2s.constants.Uhire2sConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import com.uhire2s.constants.Uhire2sConstants;
import com.uhire2s.service.Uhire2sService;


@SystemSetup(extension = Uhire2sConstants.EXTENSIONNAME)
public class Uhire2sSystemSetup
{
	private final Uhire2sService uhire2sService;

	public Uhire2sSystemSetup(final Uhire2sService uhire2sService)
	{
		this.uhire2sService = uhire2sService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		uhire2sService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return Uhire2sSystemSetup.class.getResourceAsStream("/uhire2s/sap-hybris-platform.png");
	}
}
