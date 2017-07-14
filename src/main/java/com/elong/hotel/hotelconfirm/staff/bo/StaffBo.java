package com.elong.hotel.hotelconfirm.staff.bo;

import com.alibaba.fastjson.annotation.JSONField;
import com.elong.hotel.hotelconfirm.staff.po.StaffPo;

import java.util.Date;
import java.util.List;

/**
 * Created by peng.wang on 17/6/27.
 */
public class StaffBo {

    private Integer staffId;

    private List<Integer> staffIds;

    private String staffName;

    private String leaderName;

    private Integer groupId;

    private List<Integer> groupIds;

    private String groupNames;

    private Integer department;

    private Integer enable;

    private String operator;

    private String operaterIp;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date operaterTime;

    private Integer pageIndex;

    private Integer pageSize;

    private Integer startItem;


    public StaffBo() {}

    public StaffBo(StaffPo po) {

        this.staffId=po.getId();
        this.staffName=po.getStaffName();
        this.leaderName=po.getLeaderName();
        this.operator=po.getOperator();
        this.operaterTime=po.getOperaterTime();
        this.enable=po.getIsEnable();
    }




    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }


    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
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

    public List<Integer> getStaffIds() {
        return staffIds;
    }

    public void setStaffIds(List<Integer> staffIds) {
        this.staffIds = staffIds;
    }


    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public List<Integer> getGroupIds() {
        return groupIds;
    }

    public void setGroupIds(List<Integer> groupIds) {
        this.groupIds = groupIds;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getStartItem() {
        return startItem;
    }

    public void setStartItem(Integer startItem) {
        this.startItem = startItem;
    }

    public String getGroupNames() {
        return groupNames;
    }

    public void setGroupNames(String groupNames) {
        this.groupNames = groupNames;
    }
}
