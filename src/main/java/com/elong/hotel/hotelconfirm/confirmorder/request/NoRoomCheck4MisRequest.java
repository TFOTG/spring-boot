package com.elong.hotel.hotelconfirm.confirmorder.request;

import java.util.Date;

/**
 * Created by peng.wang on 2017/9/12.
 */
public class NoRoomCheck4MisRequest {

    /**
     * 订单号
     */
    private Long orderId;

    /**
     * 操作状态 1满房 2未满 3协调解决
     */
    private Integer status;

    /**
     * 来源1ebk 2ivr 3人工
     */
    private Integer source;

    /**
     * 操作人姓名
     */
    private String operatorName;

    /**
     * 操作时间
     */
    private Date operateTime;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }
}
