package com.elong.hotel.hotelconfirm.confirmorder.context;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.confirmorder.enums.ServerRunningDomainEnum;
import com.elong.hotel.hotelconfirm.confirmorder.po.ConfirmOrderPo;
import com.elong.hotel.proxy.javaorder.getorder.Order;
import com.elong.hotel.proxy.javaorder.getorder.OrderHistory;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class ConfirmOrderDomainContext implements Serializable {

    private Integer reserNo;

    private ServerRunningDomainEnum serverRunningDomainEnum;

    private Order order;

    private List<OrderHistory> orderHistories;

    private ConfirmOrderPo confirmOrderPo;

    private OperatorInfoBo operator;

    public ConfirmOrderDomainContext(){}

    public ConfirmOrderDomainContext(Integer reserNo, ServerRunningDomainEnum serverRunningDomainEnum, Order order,
            List<OrderHistory> orderHistories, ConfirmOrderPo confirmOrderPo, OperatorInfoBo operator) {
        this.reserNo = reserNo;
        this.serverRunningDomainEnum = serverRunningDomainEnum;
        this.order = order;
        this.orderHistories = orderHistories;
        this.confirmOrderPo = confirmOrderPo;
        this.operator = operator;
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

    public List<OrderHistory> getOrderHistories() {
        return orderHistories;
    }

    public void setOrderHistories(List<OrderHistory> orderHistories) {
        this.orderHistories = orderHistories;
    }

    public ConfirmOrderPo getConfirmOrderPo() {
        return confirmOrderPo;
    }

    public void setConfirmOrderPo(ConfirmOrderPo confirmOrderPo) {
        this.confirmOrderPo = confirmOrderPo;
    }

    public OperatorInfoBo getOperator() {
        return operator;
    }

    public void setOperator(OperatorInfoBo operator) {
        this.operator = operator;
    }
}
