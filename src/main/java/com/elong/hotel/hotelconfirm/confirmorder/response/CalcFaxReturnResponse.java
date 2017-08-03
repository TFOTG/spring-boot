package com.elong.hotel.hotelconfirm.confirmorder.response;

import com.elong.hotel.common.response.ServiceResponseBase;

import java.io.Serializable;

/**
 * Created by Hualong.Li on 17/8/3.
 */
public class CalcFaxReturnResponse extends ServiceResponseBase implements Serializable {

	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
