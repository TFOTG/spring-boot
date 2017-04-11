package com.elong.hotel.hotelconfirm.confirmorder.context;

import com.elong.hotel.hotelconfirm.confirmorder.enums.ServerRunningDomainEnum;

import java.io.Serializable;

public class ConfirmOrderDomainContext implements Serializable {

    private Integer reserNo;

    private ServerRunningDomainEnum serverRuningDomainEnum;

    public ConfirmOrderDomainContext(Integer reserNo, ServerRunningDomainEnum domainEnum) {
        this.reserNo = reserNo;
        this.serverRuningDomainEnum = domainEnum;
    }

    public Integer getReserNo() {
        return reserNo;
    }

    public void setReserNo(Integer reserNo) {
        this.reserNo = reserNo;
    }

    public ServerRunningDomainEnum getServerRuningDomainEnum() {
        return serverRuningDomainEnum;
    }

    public void setServerRuningDomainEnum(ServerRunningDomainEnum serverRuningDomainEnum) {
        this.serverRuningDomainEnum = serverRuningDomainEnum;
    }
}
