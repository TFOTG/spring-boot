package com.elong.hotel.hotelconfirm.cancelorder.context;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.cancelorder.po.CancelOrderPo;
import com.elong.hotel.hotelconfirm.confirmorder.enums.ServerRunningDomainEnum;
import com.elong.hotel.proxy.javaorder.getorder.Order;
import com.elong.hotel.storage.bo.OrderConsumerInfoBo;
import com.elong.hotel.storage.request.OrderStatusChangeRequest;

import java.io.Serializable;

/**
 * Created by liujunjie on 2018/7/20.
 */
public class CancelorderDomainContext implements Serializable {

    private Integer reserNo;

    private ServerRunningDomainEnum serverRunningDomainEnum;

    private Order order;

    private CancelOrderPo cancelOrderPo;

    private OrderConsumerInfoBo orderConsumerInfoBo;

    private OperatorInfoBo operator;

    private OrderStatusChangeRequest request;

    public CancelorderDomainContext(Integer reserNo, ServerRunningDomainEnum serverRunningDomainEnum, Order order,
                                    CancelOrderPo cancelOrderPo, OrderConsumerInfoBo orderConsumerInfoBo)
    {
        this.reserNo = reserNo;
        this.serverRunningDomainEnum = serverRunningDomainEnum;
        this.order = order;
        this.cancelOrderPo = cancelOrderPo;
        this.orderConsumerInfoBo = orderConsumerInfoBo;
    }


    public Integer getReserNo() {
        return reserNo;
    }

    public void setReserNo(Integer reserNo) {
        this.reserNo = reserNo;
    }

    public ServerRunningDomainEnum getServerRunningDomainEnum() {
        return serverRunningDomainEnum;
    }

    public void setServerRunningDomainEnum(ServerRunningDomainEnum serverRunningDomainEnum) {
        this.serverRunningDomainEnum = serverRunningDomainEnum;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public CancelOrderPo getCancelOrderPo() {
        return cancelOrderPo;
    }

    public void setCancelOrderPo(CancelOrderPo cancelOrderPo) {
        this.cancelOrderPo = cancelOrderPo;
    }

    public OrderConsumerInfoBo getOrderConsumerInfoBo() {
        return orderConsumerInfoBo;
    }

    public void setOrderConsumerInfoBo(OrderConsumerInfoBo orderConsumerInfoBo) {
        this.orderConsumerInfoBo = orderConsumerInfoBo;
    }

    public OperatorInfoBo getOperator() {
        return operator;
    }

    public void setOperator(OperatorInfoBo operator) {
        this.operator = operator;
    }

    public OrderStatusChangeRequest getRequest() {
        return request;
    }

    public void setRequest(OrderStatusChangeRequest request) {
        this.request = request;
    }
}
