package com.elong.hotel.proxy.ebooking.response;

import java.io.Serializable;

/**
 * Created by yangboyu on 17/4/16.
 */
public class DelayOrderResult implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	private int strategyId;

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

	public int getStrategyId() {
		return strategyId;
	}

	public void setStrategyId(int strategyId) {
		this.strategyId = strategyId;
	}

}
