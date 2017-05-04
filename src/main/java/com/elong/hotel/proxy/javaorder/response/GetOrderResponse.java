package com.elong.hotel.proxy.javaorder.response;

import com.elong.hotel.proxy.javaorder.getorder.Order;

/**
 * 调取java getorder接口返回response
 * 
 * @author zouyufei
 *
 */
public class GetOrderResponse extends OrderResponseBase {

	// 订单数据
	private Order body;

	public Order getBody() {
		return body;
	}

	public void setBody(Order body) {
		this.body = body;
	}

}
