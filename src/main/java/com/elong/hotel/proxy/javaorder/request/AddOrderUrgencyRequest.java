package com.elong.hotel.proxy.javaorder.request;

import com.alibaba.fastjson.annotation.JSONField;

/**
 *
 * 
 * @author
 *
 */
public class AddOrderUrgencyRequest {

	// 操作者信息
	@JSONField(name = "operator")
	private OperatorInfo clientOperatorInfo;
	// 订单号
	private Integer orderId;

	public OperatorInfo getClientOperatorInfo() {
		return clientOperatorInfo;
	}

	public void setClientOperatorInfo(OperatorInfo clientOperatorInfo) {
		this.clientOperatorInfo = clientOperatorInfo;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
}
