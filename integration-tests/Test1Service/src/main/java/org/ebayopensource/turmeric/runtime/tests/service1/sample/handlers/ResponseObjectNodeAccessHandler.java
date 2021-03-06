/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.runtime.tests.service1.sample.handlers;

import org.ebayopensource.turmeric.runtime.binding.objectnode.ObjectNode;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceException;
import org.ebayopensource.turmeric.runtime.common.impl.handlers.BaseHandler;
import org.ebayopensource.turmeric.runtime.common.pipeline.Message;
import org.ebayopensource.turmeric.runtime.common.pipeline.MessageContext;


public class ResponseObjectNodeAccessHandler extends BaseHandler {
	public static final String H_RESPONSE_BODY_NODE_CLASS_TYPE = "TestHeaderResponseBodyClassType";
	public static final String H_RESPONSE_BODY_NODE_TYPE = "TestHeaderResponseBodyNodeType";
	
	public void invoke(MessageContext ctx) throws ServiceException {
		Message response = ctx.getResponseMessage();
		ObjectNode body = response.getMessageBody();
		if (null != body) {
			response.setTransportHeader(H_RESPONSE_BODY_NODE_TYPE, body.getNodeType().name());
			response.setTransportHeader(H_RESPONSE_BODY_NODE_CLASS_TYPE, body.getNodeValue().getClass().getSimpleName());
		}
	}
}
