package com.elong.hotel.hotelconfirm.confirmorder.request;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.confirmorder.po.ConfirmOrderPo;
import com.elong.hotel.hotelconfirm.confirmorderactionlog.enums.ActionOpFromEnum;
import com.elong.hotel.proxy.javaorder.getorder.Order;

/**
 * Created by peng.wang on 17/6/6.
 */
public class CanUrgeRequest {

    private Integer orderId;

    private ActionOpFromEnum actionOpFromEnum;

    private OperatorInfoBo operatorInfo;

    private ConfirmOrderPo confirmOrderPo;

    private Order order;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public OperatorInfoBo getOperatorInfo() {
        return operatorInfo;
    }

    public void setOperatorInfo(OperatorInfoBo operatorInfo) {
        this.operatorInfo = operatorInfo;
    }

    public ConfirmOrderPo getConfirmOrderPo() {
        return confirmOrderPo;
    }

    public void setConfirmOrderPo(ConfirmOrderPo confirmOrderPo) {
        this.confirmOrderPo = confirmOrderPo;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public ActionOpFromEnum getActionOpFromEnum() {
        return actionOpFromEnum;
    }

    public void setActionOpFromEnum(ActionOpFromEnum actionOpFromEnum) {
        this.actionOpFromEnum = actionOpFromEnum;
    }
}
