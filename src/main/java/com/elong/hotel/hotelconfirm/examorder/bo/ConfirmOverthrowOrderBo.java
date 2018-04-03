package com.elong.hotel.hotelconfirm.examorder.bo;

import com.elong.hotel.proxy.javaorder.request.OperatorInfo;

import java.io.Serializable;

/**
 * hotelmis
 *
 * @author jianjun.wang
 * @Date 2018-04-02 17:54  下午5:54
 */

public class ConfirmOverthrowOrderBo implements Serializable{
    private static final long serialVersionUID = -7850739856026439322L;

    private String orderId;

    private int businessSystemId;

    private int penaltyToCustomer;

    private int compensationToHotel;

    private String rejectStatus;

    private boolean ctripConfirmReject;

    private int changeReasonId;

    private String changeReason;

    private OperatorInfo operatorInfo;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getBusinessSystemId() {
        return businessSystemId;
    }

    public void setBusinessSystemId(int businessSystemId) {
        this.businessSystemId = businessSystemId;
    }

    public int getPenaltyToCustomer() {
        return penaltyToCustomer;
    }

    public void setPenaltyToCustomer(int penaltyToCustomer) {
        this.penaltyToCustomer = penaltyToCustomer;
    }

    public int getCompensationToHotel() {
        return compensationToHotel;
    }

    public void setCompensationToHotel(int compensationToHotel) {
        this.compensationToHotel = compensationToHotel;
    }

    public String getRejectStatus() {
        return rejectStatus;
    }

    public void setRejectStatus(String rejectStatus) {
        this.rejectStatus = rejectStatus;
    }

    public boolean isCtripConfirmReject() {
        return ctripConfirmReject;
    }

    public void setCtripConfirmReject(boolean ctripConfirmReject) {
        this.ctripConfirmReject = ctripConfirmReject;
    }

    public int getChangeReasonId() {
        return changeReasonId;
    }

    public void setChangeReasonId(int changeReasonId) {
        this.changeReasonId = changeReasonId;
    }

    public String getChangeReason() {
        return changeReason;
    }

    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
    }

    public OperatorInfo getOperatorInfo() {
        return operatorInfo;
    }

    public void setOperatorInfo(OperatorInfo operatorInfo) {
        this.operatorInfo = operatorInfo;
    }
}