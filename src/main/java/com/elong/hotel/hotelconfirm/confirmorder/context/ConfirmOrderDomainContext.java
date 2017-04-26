package com.elong.hotel.hotelconfirm.confirmorder.context;

import com.elong.hotel.hotelconfirm.confirmorder.enums.ServerRunningDomainEnum;

import java.io.Serializable;

public class ConfirmOrderDomainContext implements Serializable {

    private Integer reserNo;

    private ServerRunningDomainEnum serverRunningDomainEnum;

    public ConfirmOrderDomainContext(Integer reserNo, ServerRunningDomainEnum domainEnum) {
        this.reserNo = reserNo;
        this.serverRunningDomainEnum = domainEnum;
    }

    public Integer getReserNo() {
        return reserNo;
    }

    public void setReserNo(Integer reserNo) {
        this.reserNo = reserNo;
    }

    public ServerRunningDomainEnum getServerRunningDomainEnum() {
        return serverRunningDomainEnum;
    }

    public void setServerRunningDomainEnum(ServerRunningDomainEnum serverRunningDomainEnum) {
        this.serverRunningDomainEnum = serverRunningDomainEnum;
    }
}
