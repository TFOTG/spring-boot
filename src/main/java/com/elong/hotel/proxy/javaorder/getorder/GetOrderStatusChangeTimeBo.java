package com.elong.hotel.proxy.javaorder.getorder;

import java.util.Date;

/**
 * Created by Hualong.Li on 17/8/4.
 */
public class GetOrderStatusChangeTimeBo {
	private Integer orderId;

	private String preStatus;

	private String targetStatus;

	private Date operatorTime;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getPreStatus() {
		return preStatus;
	}

	public void setPreStatus(String preStatus) {
		this.preStatus = preStatus;
	}

	public String getTargetStatus() {
		return targetStatus;
	}

	public void setTargetStatus(String targetStatus) {
		this.targetStatus = targetStatus;
	}

	public Date getOperatorTime() {
		return operatorTime;
	}

	public void setOperatorTime(Date operatorTime) {
		this.operatorTime = operatorTime;
	}
}
