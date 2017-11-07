package com.elong.hotel.hotelconfirm.confirmorder.response;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.proxy.javaorder.getorder.RepeatAndLinkOrder;

public class RelationOrderResponse extends ServiceResponseBase {

	private RepeatAndLinkOrder body;

	public RepeatAndLinkOrder getBody() {
		return body;
	}

	public void setBody(RepeatAndLinkOrder body) {
		this.body = body;
	}
}