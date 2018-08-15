package com.elong.hotel.hotelconfirm.specialorder.bo;

import com.elong.hotel.hotelconfirm.specialorder.po.SpecialOrderPo;
import com.elong.hotel.proxy.javaorder.consts.OrderFlagConst;
import com.elong.hotel.proxy.javaorder.getorder.Order;

import java.lang.reflect.Field;
import java.util.Date;

/**
 * Created by peng.wang on 2018/8/9.
 */
public class SpecialOrderBo {

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
    private Long orderTimeStampLong;

    //客人app选择马上到点(&OrderFlagConst.IS_ARRIVE_NOW_ORDER=1024)
    private boolean userChoiceUrge4App;
    private Integer distance;

    private Date timeEarly;


    public SpecialOrderBo() {
    }

    public SpecialOrderBo(SpecialOrderPo specialOrderPo) {
        this.reserNo=specialOrderPo.getReserNo();
        this.reserStatus=specialOrderPo.getReserStatus();
        this.cardNo=specialOrderPo.getCardNo();
        this.contactMobile=specialOrderPo.getContactMobile();
        this.hotelId=specialOrderPo.getHotelId();
        this.hotelName=specialOrderPo.getHotelName();
        this.arriveDate=specialOrderPo.getArriveDate();
        this.leaveDate=specialOrderPo.getLeaveDate();
        this.interceptReason=specialOrderPo.getInterceptReason();
        this.orderType=specialOrderPo.getOrderType();
        this.arriveType=specialOrderPo.getArriveType();
        this.proxyId=specialOrderPo.getProxyId();
        this.enterTime=specialOrderPo.getEnterTime();
        this.orderTimeStampLong=specialOrderPo.getOrderTimeStampLong();
    }


    public static void main(String[] args) {
        Field[] fields = SpecialOrderPo.class.getDeclaredFields();
        for (Field field : fields) {
            String methodName = field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1);
            System.out.println("this."+field.getName()+"=specialOrderPo.get"+methodName+"();");
        }
    }


    public SpecialOrderBo(Order order, SpecialOrderPo specialOrderPo) {

        if(order!=null&&specialOrderPo==null){
            this.reserNo=Integer.valueOf(order.getOrderId().toString());
            this.reserStatus=order.getStatus();
            this.cardNo=order.getCardNo();
            this.contactMobile=order.getContact().getMobile();
            this.hotelId=order.getHotelId();
            this.hotelName=order.getHotelName();
            this.arriveDate=order.getCheckInDate();
            this.leaveDate=order.getCheckOutDate();
            this.proxyId=order.getProxy();
            this.enterTime=new Date();
            this.orderTimeStampLong=order.getOrderTimestamp().getTime();
            this.userChoiceUrge4App = (order.getOrderFlag() & OrderFlagConst.IS_ARRIVE_NOW_ORDER) == OrderFlagConst.IS_ARRIVE_NOW_ORDER;
            this.distance = order.getDistanceFromHotelWhenBooking();
            this.timeEarly = order.getEarlyCheckInTime();
        }else if(order!=null&&specialOrderPo!=null){
            this.reserNo=Integer.valueOf(order.getOrderId().toString());
            this.reserStatus=order.getStatus();
            this.cardNo=order.getCardNo();
            this.contactMobile=order.getContact().getMobile();
            this.hotelId=specialOrderPo.getHotelId();
            this.hotelName=specialOrderPo.getHotelName();
            this.arriveDate=order.getCheckInDate();
            this.leaveDate=order.getCheckOutDate();
            this.interceptReason=specialOrderPo.getInterceptReason();
            this.orderType=specialOrderPo.getOrderType();
            this.proxyId=specialOrderPo.getProxyId();
            this.enterTime=new Date();
            this.orderTimeStampLong=order.getOrderTimestamp().getTime();
            this.userChoiceUrge4App = (order.getOrderFlag() & OrderFlagConst.IS_ARRIVE_NOW_ORDER) == OrderFlagConst.IS_ARRIVE_NOW_ORDER;
            this.distance = order.getDistanceFromHotelWhenBooking();
            this.timeEarly = order.getEarlyCheckInTime();
        }
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

    public Long getOrderTimeStampLong() {
        return orderTimeStampLong;
    }

    public void setOrderTimeStampLong(Long orderTimeStampLong) {
        this.orderTimeStampLong = orderTimeStampLong;
    }

    public boolean getUserChoiceUrge4App() {
        return userChoiceUrge4App;
    }

    public void setUserChoiceUrge4App(boolean userChoiceUrge4App) {
        this.userChoiceUrge4App = userChoiceUrge4App;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }


    public Date getTimeEarly() {
        return timeEarly;
    }

    public void setTimeEarly(Date timeEarly) {
        this.timeEarly = timeEarly;
    }
}
