/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.common.response.OrderBodyResponse.java]
 * Createion [2017年5月3日]
 */
package com.elong.hotel.common.response;

import java.util.List;

import com.elong.hotel.proxy.javaorder.getorder.Order;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class OrderBodyResponse {
	
	private String hasNext;

	private List<Order> orders;

	public String getHasNext() {
		return hasNext;
	}

	public void setHasNext(String hasNext) {
		this.hasNext = hasNext;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}
