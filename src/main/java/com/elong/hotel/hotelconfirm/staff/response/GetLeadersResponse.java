package com.elong.hotel.hotelconfirm.staff.response;

import java.util.List;

import com.elong.hotel.mis.common.model.response.ResponseBase;

public class GetLeadersResponse extends ResponseBase {

	private List<String> leaders;

	public List<String> getLeaders() {
		return leaders;
	}

	public void setLeaders(List<String> leaders) {
		this.leaders = leaders;
	}

}
