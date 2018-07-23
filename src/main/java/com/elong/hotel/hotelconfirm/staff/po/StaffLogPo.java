package com.elong.hotel.hotelconfirm.staff.po;

import java.util.Date;

public class StaffLogPo {

	/**
	 * 员工名称
	 */
	private String staffName;

	/**
	 * 登陆／登出时间
	 */
	private Date opdate;

	/**
	 * 登陆（0）／登出（1）
	 */
	private int logFlag;
	
	/**
	 * 部门
	 */
	private int department;

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public Date getOpdate() {
		return opdate;
	}

	public void setOpdate(Date opdate) {
		this.opdate = opdate;
	}

	public int getLogFlag() {
		return logFlag;
	}

	public void setLogFlag(int logFlag) {
		this.logFlag = logFlag;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

}
