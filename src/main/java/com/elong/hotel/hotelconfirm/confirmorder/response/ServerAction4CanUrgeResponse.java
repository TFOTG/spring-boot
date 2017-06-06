package com.elong.hotel.hotelconfirm.confirmorder.response;

import com.elong.hotel.common.response.ServiceResponseBase;

import java.io.Serializable;

/**
 * 执行command的结果
 */
public class ServerAction4CanUrgeResponse extends ServerActionResponseBase implements Serializable{

	private Boolean canUrge;

	private String reson;

	public ServerAction4CanUrgeResponse() {
	}

	public Boolean getCanUrge() {
		return canUrge;
	}

	public void setCanUrge(Boolean canUrge) {
		this.canUrge = canUrge;
	}

	public String getReson() {
		return reson;
	}

	public void setReson(String reson) {
		this.reson = reson;
	}
}
