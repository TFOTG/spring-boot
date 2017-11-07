package com.elong.hotel.hotelconfirm.staff.bo;

import java.io.Serializable;

public class GroupBo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer groupId;

	private String groupName;

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
