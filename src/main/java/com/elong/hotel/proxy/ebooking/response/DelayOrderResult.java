package com.elong.hotel.proxy.ebooking.response;

/**
 * Created by yangboyu on 17/4/16.
 */
public class DelayOrderResult {
	

	/**
	 * 订单ID
	 */
	private Integer orderId;
	
	/**
	 * 延迟时间
	 */
	private int delayTime;
	
	/**
	 * ivr可外呼时间
	 */
	private int ivrTime;
	
	/**
	 * 承诺时间
	 */
	private int promiseTime;
	
	/**
	 * ebooking策略id
	 */
	private int stragegyId;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public int getDelayTime() {
		return delayTime;
	}

	public void setDelayTime(int delayTime) {
		this.delayTime = delayTime;
	}

	public int getIvrTime() {
		return ivrTime;
	}

	public void setIvrTime(int ivrTime) {
		this.ivrTime = ivrTime;
	}

	public int getPromiseTime() {
		return promiseTime;
	}

	public void setPromiseTime(int promiseTime) {
		this.promiseTime = promiseTime;
	}

	public int getStragegyId() {
		return stragegyId;
	}

	public void setStragegyId(int stragegyId) {
		this.stragegyId = stragegyId;
	}
}
