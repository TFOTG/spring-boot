package com.elong.hotel.hotelconfirm.group.po;

import java.io.Serializable;

public class GetGroupNamePo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String groupName;

	private Integer id;

	private String staffName;

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

}
