package com.elong.hotel.hotelconfirm.confirmorder.enums;

/**
 * Created by yangboyu on 17/4/8.
 */
public enum ChangePromiseTimeResultEnum {
    /**
     * 修改承诺时间
     */
    NONE("无变化", 0),
    /**
     * 修改承诺时间
     */
    CHANGE_PROMISETIME("修改承诺时间", 1),
    /**
     * 修改承诺时间
     */
    CHANGE_ORDERSTATUS("修改订单状态", 1);

    ChangePromiseTimeResultEnum(String name, int actionIndex) {
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
