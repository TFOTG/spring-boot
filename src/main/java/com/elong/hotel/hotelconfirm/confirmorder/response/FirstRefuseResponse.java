package com.elong.hotel.hotelconfirm.confirmorder.response;

import java.io.Serializable;
import java.util.Date;

/**
 * 执行command的结果
 */
public class FirstRefuseResponse extends ServerActionResponseBase implements Serializable{

	private Date promiseTime;

	public FirstRefuseResponse() {

	}

	public Date getPromiseTime() {
		return promiseTime;
	}

	public void setPromiseTime(Date promiseTime) {
		this.promiseTime = promiseTime;
	}
}
