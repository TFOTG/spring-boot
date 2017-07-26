package com.elong.hotel.proxy.hotel3.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.elong.hotel.proxy.javaorder.getorder.Order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by peng.wang on 2017/7/17.
 */
public class BatchSetPriceStatusRequest {

    @JSONField(format = "yyyy-MM-dd HH:mm:ss",name = "BeginDate")
    private Date arriveDate;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss" ,name = "EndDate")
    private Date leaveDate;

    @JSONField(name = "HotelID")
    private String hotelID;

    @JSONField(name = "Notes")
    private String notes;

    @JSONField(name = "OpType")
    private int opType;

    @JSONField(name = "OperateIP")
    private String operateIP;

    @JSONField(name = "Operator")
    private String operator;

    @JSONField(name = "RatePlanIds")
    private List<Integer> ratePlanIds;

    @JSONField(name = "RoomTypeIds")
    private List<String> roomTypeIds;

    @JSONField(name = "Weeks")
    private int[] weeks;

    //此字段用来做日志标识
    private Long orderId;

    public BatchSetPriceStatusRequest() {

    }

    public BatchSetPriceStatusRequest(CloseRoomRequest closeRoomRequest, Order order) {
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
        this.orderId=order.getOrderId();
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

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
