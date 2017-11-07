package com.elong.hotel.hotelconfirm.confirmorder.request;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.confirmorder.bo.ConfirmOrderBo;
import com.elong.hotel.hotelconfirm.confirmorderactionlog.enums.ActionOpFromEnum;
import com.elong.hotel.proxy.javaorder.getorder.Order;

/**
 * Created by peng.wang on 17/6/6.
 */
public class UrgeRequest {

    private Integer orderId;

    private Order order;

    private ActionOpFromEnum actionOpFromEnum;

    private ConfirmOrderBo confirmOrderBo;

    private OperatorInfoBo operatorInfo;

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

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public ConfirmOrderBo getConfirmOrderBo() {
        return confirmOrderBo;
    }

    public void setConfirmOrderBo(ConfirmOrderBo confirmOrderBo) {
        this.confirmOrderBo = confirmOrderBo;
    }

    public ActionOpFromEnum getActionOpFromEnum() {
        return actionOpFromEnum;
    }

    public void setActionOpFromEnum(ActionOpFromEnum actionOpFromEnum) {
        this.actionOpFromEnum = actionOpFromEnum;
    }
}
