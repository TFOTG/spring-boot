package com.elong.hotel.hotelconfirm.examordermonitor.request;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liujunjie on 2018/6/25.
 */
public class GoBackOrderRequest implements Serializable {
    private List<Integer> orderIdList;

    private String staffName;

    private String leaderName;

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public List<Integer> getOrderIdList() {
        return orderIdList;
    }

    public void setOrderIdList(List<Integer> orderIdList) {
        this.orderIdList = orderIdList;
    }
}
