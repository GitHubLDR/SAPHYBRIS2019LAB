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
package com.uhire.new.setup;

import static com.uhire.new.constants.UhirenewConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import com.uhire.new.constants.UhirenewConstants;
import com.uhire.new.service.UhirenewService;


@SystemSetup(extension = UhirenewConstants.EXTENSIONNAME)
public class UhirenewSystemSetup
{
	private final UhirenewService uhirenewService;

	public UhirenewSystemSetup(final UhirenewService uhirenewService)
	{
		this.uhirenewService = uhirenewService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		uhirenewService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return UhirenewSystemSetup.class.getResourceAsStream("/uhirenew/sap-hybris-platform.png");
	}
}
