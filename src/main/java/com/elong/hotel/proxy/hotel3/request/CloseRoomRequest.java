package com.elong.hotel.proxy.hotel3.request;

import com.elong.hotel.proxy.javaorder.request.OperatorInfo;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by peng.wang on 2017/7/18.
 */
public class CloseRoomRequest implements Serializable{

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @NotNull(message="入住日期不能为空")
    private Date arriveDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @NotNull(message="离店日期不能为空")
    private Date leaveDate;

    /**
     * 操作类型:1关首晚产品,2.关当前房型,3.关全部房型
     */

    @Min(value = 1,message = "无效的操作类型")
    @Max(value = 3,message = "无效的操作类型")
    @NotNull(message="操作类型不能为空")
    private Integer operatorType;

    @Min(value = 10000,message = "无效的订单号")
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
