package com.elong.hotel.log.hotelconfirm.po;

import java.io.Serializable;

public class CountStaffDataPo implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 员工名称
	 */
	private String staffName;

	/**
	 * 处理量
	 */
	private int handleCount;

	/**
	 * 获取量
	 */
	private int fetchCount;

	/**
	 * 确认量
	 */
	private int confirmCount;

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public int getHandleCount() {
		return handleCount;
	}

	public void setHandleCount(int handleCount) {
		this.handleCount = handleCount;
	}

	public int getFetchCount() {
		return fetchCount;
	}

	public void setFetchCount(int fetchCount) {
		this.fetchCount = fetchCount;
	}

	public int getConfirmCount() {
		return confirmCount;
	}

	public void setConfirmCount(int confirmCount) {
		this.confirmCount = confirmCount;
	}

}
