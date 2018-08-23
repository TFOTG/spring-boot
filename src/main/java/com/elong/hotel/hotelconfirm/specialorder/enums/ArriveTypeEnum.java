package com.elong.hotel.hotelconfirm.specialorder.enums;

/**
 * Created by peng.wang on 2018/8/20.
 */
public enum ArriveTypeEnum {

    /**
     * None
     */
    None(0, "none"),

    /**
     * 马上到店
     */
    Urge(1, "当天紧急"),

    /**
     * 当天非紧急
     */
    TodayNoUrge(2, "当天非紧急"),

    /**
     * 次日及以后
     */
    TomorrowOrAfter(3, "次日");
    private int type;
    private String desc;

    ArriveTypeEnum(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public int getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}
