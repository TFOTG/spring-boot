package com.elong.hotel.proxy.hotel3.enums;

/**
 * Created by peng.wang on 2017/7/19.
 */
public enum CloseRoomTypeEnum {


    Ebooking(100,"Eb关房"),

    Mis(301,"MIS关房");

    CloseRoomTypeEnum(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    private int type;

    private String desc;

    public int getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}
