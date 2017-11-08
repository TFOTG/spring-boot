package com.elong.hotel.hotelconfirm.confirmorder.bo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by peng.wang on 17/6/8.
 */
public class ChargeConfirmOrderBo {


    private String orderId;

    private String hotelName;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date timeEarly;

    private String groupName;

    private String staffName;

    private String leaderName;

    //在屏时长，当前时间减去员工获取时间
    private String getTimeLength;

    private Date distributeTime;

    //剩余，承诺时间减去当前时间
    private String promiseTimeLength;

    private Date promiseTime;

    //已审时长，当前时间减去最后一次已审时间
    private String amendTimeLength;

    private Date amendTime;

    //初拒时长，当前时间减去初拒时间
    private String firstRefuseTimeLength;

    private Date firstRefusedTime;

    //预约时间
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date respiteTime;

    //可获取时间
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date sortTime;

    //订单优先级别
    private int priority;

    //传真是否回传
    private int isFaxReturn;


    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getIsFaxReturn() {
        return isFaxReturn;
    }

    public void setIsFaxReturn(int isFaxReturn) {
        this.isFaxReturn = isFaxReturn;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public String getGetTimeLength() {
        return getTimeLength;
    }

    public void setGetTimeLength(String getTimeLength) {
        this.getTimeLength = getTimeLength;
    }

    public Date getDistributeTime() {
        return distributeTime;
    }

    public void setDistributeTime(Date distributeTime) {
        this.distributeTime = distributeTime;
    }

    public String getPromiseTimeLength() {
        return promiseTimeLength;
    }

    public void setPromiseTimeLength(String promiseTimeLength) {
        this.promiseTimeLength = promiseTimeLength;
    }

    public Date getPromiseTime() {
        return promiseTime;
    }

    public void setPromiseTime(Date promiseTime) {
        this.promiseTime = promiseTime;
    }

    public String getAmendTimeLength() {
        return amendTimeLength;
    }

    public void setAmendTimeLength(String amendTimeLength) {
        this.amendTimeLength = amendTimeLength;
    }

    public Date getAmendTime() {
        return amendTime;
    }

    public void setAmendTime(Date amendTime) {
        this.amendTime = amendTime;
    }

    public String getFirstRefuseTimeLength() {
        return firstRefuseTimeLength;
    }

    public void setFirstRefuseTimeLength(String firstRefuseTimeLength) {
        this.firstRefuseTimeLength = firstRefuseTimeLength;
    }

    public Date getFirstRefusedTime() {
        return firstRefusedTime;
    }

    public void setFirstRefusedTime(Date firstRefusedTime) {
        this.firstRefusedTime = firstRefusedTime;
    }

    public Date getRespiteTime() {
        return respiteTime;
    }

    public void setRespiteTime(Date respiteTime) {
        this.respiteTime = respiteTime;
    }

    public Date getSortTime() {
        return sortTime;
    }

    public void setSortTime(Date sortTime) {
        this.sortTime = sortTime;
    }

    public Date getTimeEarly() {
        return timeEarly;
    }

    public void setTimeEarly(Date timeEarly) {
        this.timeEarly = timeEarly;
    }
}
