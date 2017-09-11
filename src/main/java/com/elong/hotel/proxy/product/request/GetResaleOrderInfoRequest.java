/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.proxy.product.request.GetResaleOrderInfoRequest.java]
 * Createion [2017年9月6日]
 */
package com.elong.hotel.proxy.product.request;

import javax.validation.constraints.NotNull;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class GetResaleOrderInfoRequest {

	@NotNull(message="订单id不能为空")
	private String orders;

	public String getOrders() {
		return orders;
	}

	public void setOrders(String orders) {
		this.orders = orders;
	}
	
}
