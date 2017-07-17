package com.elong.hotel.hotelconfirm.confirmorder.request;

import com.elong.hotel.proxy.javaorder.request.OperatorInfo;

/**
 * Created by peng.wang on 2017/7/14.
 */
public class UpdateOrderNotesAndConfirmNoRequest {

    // 订单号
    private Integer orderId;
    // 内部备注
    private String notesToElong;
    // 确认号
    private String confirmNo;
    // 操作者信息
    private OperatorInfo clientOperatorInfo;


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getNotesToElong() {
        return notesToElong;
    }

    public void setNotesToElong(String notesToElong) {
        this.notesToElong = notesToElong;
    }

    public String getConfirmNo() {
        return confirmNo;
    }

    public void setConfirmNo(String confirmNo) {
        this.confirmNo = confirmNo;
    }

    public OperatorInfo getClientOperatorInfo() {
        return clientOperatorInfo;
    }

    public void setClientOperatorInfo(OperatorInfo clientOperatorInfo) {
        this.clientOperatorInfo = clientOperatorInfo;
    }
}
