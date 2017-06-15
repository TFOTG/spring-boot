package com.elong.hotel.hotelconfirm.confirmorder.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Date;

/**
 * Created by peng.wang on 17/6/6.
 */
public class GetChargeOrdersRequest {

    private String orderId;

    private String groupId;

    private String staffName;

    private String leaderName;

    private String orderType;

    private String orderStatus;

    private String hotelId;

    private String timeEarly;

    private Integer urgeConfirm;

    private Integer ebRefuse;

    private String orderByField;

    private String orderBy;

    private Date sortTime;

    @Min(value=1,message="页码从1开始")
    private int pageIndex;

    @Min(value=5,message="每页最少5条数据")
    @Max(value=100,message="每页最多100条数据")
    private int pageSize;

    private int startItem;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
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

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getTimeEarly() {
        return timeEarly;
    }

    public void setTimeEarly(String timeEarly) {
        this.timeEarly = timeEarly;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

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

    public int getStartItem() {
        return startItem;
    }

    public void setStartItem(int startItem) {
        this.startItem = startItem;
    }

    public void setUrgeConfirm(Integer urgeConfirm) {
        this.urgeConfirm = urgeConfirm;
    }

    public Integer getUrgeConfirm() {
        return urgeConfirm;
    }

    public Integer getEbRefuse() {
        return ebRefuse;
    }

    public void setEbRefuse(Integer ebRefuse) {
        this.ebRefuse = ebRefuse;
    }

    public String getOrderByField() {
        return orderByField;
    }

    public void setOrderByField(String orderByField) {
        this.orderByField = orderByField;
    }

    public Date getSortTime() {
        return sortTime;
    }

    public void setSortTime(Date sortTime) {
        this.sortTime = sortTime;
    }
}
