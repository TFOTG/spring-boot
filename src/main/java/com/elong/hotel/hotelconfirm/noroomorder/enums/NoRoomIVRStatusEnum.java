package com.elong.hotel.hotelconfirm.noroomorder.enums;

/**
 * Created by peng.wang on 2017/8/31.
 */
public enum NoRoomIVRStatusEnum {

    NEW(0,"新建"),

    PROCESS(1,"处理中"),

    SUCCEED(2,"成功"),

    FAIL(3,"失败"),

    FAIL_SPECIAL(4,"失败并且不外呼"),

    FAIL_VALIDATION(5,"校验失败");

    private int type;

    private String desc;


    public int getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    NoRoomIVRStatusEnum(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
