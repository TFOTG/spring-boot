package com.elong.hotel.hotelconfirm.confirmorder.response;

import java.io.Serializable;
import java.util.Date;

/**
 * 执行command的结果
 */
public class ServerAction4ChangeOrderStatusResponse extends ServerActionResponseBase implements Serializable{

	private Date promiseTime;

	public ServerAction4ChangeOrderStatusResponse() {

	}

	public Date getPromiseTime() {
		return promiseTime;
	}

	public void setPromiseTime(Date promiseTime) {
		this.promiseTime = promiseTime;
	}
}
