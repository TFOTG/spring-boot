package com.elong.hotel.hotelconfirm.confirmorder.bo;

/**
 * Created by peng.wang on 17/6/8.
 */
public class ChargeConfirmOrderBo {


    private String orderId;

    private String hotelName;

    private String arriveDate;

    private String fax;

    private String groupName;

    private String staffName;

    private String chargeName;

    //在屏时长，当前时间减去员工获取时间
    private String getTime;

    //剩余，当前时间减去承诺时间
    private String promiseLeftTime;

    //已审时长，当前时间减去最后一次已审时间
    private String verifyTime;

    //初拒时长，当前时间减去初拒时间
    private String firstRefuseTime;

    //预约时间
    private String respiteTime;

    //获取时间
    private String sortTime;

    private String operator;

    private String operateTime;


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

    public String getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(String arriveDate) {
        this.arriveDate = arriveDate;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
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

    public String getChargeName() {
        return chargeName;
    }

    public void setChargeName(String chargeName) {
        this.chargeName = chargeName;
    }

    public String getGetTime() {
        return getTime;
    }

    public void setGetTime(String getTime) {
        this.getTime = getTime;
    }

    public String getPromiseLeftTime() {
        return promiseLeftTime;
    }

    public void setPromiseLeftTime(String promiseLeftTime) {
        this.promiseLeftTime = promiseLeftTime;
    }

    public String getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(String verifyTime) {
        this.verifyTime = verifyTime;
    }

    public String getFirstRefuseTime() {
        return firstRefuseTime;
    }

    public void setFirstRefuseTime(String firstRefuseTime) {
        this.firstRefuseTime = firstRefuseTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getRespiteTime() {
        return respiteTime;
    }

    public void setRespiteTime(String respiteTime) {
        this.respiteTime = respiteTime;
    }

    public String getSortTime() {
        return sortTime;
    }

    public void setSortTime(String sortTime) {
        this.sortTime = sortTime;
    }

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }
}
