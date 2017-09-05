package com.elong.hotel.hotelconfirm.noroomorder.request;

/**
 * Created by peng.wang on 2017/9/4.
 */
public class UpdateNoRoomOrder4EbRequest {

    private Integer orderId;

    private Integer status;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
