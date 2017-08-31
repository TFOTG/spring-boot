package com.elong.hotel.hotelconfirm.noroomorder.enums;

/**
 * Created by peng.wang on 2017/8/31.
 */
public enum NoRoomDealTypeEnum {

    NoDeal(0,"未处理"),

    EBooking(1,"Eb处理"),

    Staff(2,"员工处理");

    private int type;

    private String desc;

    public int getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    NoRoomDealTypeEnum(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
