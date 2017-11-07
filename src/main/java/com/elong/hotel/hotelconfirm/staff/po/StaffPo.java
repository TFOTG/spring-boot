package com.elong.hotel.hotelconfirm.staff.po;

import java.util.Date;

/**
 * Created by peng.wang on 17/6/6.
 */
public class StaffPo {

    private int id;

    private String staffName;

    private String leaderName;

    private Integer department;

    private Integer isEnable;

    private Integer isOnline;

    private Date lastGetTime;

    private Date lastLogInTime;

    private Date lastLogOutTime;

    private String operator;

    private String operaterIp;

    private Date operaterTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getLastGetTime() {
        return lastGetTime;
    }

    public void setLastGetTime(Date lastGetTime) {
        this.lastGetTime = lastGetTime;
    }

    public Date getLastLogInTime() {
        return lastLogInTime;
    }

    public void setLastLogInTime(Date lastLogInTime) {
        this.lastLogInTime = lastLogInTime;
    }

    public Date getLastLogOutTime() {
        return lastLogOutTime;
    }

    public void setLastLogOutTime(Date lastLogOutTime) {
        this.lastLogOutTime = lastLogOutTime;
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
