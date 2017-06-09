package com.elong.hotel.hotelconfirm.group.bo;

import java.util.Date;

/**
 * Created by user on 17/6/8.
 */
public class GroupStaffBo {

    private Integer id;

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOperatertime() {
        return operatertime;
    }

    public void setOperatertime(Date operatertime) {
        this.operatertime = operatertime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }
    public String getOperaterip() {
        return operaterip;
    }

    public void setOperaterip(String operaterip) {
        this.operaterip = operaterip;
    }
    private Integer groupid;
    private String staffname;
    private String operator;
    private String operaterip;
    private Date operatertime;

}
