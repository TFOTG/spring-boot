/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.staff.vo.PendingStaffVO.java]
 * Createion [2017年7月4日]
 */
package com.elong.hotel.hotelconfirm.staff.vo;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import com.elong.hotel.common.parameter.PaginationParameter;
import com.elong.hotel.hotelconfirm.valid.FirstValid;
import com.elong.hotel.hotelconfirm.valid.SecondValid;
import com.elong.hotel.hotelconfirm.valid.ThirdValid;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class PendingStaffVO extends PaginationParameter{
	
	@NotBlank(message="员工姓名不能为空",groups={FirstValid.class,SecondValid.class,ThirdValid.class})
	private String staffname;
	
	private String lastlogintime;
	
	private String lastlogouttime;
	
	private String lastgettime;
	
	@NotNull(message = "不能为空",groups=SecondValid.class)
	@Range(min=0,max=1,message="参数不正确",groups=SecondValid.class)
	private Integer isonline ;

	@NotNull(message="员工部门不能为空",groups={SecondValid.class,ThirdValid.class})
	private Integer department;
	
	@NotNull(message="订单类型不能为空",groups=FirstValid.class)
	private Integer ordertype;

	/**
	 * 待处理页分页 页码
	 */
	private Integer pendPageNum;

	public String getStaffname() {
		return staffname;
	}

	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}

	public String getLastlogintime() {
		return lastlogintime;
	}

	public void setLastlogintime(String lastlogintime) {
		this.lastlogintime = lastlogintime;
	}

	public String getLastlogouttime() {
		return lastlogouttime;
	}

	public void setLastlogouttime(String lastlogouttime) {
		this.lastlogouttime = lastlogouttime;
	}

	public String getLastgettime() {
		return lastgettime;
	}

	public void setLastgettime(String lastgettime) {
		this.lastgettime = lastgettime;
	}

	public Integer getIsonline() {
		return isonline;
	}

	public void setIsonline(Integer isonline) {
		this.isonline = isonline;
	}

	public Integer getOrdertype() {
		return ordertype;
	}

	public void setOrdertype(Integer ordertype) {
		this.ordertype = ordertype;
	}

	public Integer getDepartment() {
		return department;
	}

	public void setDepartment(Integer department) {
		this.department = department;
	}

	public Integer getPendPageNum() {
		return pendPageNum;
	}

	public void setPendPageNum(Integer pendPageNum) {
		this.pendPageNum = pendPageNum;
	}
}
