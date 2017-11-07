package com.elong.hotel.hotelconfirm.confirmorder.request;

import java.util.Date;
import java.util.List;

/**
 * Created by peng.wang on 17/6/6.
 */
public class EbookingRefuseRequest {

    String oldReserStatus;

    String confirmStatus;

    String notes;

    /**
     * 满房类型
     * 某天        Someday = 1,
     * 所预定的    AllBooking = 2,
     * 所有房型    AllRoom = 4,
     */
    Integer fullType;

    List<String> roomTypeList;

    Date fullSingleDate;

    Date checkInDate;

    Date checkOutDate;

    String hotelId;

    String operator;

    String operateIP;

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

    public String getConfirmStatus() {
        return confirmStatus;
    }

    public void setConfirmStatus(String confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    public Date getFullSingleDate() {
        return fullSingleDate;
    }

    public void setFullSingleDate(Date fullSingleDate) {
        this.fullSingleDate = fullSingleDate;
    }

    public Integer getFullType() {
        return fullType;
    }

    public void setFullType(Integer fullType) {
        this.fullType = fullType;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getOldReserStatus() {
        return oldReserStatus;
    }

    public void setOldReserStatus(String oldReserStatus) {
        this.oldReserStatus = oldReserStatus;
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

    public List<String> getRoomTypeList() {
        return roomTypeList;
    }

    public void setRoomTypeList(List<String> roomTypeList) {
        this.roomTypeList = roomTypeList;
    }
}