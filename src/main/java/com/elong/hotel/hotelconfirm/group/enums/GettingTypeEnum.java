package com.elong.hotel.hotelconfirm.group.enums;

/**
 * 获取方式
 */
public enum  GettingTypeEnum {
    Hotel(0,"酒店"),

    Supplier(1,"供应商");

    private int key;
    private String value;

    GettingTypeEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public static String getValue(int key) {
        String result = "";
        for (GettingTypeEnum gettingTypeEnum : GettingTypeEnum.values()) {
            if (gettingTypeEnum.getKey() == key) {
                result = gettingTypeEnum.getValue();
                break;
            }
        }
        return result;
    }

    public String getValue() {
        return value;
    }
}
