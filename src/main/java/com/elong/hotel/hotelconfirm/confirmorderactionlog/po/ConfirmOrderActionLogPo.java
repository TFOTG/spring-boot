package com.elong.hotel.hotelconfirm.confirmorderactionlog.po;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.elong.hotel.hotelconfirm.group.bo.GroupTagBo;

/**
 * Created by yangboyu on 17/4/4.
 */
public class ConfirmOrderActionLogPo {

    private Integer id;

    private Integer orderId;

    private Long hotelId;

    private int logType;

    private String targetStatus;

    private Date targetTime;

    private String targetReason;

    private Integer messageStatus;

    private Integer messageType;

    private String opFrom;

    private Date opDate;

    private String operatorName;

    private String operatorIp;

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
}
