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
package com.uhire.training.setup;

import static com.uhire.training.constants.UhiretrainingConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import com.uhire.training.constants.UhiretrainingConstants;
import com.uhire.training.service.UhiretrainingService;


@SystemSetup(extension = UhiretrainingConstants.EXTENSIONNAME)
public class UhiretrainingSystemSetup
{
	private final UhiretrainingService uhiretrainingService;

	public UhiretrainingSystemSetup(final UhiretrainingService uhiretrainingService)
	{
		this.uhiretrainingService = uhiretrainingService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		uhiretrainingService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return UhiretrainingSystemSetup.class.getResourceAsStream("/uhiretraining/sap-hybris-platform.png");
	}
}
