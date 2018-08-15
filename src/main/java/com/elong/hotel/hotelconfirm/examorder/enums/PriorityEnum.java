package com.elong.hotel.hotelconfirm.examorder.enums;

/**
 * 终拒订单优先级枚举
 */
public enum PriorityEnum {

    /**
     * None
     */
    None(0, "none"),

    /**
     * 紧急,马上到店
     */
    Urge(1, "当天紧急"),

    /**
     * 当天非紧急
     */
    TodayNoUrge(2, "当天非紧急"),

    /**
     * 次日
     */
    Tomorrow(3, "次日"),

    /**
     * 次日以后
     */
    AfterTomorrow(4, "次日以后");

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
       for (PriorityEnum examOrderOrderPriority : PriorityEnum.values()) {
            if (examOrderOrderPriority.getKey() == key) {
                result = examOrderOrderPriority;
                break;
            }
        }
        return result;
    }

    public String getValue() {
        return value;
    }

    public static String getValueDesc(int key) {
        String result = "";
        for (PriorityEnum examOrderOrderPriority : PriorityEnum.values()) {
             if (examOrderOrderPriority.getKey() == key) {
                 result = examOrderOrderPriority.value;
                 break;
             }
         }
         return result;
     }

}
