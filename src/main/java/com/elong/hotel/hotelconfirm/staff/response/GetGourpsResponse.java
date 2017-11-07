package com.elong.hotel.hotelconfirm.staff.response;

import java.util.List;

import com.elong.hotel.hotelconfirm.staff.bo.GroupBo;
import com.elong.hotel.mis.common.model.response.ResponseBase;

public class GetGourpsResponse extends ResponseBase {

	List<GroupBo> groups;

	public List<GroupBo> getGroups() {
		return groups;
	}

	public void setGroups(List<GroupBo> groups) {
		this.groups = groups;
	}

}
