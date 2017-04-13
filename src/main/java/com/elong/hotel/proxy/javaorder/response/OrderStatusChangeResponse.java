package com.elong.hotel.proxy.javaorder.response;

import com.elong.hotel.proxy.javaorder.getorder.Order;

import java.io.Serializable;

/**
 * Created by Hualong.Li on 16/2/26.
 */
public class OrderStatusChangeResponse extends ServiceResponseBase implements Serializable {

	/**
	 * (变量说明描述)	
	 *
	 * long OrderStatusChangeResponse.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private Order body;

	public Order getBody() {
		return body;
	}

	public void setBody(Order body) {
		this.body = body;
	}

}
