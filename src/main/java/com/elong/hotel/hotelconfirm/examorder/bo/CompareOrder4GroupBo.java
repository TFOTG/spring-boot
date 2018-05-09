package com.elong.hotel.hotelconfirm.examorder.bo;

import com.elong.hotel.hotelconfirm.groupfilter.bo.CompareEntityAnnotations;
import com.elong.hotel.hotelconfirm.groupfilter.bo.CompareEntityBase;

/**
 * 分组计算比较实体
 */
public class CompareOrder4GroupBo extends CompareEntityBase {

    @CompareEntityAnnotations(name = "hotelStar")
    private Integer hotelStar;

    @CompareEntityAnnotations(name = "memberLevel")
    private String memberLevel;

    @CompareEntityAnnotations(name = "proxyId")
    private String proxyId;

    @CompareEntityAnnotations(name = "isConfirmed")
    private Integer isConfirmed;

    @CompareEntityAnnotations(name = "isOutTime")
    private Integer isOutTime;

    @CompareEntityAnnotations(name = "orderType")
    private Integer orderType;

    @CompareEntityAnnotations(name = "isSupposed")
    private Integer isSupposed;

    @CompareEntityAnnotations(name = "orderMoney",compareType= CompareEntityAnnotations.CompareTypeEnum.BETWEEN)
    private double orderMoney;

    @CompareEntityAnnotations(name = "roomNight",compareType= CompareEntityAnnotations.CompareTypeEnum.BETWEEN)
    private Integer roomNight;

    @CompareEntityAnnotations(name = "rejectTime",compareType= CompareEntityAnnotations.CompareTypeEnum.BETWEEN)
    private Integer rejectTime;

    @CompareEntityAnnotations(name = "priority")
    private Integer priority;

    @CompareEntityAnnotations(name = "orderStatus")
    private String orderStatus;

    @CompareEntityAnnotations(name = "supplierId")
    private String supplierId;

    @CompareEntityAnnotations(name = "cityId")
    private String cityId;

    @CompareEntityAnnotations(name = "isNew")
    private Integer isNew;

    public Integer getIsNew() {
        return isNew;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    public Integer getHotelStar() {
        return hotelStar;
    }

    public void setHotelStar(Integer hotelStar) {
        this.hotelStar = hotelStar;
    }

    public String getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(String memberLevel) {
        this.memberLevel = memberLevel;
    }

    public String getProxyId() {
        return proxyId;
    }

    public void setProxyId(String proxyId) {
        this.proxyId = proxyId;
    }

    public Integer getIsConfirmed() {
        return isConfirmed;
    }

    public void setIsConfirmed(Integer isConfirmed) {
        this.isConfirmed = isConfirmed;
    }

    public Integer getIsOutTime() {
        return isOutTime;
    }

    public void setIsOutTime(Integer isOutTime) {
        this.isOutTime = isOutTime;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getIsSupposed() {
        return isSupposed;
    }

    public void setIsSupposed(Integer isSupposed) {
        this.isSupposed = isSupposed;
    }

    public double getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(double orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Integer getRoomNight() {
        return roomNight;
    }

    public void setRoomNight(Integer roomNight) {
        this.roomNight = roomNight;
    }

    public Integer getRejectTime() {
        return rejectTime;
    }

    public void setRejectTime(Integer rejectTime) {
        this.rejectTime = rejectTime;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
}
