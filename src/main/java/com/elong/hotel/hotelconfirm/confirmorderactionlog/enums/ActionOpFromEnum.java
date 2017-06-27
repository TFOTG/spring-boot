package com.elong.hotel.hotelconfirm.confirmorderactionlog.enums;

/**
 * Created by yangboyu on 17/4/6.
 */
public enum ActionOpFromEnum {
    /**
     * Mis操作
     */
    Mis("mis", "Mis操作"),
    /**
     * Ebooking操作
     */
    Ebooking("ebooking", "Ebooking操作"),
    /**
     * App操作
     */
    App("app", "App操作"),
    /**
     * ConfirmTask
     */
    Task("task", "系统自动延迟"),
    /**
     * IVR
     */
    Ivr("ivr", "ivr外呼");

    private String desc;
    private String key;

    ActionOpFromEnum(String key,String desc) {
        this.desc = desc;
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public static String getValue(String key) {
        String result = "";
        for (ActionOpFromEnum departmentEnum : ActionOpFromEnum.values()) {
            if (departmentEnum.getKey() == key) {
                result = departmentEnum.getKey();
                break;
            }
        }
        return result;
    }

    public String getDesc() {
        return desc;
    }
}
