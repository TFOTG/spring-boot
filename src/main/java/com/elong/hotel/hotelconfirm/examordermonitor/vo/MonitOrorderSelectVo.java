package com.elong.hotel.hotelconfirm.examordermonitor.vo;

/**
 * Created by liujunjie on 2018/6/7.
 */
public class MonitOrorderSelectVo {

    private int pageIndex;

    private int pageSize;

    private int orderId;

    private int staffId;

    private String leaderName;

    private int refuseHours;

    private int gotMins;

    private String hotelName;

    private String checkInDate;

    private int groupId;

    private int operatorName;

    private String orderStatus;

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

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

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public int getRefuseHours() {
        return refuseHours;
    }

    public void setRefuseHours(int refuseHours) {
        this.refuseHours = refuseHours;
    }

    public int getGotMins() {
        return gotMins;
    }

    public void setGotMins(int gotMins) {
        this.gotMins = gotMins;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(int operatorName) {
        this.operatorName = operatorName;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
