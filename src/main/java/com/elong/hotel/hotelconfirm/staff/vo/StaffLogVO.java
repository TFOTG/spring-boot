/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.staff.vo.StaffLogVO.java]
 * Createion [2017年7月18日]
 */
package com.elong.hotel.hotelconfirm.staff.vo;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class StaffLogVO {

	/**
	 * 员工登录名称
	 */
	private String staffname;
	
	/**
	 * 0 登录 1登出
	 */
	private int logflag;
	
	/**
	 * 时间
	 */
	private String opdate;

	public String getStaffname() {
		return staffname;
	}

	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}

	public int getLogflag() {
		return logflag;
	}

	public void setLogflag(int logflag) {
		this.logflag = logflag;
	}

	public String getOpdate() {
		return opdate;
	}

	public void setOpdate(String opdate) {
		this.opdate = opdate;
	}
	
}
