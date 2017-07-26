package com.elong.hotel.hotelconfirm.confirmorderactionlog.po;

import com.alibaba.fastjson.annotation.JSONField;
import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.confirmorderactionlog.enums.ActionLogTypeEnum;
import com.elong.hotel.hotelconfirm.confirmorderactionlog.enums.ActionOpFromEnum;
import com.elong.hotel.proxy.javaorder.getorder.Order;

import java.util.Date;

/**
 * Created by yangboyu on 17/4/4.
 */
public class ConfirmOrderActionLogPo {

    private Long id;

    private Integer orderId;

    private Long hotelId;

    private int logType;

    private String targetStatus;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date targetTime;

    private String targetReason;

    private Integer messageStatus;

    private Integer messageType;

    private String opFrom;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date opDate;

    private String operatorName;

    private String operatorIp;

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getLogType() {
        return logType;
    }

    public void setLogType(int logType) {
        this.logType = logType;
    }

    public Integer getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(Integer messageStatus) {
        this.messageStatus = messageStatus;
    }

    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    public Date getOpDate() {
        return opDate;
    }

    public void setOpDate(Date opDate) {
        this.opDate = opDate;
    }

    public String getOperatorIp() {
        return operatorIp;
    }

    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp;
    }

    public String getOpFrom() {
        return opFrom;
    }

    public void setOpFrom(String opFrom) {
        this.opFrom = opFrom;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getTargetReason() {
        return targetReason;
    }

    public void setTargetReason(String targetReason) {
        this.targetReason = targetReason;
    }

    public String getTargetStatus() {
        return targetStatus;
    }

    public void setTargetStatus(String targetStatus) {
        this.targetStatus = targetStatus;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public Date getTargetTime() {
        return targetTime;
    }

    public void setTargetTime(Date targetTime) {
        this.targetTime = targetTime;
    }

    public ConfirmOrderActionLogPo() {
    }

    public ConfirmOrderActionLogPo( Order order,String targetStatus,OperatorInfoBo operatorInfoBo,ActionLogTypeEnum logTypeEnum,ActionOpFromEnum opFromEnum) {
        this.orderId = order.getOrderId().intValue();
        this.hotelId = Long.getLong(order.getHotelId());
        this.logType = logTypeEnum.getKey();
        this.targetStatus = targetStatus;
        this.targetReason = targetReason;

        this.opFrom = opFromEnum.getKey();
        this.opDate = operatorInfoBo.getOperatorTime();
        this.operatorName = operatorInfoBo.getOperatorName();
        this.operatorIp = operatorInfoBo.getOperatorIP();
    }
}
