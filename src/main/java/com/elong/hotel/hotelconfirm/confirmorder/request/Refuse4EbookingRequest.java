package com.elong.hotel.hotelconfirm.confirmorder.request;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.confirmorder.bo.ConfirmOrderBo;
import com.elong.hotel.hotelconfirm.confirmorder.enums.ConfirmType;

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

    /// <summary>
    /// 设置据单状态
    /// </summary>
    public String confirmStatus;

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
    public Date fullSingleDate;

    /// <summary>
    /// 入住日期
    /// </summary>
    public Date checkInDate;

    /// <summary>
    /// 离店日期
    /// </summary>
    public Date checkOutDate;

    /// <summary>
    /// 酒店Id
    /// </summary>
    public String hotelId;

    private ConfirmType confirmType;

    private ConfirmOrderBo confirmOrderBo;

    private String orderStatus;

    private OperatorInfoBo operatorInfo;

    public ConfirmOrderBo getConfirmOrderBo() {
        return confirmOrderBo;
    }

    public ConfirmType getConfirmType() {
        return confirmType;
    }

    public void setConfirmType(ConfirmType confirmType) {
        this.confirmType = confirmType;
    }

    public void setConfirmOrderBo(ConfirmOrderBo confirmOrderBo) {
        this.confirmOrderBo = confirmOrderBo;
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

    public String getConfirmStatus() {
        return confirmStatus;
    }

    public void setConfirmStatus(String confirmStatus) {
        this.confirmStatus = confirmStatus;
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

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }
}
