package com.elong.hotel.hotelconfirm.ivr.response;

import com.elong.hotel.common.response.ServiceResponseBase;

import java.util.List;

/**
 * Created by Hualong.Li on 17/6/15.
 */
public class Find4IvrResponse extends ServiceResponseBase {

	private int size;

	private List<String> hotelIds;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<String> getHotelIds() {
		return hotelIds;
	}

	public void setHotelIds(List<String> hotelIds) {
		this.hotelIds = hotelIds;
	}
}
