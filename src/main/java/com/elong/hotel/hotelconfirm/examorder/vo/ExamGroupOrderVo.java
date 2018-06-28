package com.elong.hotel.hotelconfirm.examorder.vo;

/**
 * Created by peng.wang on 2018/6/26.
 */
public class ExamGroupOrderVo {

    private int groupId;

    private String groupName;

    private int amountTotal;

    private int urgeTotal;

    private int todayNoUrgeTotal;

    private int otherTotal;

    private int noGetTotal;

    private int noGetUrgeCount;

    private int noGetTodayNoUrgeCount;

    private int noGetOtherCount;

    private int loginStaffCount;

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getAmountTotal() {
        return amountTotal;
    }

    public void setAmountTotal(int amountTotal) {
        this.amountTotal = amountTotal;
    }

    public int getUrgeTotal() {
        return urgeTotal;
    }

    public void setUrgeTotal(int urgeTotal) {
        this.urgeTotal = urgeTotal;
    }

    public int getTodayNoUrgeTotal() {
        return todayNoUrgeTotal;
    }

    public void setTodayNoUrgeTotal(int todayNoUrgeTotal) {
        this.todayNoUrgeTotal = todayNoUrgeTotal;
    }

    public int getOtherTotal() {
        return otherTotal;
    }

    public void setOtherTotal(int otherTotal) {
        this.otherTotal = otherTotal;
    }

    public int getNoGetTotal() {
        return noGetTotal;
    }

    public void setNoGetTotal(int noGetTotal) {
        this.noGetTotal = noGetTotal;
    }

    public int getNoGetUrgeCount() {
        return noGetUrgeCount;
    }

    public void setNoGetUrgeCount(int noGetUrgeCount) {
        this.noGetUrgeCount = noGetUrgeCount;
    }

    public int getNoGetTodayNoUrgeCount() {
        return noGetTodayNoUrgeCount;
    }

    public void setNoGetTodayNoUrgeCount(int noGetTodayNoUrgeCount) {
        this.noGetTodayNoUrgeCount = noGetTodayNoUrgeCount;
    }

    public int getNoGetOtherCount() {
        return noGetOtherCount;
    }

    public void setNoGetOtherCount(int noGetOtherCount) {
        this.noGetOtherCount = noGetOtherCount;
    }

    public int getLoginStaffCount() {
        return loginStaffCount;
    }

    public void setLoginStaffCount(int loginStaffCount) {
        this.loginStaffCount = loginStaffCount;
    }
}
