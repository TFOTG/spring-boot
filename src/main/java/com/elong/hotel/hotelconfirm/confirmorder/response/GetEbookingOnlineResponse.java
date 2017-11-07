package com.elong.hotel.hotelconfirm.confirmorder.response;

import java.io.Serializable;
import java.util.Map;

import com.elong.hotel.common.response.ServiceResponseBase;

public class GetEbookingOnlineResponse extends ServiceResponseBase implements Serializable{
	
	
	private static final long serialVersionUID = 2229442175239843461L;

	/**
	 * Ek在线
	 */
	private Map<String,Object> hotelOnlineStatusMap;
	
	
	public Map<String, Object> getHotelOnlineStatusMap() {
		return hotelOnlineStatusMap;
	}

	public void setHotelOnlineStatusMap(Map<String, Object> hotelOnlineStatusMap) {
		this.hotelOnlineStatusMap = hotelOnlineStatusMap;
	}
}
