package com.elong.hotel.hotelconfirm.staff.response;

import java.util.List;

import com.elong.hotel.hotelconfirm.staff.bo.StaffMonitorBo;
import com.elong.hotel.mis.common.model.response.ResponseBase;

public class GetStaffMonitorResponse extends ResponseBase {

	private List<StaffMonitorBo> list;

	public List<StaffMonitorBo> getList() {
		return list;
	}

	public void setList(List<StaffMonitorBo> list) {
		this.list = list;
	}

}
