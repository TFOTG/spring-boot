package com.elong.hotel.hotelconfirm.confirmorder.context;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.confirmorder.enums.ServerRunningDomainEnum;
import com.elong.hotel.hotelconfirm.confirmorder.po.ConfirmOrderPo;
import com.elong.hotel.proxy.javaorder.getorder.Order;
import com.elong.hotel.proxy.javaorder.getorder.OrderHistory;
import com.elong.hotel.storage.bo.OrderConsumerInfoBo;

import java.io.Serializable;
import java.util.List;

public class ConfirmOrderDomainContext implements Serializable {

    private Integer reserNo;

    private ServerRunningDomainEnum serverRunningDomainEnum;

    private Order order;

    private List<OrderHistory> orderHistories;

    private ConfirmOrderPo confirmOrderPo;

    private OrderConsumerInfoBo orderConsumerInfoBo;

    private OperatorInfoBo operator;

    private String msg2customer;

    public ConfirmOrderDomainContext(){}

    public ConfirmOrderDomainContext(Integer reserNo, ServerRunningDomainEnum serverRunningDomainEnum, Order order,
            List<OrderHistory> orderHistories, ConfirmOrderPo confirmOrderPo, OperatorInfoBo operator, OrderConsumerInfoBo orderConsumerInfoBo) {
        this.reserNo = reserNo;
        this.serverRunningDomainEnum = serverRunningDomainEnum;
        this.order = order;
        this.orderHistories = orderHistories;
        this.confirmOrderPo = confirmOrderPo;
        this.operator = operator;
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

    public OrderConsumerInfoBo getOrderConsumerInfoBo() {
        return orderConsumerInfoBo;
    }

    public void setOrderConsumerInfoBo(OrderConsumerInfoBo orderConsumerInfoBo) {
        this.orderConsumerInfoBo = orderConsumerInfoBo;
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

    public String getMsg2customer() {
        return msg2customer;
    }

    public void setMsg2customer(String msg2customer) {
        this.msg2customer = msg2customer;
    }
}
