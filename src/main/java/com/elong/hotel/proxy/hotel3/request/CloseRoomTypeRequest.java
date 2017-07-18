package com.elong.hotel.proxy.hotel3.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.elong.hotel.proxy.javaorder.getorder.Order;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by peng.wang on 2017/7/17.
 */
public class CloseRoomTypeRequest {

    @JSONField(format = "yyyy-MM-dd HH:mm:ss",name = "ArriveDate")
    private Date arriveDate;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss" ,name = "LeaveDate")
    private Date leaveDate;

    @JSONField(name = "CloseRoomType")
    private int closeRoomType;

    @JSONField(name = "HotelID")
    private String hotelID;

    @JSONField(name = "IgnoreInventorySummary")
    private boolean ignoreInventorySummary;

    @JSONField(name = "InventoryType")
    private List<Integer> inventoryType ;

    @JSONField(name = "OperateComments")
    private String operateComments;

    @JSONField(name = "OperateIP")
    private String operateIP;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss",name = "OperateTime")
    private Date operateTime;

    @JSONField(name = "OperationType")
    private int operationType;

    @JSONField(name = "Operator")
    private String operator;

    @JSONField(name = "OverTime")
    private String overTime;

    @JSONField(name = "PriceFrom")
    private int priceFrom;

    private List<String> roomTypeList ;


    public CloseRoomTypeRequest() {}

    public CloseRoomTypeRequest(CloseRoomRequest closeRoomRequest,Order order) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.closeRoomType=301;
        this.ignoreInventorySummary=false;
        List<Integer> inventoryType=new ArrayList<>();
        inventoryType.add(0);
        inventoryType.add(1);
        inventoryType.add(2);
        inventoryType.add(3);
        this.inventoryType=inventoryType;
        this.operationType=1;
        this.priceFrom=0;
        this.overTime=sdf.format(new Date())+" 23:59:59";
        this.operateTime=new Date();
        this.arriveDate=closeRoomRequest.getArriveDate();
        this.leaveDate=closeRoomRequest.getLeaveDate();
        this.operateIP=closeRoomRequest.getOperatorInfo().getOperatorIP();
        this.operator=closeRoomRequest.getOperatorInfo().getOperatorName();
        this.operateComments=closeRoomRequest.getOrderId().toString();
        this.hotelID=order.getHotelId();
        List<String> roomTypeIds=new ArrayList<>();
        roomTypeIds.add(order.getRoomTypeId());
        this.roomTypeList=roomTypeIds;

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

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

}
