package com.elong.hotel.hotelconfirm.confirmorderactionlog.enums;

/**
 * Created by yangboyu on 17/4/6.
 */
public enum ActionOpFromEnum {
    /**
     * 已审
     */
    Mis("mis", "Mis操作"),
    /**
     * 已审
     */
    Ebooking("ebooking", "Ebooking操作");

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
