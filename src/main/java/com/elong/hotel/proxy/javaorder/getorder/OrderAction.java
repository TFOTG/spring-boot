package com.elong.hotel.proxy.javaorder.getorder;

/**
 * Created by peng.wang on 2017/8/16.
 */
public class OrderAction {


    private long orderId;

    /**
     * 字段内容
     */
    private String strExt1;

    /**
     * 字段类型,5是客人备注
     */
    private int actionType;

    public int getActionType() {
        return actionType;
    }

    public void setActionType(int actionType) {
        this.actionType = actionType;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getStrExt1() {
        return strExt1;
    }

    public void setStrExt1(String strExt1) {
        this.strExt1 = strExt1;
    }
}
