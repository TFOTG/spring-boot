package com.elong.hotel.hotelconfirm.confirmorder.enums;

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
     * 改变排序设置
     */
    CHANGE_RANKSETTING("改变排序设置", 4),

    /**
     * 改变状态到拒单
     */
    CHANGESTATUS_2END("改变状态到拒单", 5),

    /**
     * 延迟承诺时间
     */
    DELAY_PROMISE_TIME("修改承诺时间", 6),

    /**
     * 修改订单类型
     */
    CHANGE_ORDER_PRIORITY("修改订单优先级", 7),

    /**
     * 修改赫程承诺时间
     */
    CHANGE_CTRIP_PROMISE_TIME("修改赫程承诺时间", 8);

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
