package com.elong.hotel.proxy.hotel3.request;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by peng.wang on 2017/7/17.
 */
public class CloseFirstProductRequest {

    @JsonProperty(value = "BeginDate")
    private String beginDate;

    @JsonProperty(value = "EndDate")
    private String endDate;

    @JsonProperty(value = "HotelID")
    private String hotelID;

    @JsonProperty(value = "Notes")
    private String notes;

    @JsonProperty(value = "OpType")
    private int opType;

    @JsonProperty(value = "OperateIP")
    private String operateIP;

    @JsonProperty(value = "Operator")
    private String operator;

    @JsonProperty(value = "RatePlanIds")
    private int[] ratePlanIds;

    @JsonProperty(value = "RoomTypeIds")
    private String[] roomTypeIds;

    @JsonProperty(value = "Weeks")
    private int[] weeks;

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getHotelID() {
        return hotelID;
    }

    public void setHotelID(String hotelID) {
        this.hotelID = hotelID;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getOpType() {
        return opType;
    }

    public void setOpType(int opType) {
        this.opType = opType;
    }

    public String getOperateIP() {
        return operateIP;
    }

    public void setOperateIP(String operateIP) {
        this.operateIP = operateIP;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int[] getRatePlanIds() {
        return ratePlanIds;
    }

    public void setRatePlanIds(int[] ratePlanIds) {
        this.ratePlanIds = ratePlanIds;
    }

    public String[] getRoomTypeIds() {
        return roomTypeIds;
    }

    public void setRoomTypeIds(String[] roomTypeIds) {
        this.roomTypeIds = roomTypeIds;
    }

    public int[] getWeeks() {
        return weeks;
    }

    public void setWeeks(int[] weeks) {
        this.weeks = weeks;
    }
}
