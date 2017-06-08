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

    private String chargeName;

    private String orderType;

    private String orderStatus;

    private String hotelId;

    private Date timeEarly;

    private int urgeConfirm;

    private int ebRefuse;

    private String orderByField;

    private String orderBy;

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

    public String getChargeName() {
        return chargeName;
    }

    public void setChargeName(String chargeName) {
        this.chargeName = chargeName;
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

    public Date getTimeEarly() {
        return timeEarly;
    }

    public void setTimeEarly(Date timeEarly) {
        this.timeEarly = timeEarly;
    }

    public int getUrgeConfirm() {
        return urgeConfirm;
    }

    public void setUrgeConfirm(int urgeConfirm) {
        this.urgeConfirm = urgeConfirm;
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

    public int getEbRefuse() {
        return ebRefuse;
    }

    public void setEbRefuse(int ebRefuse) {
        this.ebRefuse = ebRefuse;
    }

    public String getOrderByField() {
        return orderByField;
    }

    public void setOrderByField(String orderByField) {
        this.orderByField = orderByField;
    }


}
