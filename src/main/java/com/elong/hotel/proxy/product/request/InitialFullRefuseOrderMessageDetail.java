package com.elong.hotel.proxy.product.request;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;
import java.util.List;

/**
 * Created by yangboyu on 17/6/28.
 */
public class InitialFullRefuseOrderMessageDetail {
    int reserNo;

    String mhotelId;

    String mhotelName;

    String shotelId;

    String shotelName;

    String sroomTypeId;

    String sratePlanId;

    int supplierId;

    String supplierName;

    int supplierType;

    String mroomTypeId;

    int numRoom;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    Date ArriveDate;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    Date leaveDate;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    Date bookTime;

    int isInstantConfirm;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    Date operateTime;

    String operator;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    Date refusedOrderTime;

    String refusedOrderReason;

    String provinceId;

    String provinceName;

    String cityId;

    String cityName;

    String areaId;

    String areaName;

    int cooperationType;

    List<RoomNightInfo> roomNightInvInfoList;

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Date getArriveDate() {
        return ArriveDate;
    }

    public void setArriveDate(Date arriveDate) {
        ArriveDate = arriveDate;
    }

    public Date getBookTime() {
        return bookTime;
    }

    public void setBookTime(Date bookTime) {
        this.bookTime = bookTime;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCooperationType() {
        return cooperationType;
    }

    public void setCooperationType(int cooperationType) {
        this.cooperationType = cooperationType;
    }

    public int getIsInstantConfirm() {
        return isInstantConfirm;
    }

    public void setIsInstantConfirm(int isInstantConfirm) {
        this.isInstantConfirm = isInstantConfirm;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public String getMhotelId() {
        return mhotelId;
    }

    public void setMhotelId(String mhotelId) {
        this.mhotelId = mhotelId;
    }

    public String getMhotelName() {
        return mhotelName;
    }

    public void setMhotelName(String mhotelName) {
        this.mhotelName = mhotelName;
    }

    public String getMroomTypeId() {
        return mroomTypeId;
    }

    public void setMroomTypeId(String mroomTypeId) {
        this.mroomTypeId = mroomTypeId;
    }

    public int getNumRoom() {
        return numRoom;
    }

    public void setNumRoom(int numRoom) {
        this.numRoom = numRoom;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getRefusedOrderReason() {
        return refusedOrderReason;
    }

    public void setRefusedOrderReason(String refusedOrderReason) {
        this.refusedOrderReason = refusedOrderReason;
    }

    public Date getRefusedOrderTime() {
        return refusedOrderTime;
    }

    public void setRefusedOrderTime(Date refusedOrderTime) {
        this.refusedOrderTime = refusedOrderTime;
    }

    public int getReserNo() {
        return reserNo;
    }

    public void setReserNo(int reserNo) {
        this.reserNo = reserNo;
    }

    public List<RoomNightInfo> getRoomNightInvInfoList() {
        return roomNightInvInfoList;
    }

    public void setRoomNightInvInfoList(List<RoomNightInfo> roomNightInvInfoList) {
        this.roomNightInvInfoList = roomNightInvInfoList;
    }

    public String getShotelId() {
        return shotelId;
    }

    public void setShotelId(String shotelId) {
        this.shotelId = shotelId;
    }

    public String getShotelName() {
        return shotelName;
    }

    public void setShotelName(String shotelName) {
        this.shotelName = shotelName;
    }

    public String getSratePlanId() {
        return sratePlanId;
    }

    public void setSratePlanId(String sratePlanId) {
        this.sratePlanId = sratePlanId;
    }

    public String getSroomTypeId() {
        return sroomTypeId;
    }

    public void setSroomTypeId(String sroomTypeId) {
        this.sroomTypeId = sroomTypeId;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public int getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(int supplierType) {
        this.supplierType = supplierType;
    }
}
