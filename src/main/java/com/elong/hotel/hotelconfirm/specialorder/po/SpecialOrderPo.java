package com.elong.hotel.hotelconfirm.specialorder.po;

import java.lang.reflect.Field;
import java.util.Date;

/**
 * Created by peng.wang on 2018/7/30.
 */
public class SpecialOrderPo {

    private long id;
    private Integer reserNo;
    private String reserStatus;
    private Long cardNo;
    private String contactMobile;
    private String hotelId;
    private String hotelName;
    private Date arriveDate;
    private Date leaveDate;
    private String interceptReason;
    private Integer orderType;
    private Integer arriveType;
    private String proxyId;
    private Date enterTime;


    public static void main(String[] args) {
        Field[] fields = SpecialOrderPo.class.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("<columnOverride column=\""+field.getName().toLowerCase()+"\" property=\""+field.getName()+"\" javaType=\""+field.getType().getName()+"\"/> ");
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getReserNo() {
        return reserNo;
    }

    public void setReserNo(Integer reserNo) {
        this.reserNo = reserNo;
    }

    public String getReserStatus() {
        return reserStatus;
    }

    public void setReserStatus(String reserStatus) {
        this.reserStatus = reserStatus;
    }

    public Long getCardNo() {
        return cardNo;
    }

    public void setCardNo(Long cardNo) {
        this.cardNo = cardNo;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
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

    public String getInterceptReason() {
        return interceptReason;
    }

    public void setInterceptReason(String interceptReason) {
        this.interceptReason = interceptReason;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getArriveType() {
        return arriveType;
    }

    public void setArriveType(Integer arriveType) {
        this.arriveType = arriveType;
    }

    public String getProxyId() {
        return proxyId;
    }

    public void setProxyId(String proxyId) {
        this.proxyId = proxyId;
    }

    public Date getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(Date enterTime) {
        this.enterTime = enterTime;
    }
}
