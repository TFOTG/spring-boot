package com.elong.hotel.common.config;

/**
 * Created by peng.wang on 17/3/9.
 */
public class ServiceConfig {


	/**
	 * 确认兜底任务时间间隔
	 */
	private int confirmOrderInDBTaskInterval;

	/**
	 * 调用订单接口超时时间
	 */
	private int getOrderTimeOut;
	
	public int getConfirmOrderInDBTaskInterval() {
		return confirmOrderInDBTaskInterval;
	}

	public void setConfirmOrderInDBTaskInterval(int confirmOrderInDBTaskInterval) {
		this.confirmOrderInDBTaskInterval = confirmOrderInDBTaskInterval;
	}

	public int getGetOrderTimeOut() {
		return getOrderTimeOut;
	}

	public void setGetOrderTimeOut(int getOrderTimeOut) {
		this.getOrderTimeOut = getOrderTimeOut;
	}
	
	
}
