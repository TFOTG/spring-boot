package com.elong.hotel.hotelconfirm.staff.vo;

/**
 * Created by Hualong.Li on 17/6/26.
 */
public class StaffVO {

	private String staffName;

	private String leaderName;

	private Integer department;

	private Integer isEnable;

	private Integer isOnline;

	private Integer getOrderInterval;

	private Integer groupId;

	public StaffVO() {
	}

	public StaffVO(Integer isEnable, Integer isOnline, Integer getOrderInterval, String staffName,Integer department) {
		this.isEnable = isEnable;
		this.isOnline = isOnline;
		this.getOrderInterval = getOrderInterval;
		this.staffName = staffName;
		this.department = department;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getLeaderName() {
		return leaderName;
	}

	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}

	public Integer getDepartment() {
		return department;
	}

	public void setDepartment(Integer department) {
		this.department = department;
	}

	public Integer getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(Integer isEnable) {
		this.isEnable = isEnable;
	}

	public Integer getIsOnline() {
		return isOnline;
	}

	public void setIsOnline(Integer isOnline) {
		this.isOnline = isOnline;
	}

	public Integer getGetOrderInterval() {
		return getOrderInterval;
	}

	public void setGetOrderInterval(Integer getOrderInterval) {
		this.getOrderInterval = getOrderInterval;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
}
