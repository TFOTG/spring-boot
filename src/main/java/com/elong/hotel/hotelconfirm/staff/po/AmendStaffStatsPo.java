package com.elong.hotel.hotelconfirm.staff.po;

import java.util.Date;

/**
 * Created by user on 18/6/13.
 */
public class AmendStaffStatsPo {
    private String staffName; //员工姓名
    private Date statsDate; //统计日期
    private int statsHourRange; //统计小时范围，case：0的话，统计的就是00:00-01:00的数据
    private int fetchCount; //获取量
    private int handleCount; //处理量
    private int timelyHandleCount; //及时处理量
    private int m1Count; //M1
    private int cancelCount; //取消量
    private int newOrderCount; //新单量

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Date getStatsDate() {
        return statsDate;
    }

    public void setStatsDate(Date statsDate) {
        this.statsDate = statsDate;
    }

    public int getStatsHourRange() {
        return statsHourRange;
    }

    public void setStatsHourRange(int statsHourRange) {
        this.statsHourRange = statsHourRange;
    }

    public int getFetchCount() {
        return fetchCount;
    }

    public void setFetchCount(int fetchCount) {
        this.fetchCount = fetchCount;
    }

    public int getHandleCount() {
        return handleCount;
    }

    public void setHandleCount(int handleCount) {
        this.handleCount = handleCount;
    }

    public int getTimelyHandleCount() {
        return timelyHandleCount;
    }

    public void setTimelyHandleCount(int timelyHandleCount) {
        this.timelyHandleCount = timelyHandleCount;
    }

    public int getM1Count() {
        return m1Count;
    }

    public void setM1Count(int m1Count) {
        this.m1Count = m1Count;
    }

    public int getCancelCount() {
        return cancelCount;
    }

    public void setCancelCount(int cancelCount) {
        this.cancelCount = cancelCount;
    }

    public int getNewOrderCount() {
        return newOrderCount;
    }

    public void setNewOrderCount(int newOrderCount) {
        this.newOrderCount = newOrderCount;
    }
}
