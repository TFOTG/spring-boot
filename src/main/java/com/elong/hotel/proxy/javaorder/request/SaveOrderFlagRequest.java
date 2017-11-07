package com.elong.hotel.proxy.javaorder.request;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author
 */
public class SaveOrderFlagRequest {

    // 操作者信息
    @JSONField(name = "operatorInfo")
    private OperatorInfo clientOperatorInfo;

    private long orderId;
    /// <summary>
    /// 标描述，HotSwitch上OrderFlagConfig有合法key集合
    /// HasOrderBeRefusedEver，标识订单是否被酒店拒绝过，包括：mis投放初拒、ivr被酒店选择不确认、酒店在ebk操作假拒单、直连失败（业务失败、系统失败都包括）、订单状态变更到OUG
    /// </summary>
    private String orderFlagKey;
    /// <summary>
    /// 0:去标;1:加标
    /// </summary>
    private int operateType;

    public OperatorInfo getClientOperatorInfo() {
        return clientOperatorInfo;
    }

    public void setClientOperatorInfo(OperatorInfo clientOperatorInfo) {
        this.clientOperatorInfo = clientOperatorInfo;
    }

    public int getOperateType() {
        return operateType;
    }

    public void setOperateType(int operateType) {
        this.operateType = operateType;
    }

    public String getOrderFlagKey() {
        return orderFlagKey;
    }

    public void setOrderFlagKey(String orderFlagKey) {
        this.orderFlagKey = orderFlagKey;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }
}
