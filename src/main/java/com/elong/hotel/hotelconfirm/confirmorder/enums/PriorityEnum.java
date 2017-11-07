package com.elong.hotel.hotelconfirm.confirmorder.enums;

/**
 * Created by yangboyu on 17/4/6.
 */
public enum PriorityEnum {

    /**
     * None
     */
    None(0, "none"),
    /**
     * 马上到店
     */
    High(1, "马上到店"),

    /**
     * 非服务时间
     */
    NoServer(2, "非服务时间"),

    /**
     * 夜班模式
     */
    Night(3, "夜班模式"),

    /**
     * 普通
     */
    General(4, "普通");

    private int key;
    private String value;

    PriorityEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public static PriorityEnum getValue(int key) {
        PriorityEnum result = PriorityEnum.None;
        for (PriorityEnum confirmOrderPriority : PriorityEnum.values()) {
            if (confirmOrderPriority.getKey() == key) {
                result = confirmOrderPriority;
                break;
            }
        }
        return result;
    }

    public String getValue() {
        return value;
    }


}
