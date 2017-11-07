package com.elong.hotel.hotelconfirm.confirmorder.request;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.confirmorder.enums.ConfirmType;
import com.elong.hotel.hotelconfirm.confirmorderactionlog.enums.ActionOpFromEnum;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * Created by peng.wang on 17/6/6.
 */
public class Refuse4EbookingRequest {

    /// <summary>
    /// 订单编号
    /// </summary>
    public int reserNo;

    /// 设置据单状态
    private String orderStatus;

    /// <summary>
    /// 备注
    /// </summary>
    public String notes;

    /// <summary>
    /// 满房类型
    /// 某天        Someday = 1,
    /// 所预定的    AllBooking = 2,
    /// 所有房型    AllRoom = 4,
    /// </summary>
    public Integer fullType;

    /// <summary>
    /// 房型列表
    /// </summary>
    public List<String> roomTypeList;

    /// <summary>
    /// 满房日期
    /// </summary>
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public Date fullSingleDate;

    /// <summary>
    /// 入住日期
    /// </summary>
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public Date checkInDate;

    /// <summary>
    /// 离店日期
    /// </summary>
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public Date checkOutDate;

    /// <summary>
    /// 酒店Id
    /// </summary>
    private String opName;

    private ActionOpFromEnum actionOpFromEnum;

    private ConfirmType confirmType;

    private OperatorInfoBo operatorInfo;

    public ConfirmType getConfirmType() {
        return confirmType;
    }

    public void setConfirmType(ConfirmType confirmType) {
        this.confirmType = confirmType;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public OperatorInfoBo getOperatorInfo() {
        return operatorInfo;
    }

    public void setOperatorInfo(OperatorInfoBo operatorInfo) {
        this.operatorInfo = operatorInfo;
    }

    public int getReserNo() {
        return reserNo;
    }

    public void setReserNo(int reserNo) {
        this.reserNo = reserNo;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getFullType() {
        return fullType;
    }

    public void setFullType(Integer fullType) {
        this.fullType = fullType;
    }

    public List<String> getRoomTypeList() {
        return roomTypeList;
    }

    public void setRoomTypeList(List<String> roomTypeList) {
        this.roomTypeList = roomTypeList;
    }

    public Date getFullSingleDate() {
        return fullSingleDate;
    }

    public void setFullSingleDate(Date fullSingleDate) {
        this.fullSingleDate = fullSingleDate;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }


    public ActionOpFromEnum getActionOpFromEnum() {
        return actionOpFromEnum;
    }

    public void setActionOpFromEnum(ActionOpFromEnum actionOpFromEnum) {
        this.actionOpFromEnum = actionOpFromEnum;
    }

    public String getOpName() {
        return opName;
    }

    public void setOpName(String opName) {
        this.opName = opName;
    }
}
