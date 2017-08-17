/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.proxy.hotel3.request.Hotel3RoomInfoRequest.java]
 * Createion [2017年8月15日]
 */
package com.elong.hotel.proxy.hotel3.request;

import javax.validation.constraints.NotNull;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class Hotel3RoomInfoRequest {

	@NotNull(message="订单id不能为空")
	private Integer orderId;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
}
