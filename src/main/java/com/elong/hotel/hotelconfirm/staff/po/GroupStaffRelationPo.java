package com.elong.hotel.hotelconfirm.staff.po;

import java.util.Date;

public class GroupStaffRelationPo {

	private Integer id;
	private int groupId;
	private String staffName;
	private Integer department;
	private String operator;
	private String operaterIp;
	private Date operaterTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
    
    public Integer getDepartment() {
		return department;
	}

	public void setDepartment(Integer department) {
		this.department = department;
	}

	public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperaterIp() {
        return operaterIp;
    }

    public void setOperaterIp(String operaterIp) {
        this.operaterIp = operaterIp;
    }

    public Date getOperaterTime() {
        return operaterTime;
    }

    public void setOperaterTime(Date operaterTime) {
        this.operaterTime = operaterTime;
    }
}