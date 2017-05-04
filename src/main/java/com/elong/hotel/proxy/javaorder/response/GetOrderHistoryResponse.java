package com.elong.hotel.proxy.javaorder.response;


import com.elong.hotel.proxy.javaorder.getorder.OrderHistory;

import java.util.List;

/**
 * 调取java getorder接口返回response
 * 
 * @author hualong.li
 *
 */
public class GetOrderHistoryResponse extends OrderResponseBase {

	// 订单数据
	private List<OrderHistory> body;

	public List<OrderHistory> getBody() {
		return body;
	}

	public void setBody(List<OrderHistory> body) {
		this.body = body;
	}
}
