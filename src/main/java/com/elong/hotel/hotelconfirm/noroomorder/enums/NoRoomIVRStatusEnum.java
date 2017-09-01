package com.elong.hotel.hotelconfirm.noroomorder.enums;

/**
 * Created by peng.wang on 2017/8/31.
 */
public enum NoRoomIVRStatusEnum {

    NEW(0,"新建"),

    PROCESS(1,"处理中"),

    SUCCEED_FULL(2,"成功反馈满房"),

    SUCCEED_NOFUll(3,"成功反馈未满房"),

    FAIL(4,"失败"),

    FAIL_SPECIAL(5,"失败并且不外呼"),

    FAIL_VALIDATION(6,"校验失败");

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
