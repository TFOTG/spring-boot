package com.elong.hotel.hotelconfirm.confirmorder.request;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.confirmorderactionlog.enums.ActionOpFromEnum;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * Created by peng.wang on 17/6/6.
 */
public class ChangeRespiteTimeRequest {

    private Integer orderId;

    private List<Integer> orderIdList;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date respiteTime;

    private OperatorInfoBo operatorInfo;

    private ActionOpFromEnum actionOpFromEnum;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getRespiteTime() {
        return respiteTime;
    }

    public void setRespiteTime(Date respiteTime) {
        this.respiteTime = respiteTime;
    }

    public OperatorInfoBo getOperatorInfo() {
        return operatorInfo;
    }

    public void setOperatorInfo(OperatorInfoBo operatorInfo) {
        this.operatorInfo = operatorInfo;
    }

    public ActionOpFromEnum getActionOpFromEnum() {
        return actionOpFromEnum;
    }

    public void setActionOpFromEnum(ActionOpFromEnum actionOpFromEnum) {
        this.actionOpFromEnum = actionOpFromEnum;
    }

    public List<Integer> getOrderIdList() {
        return orderIdList;
    }

    public void setOrderIdList(List<Integer> orderIdList) {
        this.orderIdList = orderIdList;
    }
}
