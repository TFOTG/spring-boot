package com.elong.hotel.hotelconfirm.cancelorder.enums;

/**
 * Created by liujunjie on 2018/7/27.
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
    STORAGE_OUT("订单出库", 2);

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
