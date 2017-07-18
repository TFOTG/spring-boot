package com.elong.hotel.proxy.hotel3.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.elong.hotel.proxy.javaorder.getorder.Order;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by peng.wang on 2017/7/17.
 */
public class CloseFirstProductRequest {

    @JsonProperty(value = "ArriveDate")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date arriveDate;

    @JsonProperty(value = "LeaveDate")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date leaveDate;

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
    private List<Integer> ratePlanIds;

    @JsonProperty(value = "RoomTypeIds")
    private List<String> roomTypeIds;

    @JsonProperty(value = "Weeks")
    private int[] weeks;


    public CloseFirstProductRequest() {

    }

    public CloseFirstProductRequest(CloseRoomRequest closeRoomRequest,Order order) {
        this.opType=2;
        int[] weeks={0,1,2,3,4,5,6};
        this.weeks=weeks;
        this.arriveDate=closeRoomRequest.getArriveDate();
        this.leaveDate=closeRoomRequest.getLeaveDate();
        this.operateIP=closeRoomRequest.getOperatorInfo().getOperatorIP();
        this.operator=closeRoomRequest.getOperatorInfo().getOperatorName();
        this.notes="已审库订单："+closeRoomRequest.getOrderId();
        this.hotelID=order.getHotelId();
        List<Integer> ratePlanIds=new ArrayList<>();
        ratePlanIds.add(Integer.valueOf(order.getRatePlanId()));
        List<String> roomTypeIds=new ArrayList<>();
        roomTypeIds.add(order.getRoomTypeId());
        this.ratePlanIds=ratePlanIds;
        this.roomTypeIds=roomTypeIds;

    }


    public Date getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(Date arriveDate) {
        this.arriveDate = arriveDate;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
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

    public List<Integer> getRatePlanIds() {
        return ratePlanIds;
    }

    public void setRatePlanIds(List<Integer> ratePlanIds) {
        this.ratePlanIds = ratePlanIds;
    }

    public List<String> getRoomTypeIds() {
        return roomTypeIds;
    }

    public void setRoomTypeIds(List<String> roomTypeIds) {
        this.roomTypeIds = roomTypeIds;
    }

    public int[] getWeeks() {
        return weeks;
    }

    public void setWeeks(int[] weeks) {
        this.weeks = weeks;
    }
}
