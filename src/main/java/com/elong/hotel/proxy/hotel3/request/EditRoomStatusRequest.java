package com.elong.hotel.proxy.hotel3.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.elong.hotel.hotelconfirm.confirmorder.bo.EBRefuseBo;
import com.elong.hotel.hotelconfirm.confirmorder.context.ServerActionContext;
import com.elong.hotel.proxy.hotel3.enums.CloseRoomTypeEnum;
import com.elong.hotel.proxy.hotel3.enums.InventoryTypeEnum;
import com.elong.hotel.proxy.javaorder.getorder.Order;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by peng.wang on 2017/7/17.
 */
public class EditRoomStatusRequest {

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

    //此字段用来做日志标识
    private Long orderId;

    public EditRoomStatusRequest() {}

    public EditRoomStatusRequest(CloseRoomRequest closeRoomRequest, Order order) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.closeRoomType= CloseRoomTypeEnum.Mis.getType();
        this.ignoreInventorySummary=false;
        List<Integer> inventoryType=new ArrayList<>();
        inventoryType.add(InventoryTypeEnum.OverSale.getType());
        inventoryType.add(InventoryTypeEnum.Add.getType());
        inventoryType.add(InventoryTypeEnum.Contract.getType());
        inventoryType.add(InventoryTypeEnum.Buyout.getType());
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
        this.orderId=order.getOrderId();

    }

    public EditRoomStatusRequest(ServerActionContext serverActionContext,Order order,List<String> roomTypes) {
        EBRefuseBo bo = serverActionContext.getEbRefuseBo();
//        this.roomTypeList = bo.getRoomTypeList();
        this.roomTypeList=roomTypes;
        if(bo.getFullType() == 1) {
            this.arriveDate = bo.getFullSingleDate();
            this.leaveDate = bo.getFullSingleDate();
        }else if(bo.getFullType() == 2) {
            this.arriveDate = bo.getCheckInDate();
            this.leaveDate = bo.getCheckOutDate();
        }else if(bo.getFullType() == 4) {
//            List<String> roomTypeIds=new ArrayList<>();
//            roomTypeIds.add(order.getRoomTypeId());
            this.arriveDate = bo.getCheckInDate();
            this.leaveDate = bo.getCheckOutDate();
        }
        this.operationType=1;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.overTime=sdf.format(new Date())+" 23:59:59";
        this.closeRoomType = CloseRoomTypeEnum.Ebooking.getType();
        this.ignoreInventorySummary=false;
        List<Integer> inventoryType=new ArrayList<>();
        inventoryType.add(InventoryTypeEnum.OverSale.getType());
        inventoryType.add(InventoryTypeEnum.Add.getType());
        inventoryType.add(InventoryTypeEnum.Contract.getType());
        this.inventoryType=inventoryType;
        this.priceFrom=0;
        this.operateTime=new Date();
        this.operateIP=serverActionContext.getOperatorInfo().getOperatorIP();
        this.operator=serverActionContext.getOperatorInfo().getOperatorName();
        this.operateComments=bo.getNotes();
        this.hotelID = order.getHotelId();
        this.orderId = order.getOrderId();

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

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
