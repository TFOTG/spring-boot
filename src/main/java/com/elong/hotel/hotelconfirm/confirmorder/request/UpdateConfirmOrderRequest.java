package com.elong.hotel.hotelconfirm.confirmorder.request;

import java.util.List;

/**
 * Created by peng.wang on 17/6/6.
 */
public class UpdateConfirmOrderRequest {

    //操作的订单id集合
    private List<Integer> orderIds;

    //分配的员工姓名
    private String staffName;

    //更新类型，6分配，7回收
    private Integer updateType;

    public List<Integer> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<Integer> orderIds) {
        this.orderIds = orderIds;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Integer getUpdateType() {
        return updateType;
    }

    public void setUpdateType(Integer updateType) {
        this.updateType = updateType;
    }
}
