package com.elong.hotel.proxy.ebooking.requrst;

import java.util.Date;

/**
 * Created by yangboyu on 17/4/16.
 */
public class DelayOrder {
    private int orderId;
    private Date orderVerifyTime;
    private String shotelId;
    private int orderType;

    public DelayOrder(int orderId, int orderType, Date orderVerifyTime, String shotelId) {
        this.orderId = orderId;
        this.orderType = orderType;
        this.orderVerifyTime = orderVerifyTime;
        this.shotelId = shotelId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public Date getOrderVerifyTime() {
        return orderVerifyTime;
    }

    public void setOrderVerifyTime(Date orderVerifyTime) {
        this.orderVerifyTime = orderVerifyTime;
    }

    public String getShotelId() {
        return shotelId;
    }

    public void setShotelId(String shotelId) {
        this.shotelId = shotelId;
    }
}
