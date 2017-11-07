package com.elong.hotel.hotelconfirm.confirmorder.request;

import java.io.Serializable;
import java.util.List;

import com.elong.hotel.common.annotaitions.CollectionNotBlank;



public class GetEbookingOnlineRequest  implements Serializable{

	private static final long serialVersionUID = -1037196627142188368L;
	

	@CollectionNotBlank(message="酒店ids不能为空")
	private List<String> hotelIdList;

	public List<String> getHotelIdList() {
		return hotelIdList;
	}

	public void setHotelIdList(List<String> hotelIdList) {
		this.hotelIdList = hotelIdList;
	}
	
}
