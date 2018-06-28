package com.elong.hotel.hotelconfirm.examordermonitor.bo;

import sun.util.calendar.BaseCalendar;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liujunjie on 2018/6/8.
 */
public class MonitOrorderBo implements Serializable {

    private int orderId;

    private int staffId;

    private String staffName;

    private int groupId;

    private String groupName;

    private String hotelName;

    private String hotelId;

    private String checkInDate;

    private String orderStatus;

    private String leaderName;

    //在屏时长 分钟
    private long getOrderTime;

    //拒单时长 分钟
    private long inExamTime;

    //预约时间
    private String followTime;

    private int operatorId;

    private String operatorName;

    private Date operateTime;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public long getGetOrderTime() {
        return getOrderTime;
    }

    public void setGetOrderTime(long getOrderTime) {
        this.getOrderTime = getOrderTime;
    }

    public long getInExamTime() {
        return inExamTime;
    }

    public void setInExamTime(long inExamTime) {
        this.inExamTime = inExamTime;
    }

    public String getFollowTime() {
        return followTime;
    }

    public void setFollowTime(String followTime) {
        this.followTime = followTime;
    }

    public int getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }
}
