package com.elong.hotel.proxy.hotel3.request;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by peng.wang on 2017/7/17.
 */
public class CloseRoomTypeRequest {

    @JsonProperty(value = "ArriveDate")
    private String arriveDate;

    @JsonProperty(value = "LeaveDate")
    private String leaveDate;

    @JsonProperty(value = "CloseRoomType")
    private int closeRoomType;

    @JsonProperty(value = "HotelID")
    private String hotelID;

    @JsonProperty(value = "IgnoreInventorySummary")
    private boolean ignoreInventorySummary;

    @JsonProperty(value = "InventoryType")
    private List<Integer> inventoryType ;

    @JsonProperty(value = "OperateComments")
    private String operateComments;

    @JsonProperty(value = "OperateIP")
    private String operateIP;

    @JsonProperty(value = "OperateTime")
    private String operateTime;

    @JsonProperty(value = "OperationType")
    private int operationType;

    @JsonProperty(value = "Operator")
    private String operator;

    @JsonProperty(value = "OverTime")
    private String overTime;

    @JsonProperty(value = "PriceFrom")
    private int priceFrom;

    private List<String> roomTypeList ;

    public String getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(String arriveDate) {
        this.arriveDate = arriveDate;
    }

    public String getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate;
    }

    public int getCloseRoomType() {
        return closeRoomType;
    }

    public void setCloseRoomType(int closeRoomType) {
        this.closeRoomType = closeRoomType;
    }

    public String getHotelID() {
        return hotelID;
    }

    public void setHotelID(String hotelID) {
        this.hotelID = hotelID;
    }

    public boolean isIgnoreInventorySummary() {
        return ignoreInventorySummary;
    }

    public void setIgnoreInventorySummary(boolean ignoreInventorySummary) {
        this.ignoreInventorySummary = ignoreInventorySummary;
    }

    public List<Integer> getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(List<Integer> inventoryType) {
        this.inventoryType = inventoryType;
    }

    public String getOperateComments() {
        return operateComments;
    }

    public void setOperateComments(String operateComments) {
        this.operateComments = operateComments;
    }

    public String getOperateIP() {
        return operateIP;
    }

    public void setOperateIP(String operateIP) {
        this.operateIP = operateIP;
    }

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public int getOperationType() {
        return operationType;
    }

    public void setOperationType(int operationType) {
        this.operationType = operationType;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOverTime() {
        return overTime;
    }

    public void setOverTime(String overTime) {
        this.overTime = overTime;
    }

    public int getPriceFrom() {
        return priceFrom;
    }

    public void setPriceFrom(int priceFrom) {
        this.priceFrom = priceFrom;
    }

    public List<String> getRoomTypeList() {
        return roomTypeList;
    }

    public void setRoomTypeList(List<String> roomTypeList) {
        this.roomTypeList = roomTypeList;
    }
}
