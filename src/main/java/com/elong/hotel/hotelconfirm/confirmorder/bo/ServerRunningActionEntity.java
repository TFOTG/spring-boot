package com.elong.hotel.hotelconfirm.confirmorder.bo;


import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.confirmorder.po.ConfirmOrderPo;
import com.elong.hotel.proxy.javaorder.getorder.Order;

/**
 * 执行action操作的参数来源
 * 
 */
public class ServerRunningActionEntity {
    ConfirmOrderBo confirmOrderBo;

    OperatorInfoBo operatorInfoBo;

    ConfirmOrderPo confirmOrderPo;

    Order order;

    public ServerRunningActionEntity(ConfirmOrderBo confirmOrderBo){
        this.confirmOrderBo = confirmOrderBo;
    }

    public ServerRunningActionEntity(ConfirmOrderBo confirmOrderBo, OperatorInfoBo operatorInfoBo, Order order, ConfirmOrderPo confirmOrderPo) {
        this.confirmOrderBo = confirmOrderBo;
        this.operatorInfoBo = operatorInfoBo;
        this.order = order;
        this.confirmOrderPo = confirmOrderPo;
    }

    public ConfirmOrderBo getConfirmOrderBo() {
        return confirmOrderBo;
    }

    public void setConfirmOrderBo(ConfirmOrderBo confirmOrderBo) {
        this.confirmOrderBo = confirmOrderBo;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public OperatorInfoBo getOperatorInfoBo() {
        return operatorInfoBo;
    }

    public void setOperatorInfoBo(OperatorInfoBo operatorInfoBo) {
        this.operatorInfoBo = operatorInfoBo;
    }

    public ConfirmOrderPo getConfirmOrderPo() {
        return confirmOrderPo;
    }

    public void setConfirmOrderPo(ConfirmOrderPo confirmOrderPo) {
        this.confirmOrderPo = confirmOrderPo;
    }
}
