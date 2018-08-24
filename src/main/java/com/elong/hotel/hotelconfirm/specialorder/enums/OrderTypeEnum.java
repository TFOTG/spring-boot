package com.elong.hotel.hotelconfirm.specialorder.enums;

/**
 * Created by peng.wang on 2018/8/14.
 */
public enum OrderTypeEnum {


    None(0,"默认"),

    FraudChange(1,"恶意"),

    NewOrder(2,"新单"),

    ChangeOrder(3,"变更单");


    private int orderType;

    private String desc;

    OrderTypeEnum(int orderType, String desc) {
        this.orderType = orderType;
        this.desc = desc;
    }

    public int getOrderType() {
        return orderType;
    }

    public String getDesc() {
        return desc;
    }
}
