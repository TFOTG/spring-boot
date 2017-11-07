package com.elong.hotel.proxy.javaorder.response;

import com.elong.hotel.proxy.javaorder.getorder.GetOrderStatusChangeTimeBo;

/**
 * Created by Hualong.Li on 17/8/4.
 */
public class GetOrderStatusChangeTimeResponse extends OrderResponseBase{

	private GetOrderStatusChangeTimeBo body;

	public GetOrderStatusChangeTimeBo getBody() {
		return body;
	}

	public void setBody(GetOrderStatusChangeTimeBo body) {
		this.body = body;
	}
}
