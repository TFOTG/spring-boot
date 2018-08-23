package com.elong.hotel.hotelconfirm.cancelorder.context;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.cancelorder.bo.CancelOrderBo;
import com.elong.hotel.hotelconfirm.confirmorder.enums.ServerRunningDomainEnum;
import com.elong.hotel.storage.bo.OrderConsumerInfoBo;
import com.elong.hotel.storage.request.OrderStatusChangeRequest;

import java.io.Serializable;

/**
 * Created by liujunjie on 2018/7/30.
 */
public class ServerRunningContext implements Serializable {

    private Integer reserNo;

    private CancelOrderBo originCancelOrderBo;

    private CancelOrderBo targetCancelOrderBo;

    private ServerRunningDomainEnum serverRunningDomainEnum;

    private OrderConsumerInfoBo orderConsumerInfoBo;

    private OperatorInfoBo operator;

    private OrderStatusChangeRequest request;

    public Integer getReserNo() {
        return reserNo;
    }

    public void setReserNo(Integer reserNo) {
        this.reserNo = reserNo;
    }

    public CancelOrderBo getOriginCancelOrderBo() {
        return originCancelOrderBo;
    }

    public void setOriginCancelOrderBo(CancelOrderBo originCancelOrderBo) {
        this.originCancelOrderBo = originCancelOrderBo;
    }

    public CancelOrderBo getTargetCancelOrderBo() {
        return targetCancelOrderBo;
    }

    public void setTargetCancelOrderBo(CancelOrderBo targetCancelOrderBo) {
        this.targetCancelOrderBo = targetCancelOrderBo;
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
