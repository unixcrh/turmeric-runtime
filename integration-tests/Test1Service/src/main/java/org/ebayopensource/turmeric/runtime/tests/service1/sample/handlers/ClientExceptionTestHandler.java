/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.runtime.tests.service1.sample.handlers;

import org.ebayopensource.turmeric.runtime.common.impl.handlers.BaseHandler;
import org.ebayopensource.turmeric.runtime.common.pipeline.Message;
import org.ebayopensource.turmeric.runtime.common.pipeline.MessageContext;
import org.ebayopensource.turmeric.runtime.tests.service1.exceptions.ServiceException;
import org.ebayopensource.turmeric.runtime.tests.service1.sample.Test1Constants;
import org.ebayopensource.turmeric.runtime.tests.service1.sample.errors.TestServerErrorTypes;


public class ClientExceptionTestHandler extends BaseHandler {

	public void invoke(MessageContext ctx) throws org.ebayopensource.turmeric.runtime.common.exceptions.ServiceException {
		boolean needTest1Exception = false;
		boolean needTest1ServiceException = false;
		Message soaMsg = ctx.getRequestMessage();
		try {
			needTest1Exception = soaMsg.hasTransportHeader(
				Test1Constants.TR_HDR_TEST1_EXCEPTION);
		} catch (ServiceException e) {
			throw new IllegalStateException("Enexpected exception: " + e.toString(), e);
		}
		try {
			needTest1ServiceException = soaMsg.hasTransportHeader(
				Test1Constants.TR_HDR_TEST1_SERVICE_EXCEPTION);
		} catch (ServiceException e) {
			throw new IllegalStateException("Enexpected exception: " + e.toString(), e);
		}

		if (needTest1Exception) {
			throw new NullPointerException();
		}
		if (needTest1ServiceException) {
			throw new ServiceException(TestServerErrorTypes.TEST1_SERVICE_EXCEPTION,
				new Object[] {"my_program_data"});
		}

	}
}
