package com.elong.hotel.proxy.javaorder.response;

import java.io.Serializable;
import java.util.List;

import com.elong.hotel.proxy.javaorder.getorder.OrderPayStatus;

public class GetOrderPayStatusResponse extends OrderResponseBase implements Serializable {

	private List<OrderPayStatus> body;

	public List<OrderPayStatus> getBody() {
		return body;
	}

	public void setBody(List<OrderPayStatus> body) {
		this.body = body;
	}

}
