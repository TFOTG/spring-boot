package com.elong.hotel.hotelconfirm.confirmorder.response;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * 执行command的结果
 */
public class ServerAction4ChangePromiseTimeResponse extends ServerActionResponseBase implements Serializable{

	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date promiseTime;

	public ServerAction4ChangePromiseTimeResponse() {

	}

	public Date getPromiseTime() {
		return promiseTime;
	}

	public void setPromiseTime(Date promiseTime) {
		this.promiseTime = promiseTime;
	}
}
