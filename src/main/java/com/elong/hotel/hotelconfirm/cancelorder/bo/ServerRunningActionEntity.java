package com.elong.hotel.hotelconfirm.cancelorder.bo;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.cancelorder.po.CancelOrderPo;
import com.elong.hotel.proxy.javaorder.getorder.Order;

/**
 * Created by liujunjie on 2018/7/27.
 */
public class ServerRunningActionEntity {

    Order order;

    OperatorInfoBo operatorInfoBo;

    CancelOrderBo cancelOrderBo;

    CancelOrderPo cancelOrderPo;

    public ServerRunningActionEntity(CancelOrderPo po){
        this.cancelOrderPo = po;
    }

    public ServerRunningActionEntity(Order order,OperatorInfoBo operatorInfoBo,CancelOrderBo cancelOrderBo,CancelOrderPo cancelOrderPo){
        this.order = order;
        this.operatorInfoBo = operatorInfoBo;
        this.cancelOrderBo = cancelOrderBo;
        this.cancelOrderPo = cancelOrderPo;
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

    public CancelOrderBo getCancelOrderBo() {
        return cancelOrderBo;
    }

    public void setCancelOrderBo(CancelOrderBo cancelOrderBo) {
        this.cancelOrderBo = cancelOrderBo;
    }

    public CancelOrderPo getCancelOrderPo() {
        return cancelOrderPo;
    }

    public void setCancelOrderPo(CancelOrderPo cancelOrderPo) {
        this.cancelOrderPo = cancelOrderPo;
    }
}
