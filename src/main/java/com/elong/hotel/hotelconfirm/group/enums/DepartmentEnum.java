package com.elong.hotel.hotelconfirm.group.enums;

/**
 * Created by yangboyu on 17/4/6.
 */
public enum DepartmentEnum {
    /**
     * 已审
     */
    Confirm(1, "已审");

    private int key;
    private String value;

    DepartmentEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public static String getValue(int key) {
        String result = "";
        for (DepartmentEnum departmentEnum : DepartmentEnum.values()) {
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
