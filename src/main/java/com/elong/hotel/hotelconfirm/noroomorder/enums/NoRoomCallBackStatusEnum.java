package com.elong.hotel.hotelconfirm.noroomorder.enums;

/**
 * Created by peng.wang on 2017/9/4.
 */
public enum NoRoomCallBackStatusEnum {

    NOT_FULL(1,"未满房"),

    FULL(2,"满房");

    private int status;

    private String desc;

    public int getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }

    NoRoomCallBackStatusEnum(int status, String desc) {
        this.status = status;
        this.desc = desc;
    }
}
