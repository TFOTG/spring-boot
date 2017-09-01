package com.elong.hotel.hotelconfirm.noroomorder.enums;

/**
 * Created by peng.wang on 2017/9/1.
 */
public enum NoRoomStaffStatusEnum {

    NoDeal(0,"员工未处理"),

    Deal(1,"员工已处理");



    private int status;

    private String desc;

    public int getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }

    NoRoomStaffStatusEnum(int status, String desc) {
        this.status = status;
        this.desc = desc;
    }

}
