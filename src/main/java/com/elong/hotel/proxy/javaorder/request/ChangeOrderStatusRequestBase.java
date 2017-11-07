package com.elong.hotel.proxy.javaorder.request;

import com.elong.hotel.common.bo.OperatorInfoBo;

/**
 * @author zouyufei
 */
public class ChangeOrderStatusRequestBase {
    // 订单号
    private int orderId;
    // 业务线id 0-mis
    private int businessSystemId;
    // 操作人信息
    private OperatorInfoBo operatorInfo;


    public ChangeOrderStatusRequestBase(int orderId, String operatorName, String operatorIp) {
        this.orderId = orderId;
        this.businessSystemId = 0;
        //修改订单状态，不需要传递修改时间
        this.operatorInfo = new OperatorInfoBo();
        this.operatorInfo.setOperatorIP(operatorIp);
        this.operatorInfo.setOperatorName(operatorName);

    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getBusinessSystemId() {
        return businessSystemId;
    }

    public void setBusinessSystemId(int businessSystemId) {
        this.businessSystemId = businessSystemId;
    }

    public OperatorInfoBo getOperatorInfo() {
        return operatorInfo;
    }

    public void setOperatorInfo(OperatorInfoBo operatorInfo) {
        this.operatorInfo = operatorInfo;
    }
}
