package com.elong.hotel.hotelconfirm.confirmorder.bo;


import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.proxy.javaorder.getorder.Order;

/**
 * 执行action操作的参数来源
 * 
 */
public class ServerRunningActionEntity {
    ConfirmOrderBo confirmOrderBo;

    OperatorInfoBo operatorInfoBo;

    Order order;

    public ServerRunningActionEntity(ConfirmOrderBo confirmOrderBo){
        this.confirmOrderBo = confirmOrderBo;
    }

    public ServerRunningActionEntity(ConfirmOrderBo confirmOrderBo, OperatorInfoBo operatorInfoBo, Order order) {
        this.confirmOrderBo = confirmOrderBo;
        this.operatorInfoBo = operatorInfoBo;
        this.order = order;
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
}
