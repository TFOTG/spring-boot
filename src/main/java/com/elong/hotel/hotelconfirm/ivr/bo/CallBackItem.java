package com.elong.hotel.hotelconfirm.ivr.bo;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

public class CallBackItem implements Serializable {

    @JSONField(name = "OrderId")
    private int orderId;

    @JSONField(name = "FeedBackStatus")
    private String feedBackStatus;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getFeedBackStatus() {
        return feedBackStatus;
    }

    public void setFeedBackStatus(String feedBackStatus) {
        this.feedBackStatus = feedBackStatus;
    }
}