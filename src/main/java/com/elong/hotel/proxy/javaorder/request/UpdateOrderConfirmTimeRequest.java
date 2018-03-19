package com.elong.hotel.proxy.javaorder.request;

import com.elong.hotel.common.bo.OperatorInfoBo;

import java.util.Date;

/**
 * Created by peng.wang on 2018/3/19.
 */
public class UpdateOrderConfirmTimeRequest {

    private Integer orderId;

    private Date pmsConfirmTime;

    private OperatorInfoBo clientOperatorInfo;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getPmsConfirmTime() {
        return pmsConfirmTime;
    }

    public void setPmsConfirmTime(Date pmsConfirmTime) {
        this.pmsConfirmTime = pmsConfirmTime;
    }

    public OperatorInfoBo getClientOperatorInfo() {
        return clientOperatorInfo;
    }

    public void setClientOperatorInfo(OperatorInfoBo clientOperatorInfo) {
        this.clientOperatorInfo = clientOperatorInfo;
    }
}
