package com.elong.hotel.hotelconfirm.confirmorder.response;

import com.elong.hotel.common.response.ServiceResponseBase;

import java.util.List;

public class GetOrderByStaffResponse extends ServiceResponseBase {


	List<String> orderIdList;

	public List<String> getOrderIdList() {
		return orderIdList;
	}

	public void setOrderIdList(List<String> orderIdList) {
		this.orderIdList = orderIdList;
	}
}