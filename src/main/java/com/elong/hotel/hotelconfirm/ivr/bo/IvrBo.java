package com.elong.hotel.hotelconfirm.ivr.bo;

import java.io.Serializable;

/**
 * Created by Hualong.Li on 17/6/12.
 */
public class IvrBo implements Serializable{

	private String hotelId;

	public IvrBo() {
	}

	public IvrBo(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
}
