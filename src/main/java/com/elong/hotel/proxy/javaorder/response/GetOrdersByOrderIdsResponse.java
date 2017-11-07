package com.elong.hotel.proxy.javaorder.response;

import com.elong.hotel.proxy.javaorder.getorder.Order;

import java.util.List;

/**
 * 根据订单号集合 查询订单信息
 * 
 * @author zouyufei
 *
 */
public class GetOrdersByOrderIdsResponse extends OrderResponseBase {
	// 订单数据
	private List<Order> body;

	public List<Order> getBody() {
		return body;
	}

	public void setBody(List<Order> body) {
		this.body = body;
	}

}
