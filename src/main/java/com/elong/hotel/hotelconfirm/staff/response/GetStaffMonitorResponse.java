package com.elong.hotel.hotelconfirm.staff.response;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.elong.hotel.hotelconfirm.staff.bo.StaffMonitorBo;
import com.elong.hotel.mis.common.model.response.ResponseBase;

public class GetStaffMonitorResponse extends ResponseBase {

	@JSONField(format = "HH:mm")
	private Date lastBeginTime;

	@JSONField(format = "HH:mm")
	private Date lastEndTime;

	private List<StaffMonitorBo> list;

	public List<StaffMonitorBo> getList() {
		return list;
	}

	public void setList(List<StaffMonitorBo> list) {
		this.list = list;
	}

	public Date getLastBeginTime() {
		return lastBeginTime;
	}

	public void setLastBeginTime(Date lastBeginTime) {
		this.lastBeginTime = lastBeginTime;
	}

	public Date getLastEndTime() {
		return lastEndTime;
	}

	public void setLastEndTime(Date lastEndTime) {
		this.lastEndTime = lastEndTime;
	}

}
