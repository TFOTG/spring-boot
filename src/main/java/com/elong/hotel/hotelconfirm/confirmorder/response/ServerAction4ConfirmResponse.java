package com.elong.hotel.hotelconfirm.confirmorder.response;

import java.io.Serializable;

/**
 * 执行command的结果
 */
public class ServerAction4ConfirmResponse extends ServerActionResponseBase implements Serializable{

	private Boolean isFirstRefuse;

	public ServerAction4ConfirmResponse(){

	}

	public Boolean getIsFirstRefuse() {
		return isFirstRefuse;
	}

	public void setIsFirstRefuse(Boolean isFirstRefuse) {
		this.isFirstRefuse = isFirstRefuse;
	}
}
