package com.elong.hotel.proxy.javaorder.request;

import java.util.List;

public class GetOrderPayStatusRequest {

	private List<Integer> orderIds;

	public List<Integer> getOrderIds() {
		return orderIds;
	}

	public void setOrderIds(List<Integer> orderIds) {
		this.orderIds = orderIds;
	}

}
