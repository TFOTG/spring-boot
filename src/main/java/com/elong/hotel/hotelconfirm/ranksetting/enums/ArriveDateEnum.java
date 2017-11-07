package com.elong.hotel.hotelconfirm.ranksetting.enums;

/**
 * Created by yangboyu on 17/4/6.
 */
public enum ArriveDateEnum {

    /**
     * 当日
     */
    TODAY(1, "当日"),
    /**
     * 次日
     */
    TOMORROW(2, "次日"),
    /**
     * 次日以后
     */
    AFTERT_OMORROW(3, "次日以后");

    private int key;
    private String value;

    ArriveDateEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public static String getValue(int key) {
        String result = "";
        for (ArriveDateEnum departmentEnum : ArriveDateEnum.values()) {
            if (departmentEnum.getKey() == key) {
                result = departmentEnum.getValue();
                break;
            }
        }
        return result;
    }

    public String getValue() {
        return value;
    }
}
