package com.elong.hotel.hotelconfirm.confirmorder.enums;

/**
 * 反馈动作名称枚举
 */
public enum ServerActionEnum {

    /**
     * none
     */
    NONE("none", 0),

    /**
     * 是否可催
     */
    CAN_URGE("是否可催", 1),

    /**
     * 催确认
     */
    URGE("催确认", 2),

    /**
     * 修改承诺时间
     */
    CHANGE_PROMISETIME("修改承诺时间", 3),

    /**
     * 修改暂缓时间
     */
    CHANGE_RESPITETIME("修改暂缓时间", 4),

    /**
     * 订单确认
     */
    CONFIRM("订单确认", 5),

    /**
     * 初拒
     */
    REFUSE("初拒", 6);

    ServerActionEnum(String name, int actionIndex) {
        this.name = name;
        this.actionIndex = actionIndex;
    }

    // 行为名称
    private String name;
    // action执行优先级
    private int actionIndex;

    public int getActionIndex() {
        return actionIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
