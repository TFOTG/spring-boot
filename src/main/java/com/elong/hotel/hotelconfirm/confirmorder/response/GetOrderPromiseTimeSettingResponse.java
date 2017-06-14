package com.elong.hotel.hotelconfirm.confirmorder.response;

import java.io.Serializable;
import java.util.Date;

/**
 * 执行command的结果
 */
public class GetOrderPromiseTimeSettingResponse extends ServerActionResponseBase implements Serializable{

	private Date promiseTime;

	private Integer orderType;

	private Integer promiseTime4Minute;

	public GetOrderPromiseTimeSettingResponse() {
	}

	public Date getPromiseTime() {
		return promiseTime;
	}

	public void setPromiseTime(Date promiseTime) {
		this.promiseTime = promiseTime;
	}

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public Integer getPromiseTime4Minute() {
		return promiseTime4Minute;
	}

	public void setPromiseTime4Minute(Integer promiseTime4Minute) {
		this.promiseTime4Minute = promiseTime4Minute;
	}
}
