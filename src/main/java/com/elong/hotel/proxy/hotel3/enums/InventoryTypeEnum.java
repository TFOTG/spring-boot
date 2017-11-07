package com.elong.hotel.proxy.hotel3.enums;

/**
 * Created by peng.wang on 2017/7/19.
 */
public enum InventoryTypeEnum {

    NoDeclare(-1,"未声明"),
    OverSale(0,"超售"),
    Add(1,"添加"),
    Contract(2,"签约"),
    Buyout(3,"买断");

    InventoryTypeEnum(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    private int type;

    private String desc;

    public int getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

}
