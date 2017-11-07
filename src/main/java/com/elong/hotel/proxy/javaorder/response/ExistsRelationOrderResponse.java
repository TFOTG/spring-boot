package com.elong.hotel.proxy.javaorder.response;

import com.elong.hotel.proxy.javaorder.getorder.RepeatAndLinkOrder;

/**
 * Created by Hualong.Li on 17/6/28.
 */
public class ExistsRelationOrderResponse extends OrderResponseBase {

	private RepeatAndLinkOrder body;

	public RepeatAndLinkOrder getBody() {
		return body;
	}

	public void setBody(RepeatAndLinkOrder body) {
		this.body = body;
	}
}
