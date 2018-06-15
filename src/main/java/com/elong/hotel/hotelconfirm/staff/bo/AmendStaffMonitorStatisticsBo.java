package com.elong.hotel.hotelconfirm.staff.bo;

import java.io.Serializable;

/**
 * Created by pony.ma on 18/6/7.
 */
public class AmendStaffMonitorStatisticsBo implements Serializable {
    private int hourRange; //统计小时范围，case：0的话，统计的就是00:00-01:00的数据
    private int fetchCount; //获取量
    private int handleCount; //处理量
    private int timelyHandleCount; //及时处理量
    private int m1Count; //M1
    private int cancelCount; //取消量
    private int newOrderCount; //新单量

    public int getHourRange() {
        return hourRange;
    }

    public void setHourRange(int hourRange) {
        this.hourRange = hourRange;
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
