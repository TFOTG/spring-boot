/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.group.GroupVO.java]
 * Createion [2017年6月9日]
 */
package com.elong.hotel.hotelconfirm.group.vo;


/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class GroupVO {

	/**
	 * 部门
	 */
	private Integer deptment;
	
	/**
	 * 启用状态
	 */
	private Integer enable;
	
	/**
	 * 是否启用eh缓存
	 */
	private int ehcacheEnbale;

	/**
	 * 员工姓名
	 */
	private String staffName;
	
	/**
	 * 分组类型
	 */
	private Integer gettingType;
	
	public Integer getDeptment() {
		return deptment;
	}

	public void setDeptment(Integer deptment) {
		this.deptment = deptment;
	}

	public Integer getEnable() {
		return enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	public int getEhcacheEnbale() {
		return ehcacheEnbale;
	}

	public void setEhcacheEnbale(int ehcacheEnbale) {
		this.ehcacheEnbale = ehcacheEnbale;
	}

	public GroupVO(Integer deptment, Integer enable, int ehcacheEnbale) {
		this.deptment = deptment;
		this.enable = enable;
		this.ehcacheEnbale = ehcacheEnbale;
	}
	
	public GroupVO(Integer deptment, Integer enable, int ehcacheEnbale, Integer gettingType) {
		this.deptment = deptment;
		this.enable = enable;
		this.ehcacheEnbale = ehcacheEnbale;
		this.gettingType = gettingType;
	}
	
	public GroupVO(String staffName, Integer department, Integer enable){
		this.staffName = staffName;
		this.deptment = department;
		this.enable = enable;
	}

	public GroupVO() {
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public Integer getGettingType() {
		return gettingType;
	}

	public void setGettingType(Integer gettingType) {
		this.gettingType = gettingType;
	}
	
}
