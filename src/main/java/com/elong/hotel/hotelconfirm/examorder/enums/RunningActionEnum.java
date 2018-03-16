package com.elong.hotel.hotelconfirm.examorder.enums;

/**
 * 反馈动作名称枚举
 */
public enum RunningActionEnum {

    /**
     * none
     */
    NONE("none", 0),

    /**
     * 订单入库
     */
    STORAGE_IN("订单入库", 1),

    /**
     * 订单出库
     */
    STORAGE_OUT("订单出库", 2),

    /**
     * 改变分组
     */
    CHANGE_GROUP("改变分组", 3),

    /**
     * 修改订单类型
     */
    CHANGE_ORDER_PRIORITY("修改订单优先级", 4),
    /**
     * 修改订单类型
     */
    CHANGE_ORDER_OVERTIME("修改订单超时", 5);

    RunningActionEnum(String name, int actionIndex) {
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
