package com.elong.hotel.hotelconfirm.confirmorder.context;

import java.io.Serializable;

public class ServerRuningContext implements Serializable {

	private Integer reserNo;

	public ServerRuningContext() {
	}

	public Integer getReserNo() {
		return reserNo;
	}

	public void setReserNo(Integer reserNo) {
		this.reserNo = reserNo;
	}
}
