package com.elong.hotel.proxy.hotel3.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.elong.hotel.proxy.javaorder.request.OperatorInfo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by peng.wang on 2017/7/18.
 */
public class CloseRoomRequest implements Serializable{

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @NotNull(message="入住日期不能为空")
    private Date arriveDate;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @NotNull(message="离店日期不能为空")
    private Date leaveDate;

    /**
     * 操作类型:1关当前,2关全部,3关首晚产品
     */

    @Min(1)
    @Max(3)
    @NotNull(message="操作类型不能为空")
    private Integer operatorType;

    @NotNull(message="订单ID不能为空")
    private Integer orderId;

    private OperatorInfo operatorInfo;

    public Date getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(Date arriveDate) {
        this.arriveDate = arriveDate;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public Integer getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public OperatorInfo getOperatorInfo() {
        return operatorInfo;
    }

    public void setOperatorInfo(OperatorInfo operatorInfo) {
        this.operatorInfo = operatorInfo;
    }
}
