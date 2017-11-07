package com.elong.hotel.hotelconfirm.confirmorder.context;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.confirmorder.bo.EBRefuseBo;
import com.elong.hotel.hotelconfirm.confirmorder.enums.ServerRunningDomainEnum;
import com.elong.hotel.hotelconfirm.confirmorder.po.ConfirmOrderPo;
import com.elong.hotel.proxy.javaorder.getorder.GetOrderStatusChangeTimeBo;
import com.elong.hotel.proxy.javaorder.getorder.Order;
import com.elong.hotel.proxy.javaorder.getorder.OrderHistory;
import com.elong.hotel.storage.bo.OrderConsumerInfoBo;

import java.io.Serializable;
import java.util.List;

public class ConfirmOrderDomainContext implements Serializable {

    private Integer reserNo;

    private ServerRunningDomainEnum serverRunningDomainEnum;

    private Order order;

    private ConfirmOrderPo confirmOrderPo;

    private OrderConsumerInfoBo orderConsumerInfoBo;

    private GetOrderStatusChangeTimeBo orderStatusChange;

    private OperatorInfoBo operator;

    private String msg2customer;

    private Integer msgId;

    private String note2Action;

    private EBRefuseBo ebRefuseBo;

    public ConfirmOrderDomainContext(){}

    public ConfirmOrderDomainContext(Integer reserNo, ServerRunningDomainEnum serverRunningDomainEnum, Order order,
             ConfirmOrderPo confirmOrderPo, OperatorInfoBo operator, OrderConsumerInfoBo orderConsumerInfoBo,GetOrderStatusChangeTimeBo orderStatusChange) {
        this.reserNo = reserNo;
        this.serverRunningDomainEnum = serverRunningDomainEnum;
        this.order = order;
        this.confirmOrderPo = confirmOrderPo;
        this.operator = operator;
        this.orderConsumerInfoBo = orderConsumerInfoBo;
        this.orderStatusChange=orderStatusChange;
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

    public EBRefuseBo getEbRefuseBo() {
        return ebRefuseBo;
    }

    public void setEbRefuseBo(EBRefuseBo ebRefuseBo) {
        this.ebRefuseBo = ebRefuseBo;
    }

    public String getNote2Action() {
        return note2Action;
    }

    public void setNote2Action(String note2Action) {
        this.note2Action = note2Action;
    }

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public GetOrderStatusChangeTimeBo getOrderStatusChange() {
        return orderStatusChange;
    }

    public void setOrderStatusChange(GetOrderStatusChangeTimeBo orderStatusChange) {
        this.orderStatusChange = orderStatusChange;
    }
}
