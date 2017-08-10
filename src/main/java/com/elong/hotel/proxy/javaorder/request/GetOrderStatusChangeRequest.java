package com.elong.hotel.proxy.javaorder.request;

import java.util.List;

/**
 * Created by Hualong.Li on 17/8/4.
 */
public class GetOrderStatusChangeRequest {

	private Integer orderId;

	private List<String> preStatusList;

	private String targetStatus;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public List<String> getPreStatusList() {
		return preStatusList;
	}

	public void setPreStatusList(List<String> preStatusList) {
		this.preStatusList = preStatusList;
	}

	public String getTargetStatus() {
		return targetStatus;
	}

	public void setTargetStatus(String targetStatus) {
		this.targetStatus = targetStatus;
	}
}
