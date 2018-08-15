package com.elong.hotel.hotelconfirm.specialorder.context;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.confirmorder.enums.ServerRunningDomainEnum;
import com.elong.hotel.hotelconfirm.specialorder.po.SpecialOrderPo;
import com.elong.hotel.proxy.javaorder.getorder.Order;
import com.elong.hotel.storage.bo.OrderConsumerInfoBo;

/**
 * Created by peng.wang on 2018/8/9.
 */
public class SpecialOrderDomainContext {

    private Integer reserNo;

    private ServerRunningDomainEnum serverRunningDomainEnum;

    private Order order;

    private SpecialOrderPo specialOrderPo;

    private OrderConsumerInfoBo orderConsumerInfoBo;

    private OperatorInfoBo operator;


    public SpecialOrderDomainContext(Integer reserNo, ServerRunningDomainEnum serverRunningDomainEnum,
                                     Order order, SpecialOrderPo specialOrderPo, OrderConsumerInfoBo orderConsumerInfoBo,
                                     OperatorInfoBo operator) {
        this.reserNo = reserNo;
        this.serverRunningDomainEnum = serverRunningDomainEnum;
        this.order = order;
        this.specialOrderPo = specialOrderPo;
        this.orderConsumerInfoBo = orderConsumerInfoBo;
        this.operator = operator;
    }

    public SpecialOrderDomainContext() {
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

    public SpecialOrderPo getSpecialOrderPo() {
        return specialOrderPo;
    }

    public void setSpecialOrderPo(SpecialOrderPo specialOrderPo) {
        this.specialOrderPo = specialOrderPo;
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


}
