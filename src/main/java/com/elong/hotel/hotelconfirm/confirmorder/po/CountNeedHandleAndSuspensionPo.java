package com.elong.hotel.hotelconfirm.confirmorder.po;

import java.io.Serializable;

public class CountNeedHandleAndSuspensionPo implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 员工名称
	 */
	private String staffName;

	/**
	 * 领导名称
	 */
	private String leaderName;
	/**
	 * 待处理量
	 */
	private int needHandleCount;

	/**
	 * 暂缓量
	 */
	private int suspensionCount;

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

	public int getNeedHandleCount() {
		return needHandleCount;
	}

	public void setNeedHandleCount(int needHandleCount) {
		this.needHandleCount = needHandleCount;
	}

	public int getSuspensionCount() {
		return suspensionCount;
	}

	public void setSuspensionCount(int suspensionCount) {
		this.suspensionCount = suspensionCount;
	}

}
