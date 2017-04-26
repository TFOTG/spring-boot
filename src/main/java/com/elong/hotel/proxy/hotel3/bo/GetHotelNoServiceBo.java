package com.elong.hotel.proxy.hotel3.bo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by peng.wang on 17/4/26.
 */
public class GetHotelNoServiceBo {

    @JSONField(name = "OrderId")
    private String orderId;

    @JSONField(name = "HotelId")
    private String hotelId;

    @JSONField(name = "RPID")
    private String rpId;

    @JSONField(name = "CreateOrderTime")
    private String createOrderTime;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getRpId() {
        return rpId;
    }

    public void setRpId(String rpId) {
        this.rpId = rpId;
    }

    public String getCreateOrderTime() {
        return createOrderTime;
    }

    public void setCreateOrderTime(String createOrderTime) {
        this.createOrderTime = createOrderTime;
    }

    public GetHotelNoServiceBo(String orderId, String hotelId, String rpId, String createOrderTime) {
        this.orderId = orderId;
        this.hotelId = hotelId;
        this.rpId = rpId;
        this.createOrderTime = createOrderTime;
    }

    public GetHotelNoServiceBo() {
    }
}
