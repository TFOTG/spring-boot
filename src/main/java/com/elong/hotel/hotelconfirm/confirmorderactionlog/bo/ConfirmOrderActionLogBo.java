package com.elong.hotel.hotelconfirm.confirmorderactionlog.bo;

import com.alibaba.fastjson.annotation.JSONField;
import com.elong.hotel.common.helper.StringUtils;
import com.elong.hotel.hotelconfirm.confirmorder.request.GetInOutHistoryDataRequest;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by liujunjie on 2017/7/20.
 */
public class ConfirmOrderActionLogBo {


    /**
     * 所查数据库名称（有可能查归档库）
     */
    private String logDBName;

    /**
     * 查询开始时间
     */
    private String startTime;

    /**
     * 查询结束时间
     */
    private String endTime;

    private Integer orderId;

    private Long hotelId;

    private Integer logType;

    private String targetStatus;

    private List<String> logStatusList;

    private Date targetTime;

    private String targetReason;

    private Integer messageStatus;

    private Integer messageType;

    private String opFrom;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private java.util.Date opDate;

    private String operatorName;

    private String operatorIp;

    public String getLogDBName(GetInOutHistoryDataRequest request){
        String logName="";

        if(request!=null){
            StringBuilder fileDBName = new StringBuilder("confirmorderactionlog");
            fileDBName.append("_");
            if (StringUtils.isNotBlank(request.getStartTime())) {
                fileDBName.append(request.getStartTime().substring(2, 4) + "_" + request.getStartTime().substring(5, 7));
            } else if (StringUtils.isNotBlank(request.getEndTime())) {
                fileDBName.append(request.getEndTime().substring(2, 4) + "_" + request.getEndTime().substring(5, 7));
            } else {
                SimpleDateFormat format = new SimpleDateFormat("yy_MM");
                fileDBName.append(format.format(new java.util.Date()));
            }
            logName=fileDBName.toString();
        }

        return logName;
    }

    public List<String> getLogStatusList() {
        return logStatusList;
    }

    public void setLogStatusList(List<String> logStatusList) {
        this.logStatusList = logStatusList;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getLogType() {
        return logType;
    }

    public void setLogType(Integer logType) {
        this.logType = logType;
    }

    public String getTargetStatus() {
        return targetStatus;
    }

    public void setTargetStatus(String targetStatus) {
        this.targetStatus = targetStatus;
    }

    public Date getTargetTime() {
        return targetTime;
    }

    public void setTargetTime(Date targetTime) {
        this.targetTime = targetTime;
    }

    public String getTargetReason() {
        return targetReason;
    }

    public void setTargetReason(String targetReason) {
        this.targetReason = targetReason;
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

    public String getOpFrom() {
        return opFrom;
    }

    public void setOpFrom(String opFrom) {
        this.opFrom = opFrom;
    }

    public java.util.Date getOpDate() {
        return opDate;
    }

    public void setOpDate(java.util.Date opDate) {
        this.opDate = opDate;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorIp() {
        return operatorIp;
    }

    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp;
    }

    public String getLogDBName() {
        return logDBName;
    }

    public void setLogDBName(String logDBName) {
        this.logDBName = logDBName;
    }
}
