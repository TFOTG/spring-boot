/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.staff.vo.StaffLogVO.java]
 * Createion [2017年7月18日]
 */
package com.elong.hotel.hotelconfirm.staff.vo;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

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
	@NotNull(message="logflag不能为空")
	@Range(min=0,max=1,message="参数不合法")
	private Integer logflag;
	
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

	public Integer getLogflag() {
		return logflag;
	}

	public void setLogflag(Integer logflag) {
		this.logflag = logflag;
	}

	public String getOpdate() {
		return opdate;
	}

	public void setOpdate(String opdate) {
		this.opdate = opdate;
	}
	
}
