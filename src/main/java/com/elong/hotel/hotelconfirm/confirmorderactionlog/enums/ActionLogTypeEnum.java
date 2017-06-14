package com.elong.hotel.hotelconfirm.confirmorderactionlog.enums;

/**
 * Created by yangboyu on 17/4/6.
 */
public enum ActionLogTypeEnum {
    /**
     * Ebooking拒单
     */
    EbookingRefuse(1, "Ebooking拒单"),
    /**
     * 初拒
     */
    FirstRefuse(2, "初拒"),
    /**
     * 暂缓
     */
    Pause(3, "暂缓"),
    /**
     * 需担保/需同意
     */
    SpecialStatus(4, "需担保/需同意"),
    /**
     * 催确认
     */
    Urge(5, "催确认"),
    /**
     * 手动修改承诺时间
     */
    ChangePromiseTime(6,"修改承诺时间");

    private int key;
    private String value;

    ActionLogTypeEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public static String getValue(int key) {
        String result = "";
        for (ActionLogTypeEnum departmentEnum : ActionLogTypeEnum.values()) {
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
