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
package org.uhire2pppp.setup;

import static org.uhire2pppp.constants.Uhire2ppppConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import org.uhire2pppp.constants.Uhire2ppppConstants;
import org.uhire2pppp.service.Uhire2ppppService;


@SystemSetup(extension = Uhire2ppppConstants.EXTENSIONNAME)
public class Uhire2ppppSystemSetup
{
	private final Uhire2ppppService uhire2ppppService;

	public Uhire2ppppSystemSetup(final Uhire2ppppService uhire2ppppService)
	{
		this.uhire2ppppService = uhire2ppppService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		uhire2ppppService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return Uhire2ppppSystemSetup.class.getResourceAsStream("/uhire2pppp/sap-hybris-platform.png");
	}
}
