package com.elong.hotel.hotelconfirm.confirmorder.context;

import com.elong.hotel.hotelconfirm.confirmorder.enums.ServerRunningDomainEnum;

import java.io.Serializable;
import java.util.Map;

public class ConfirmOrderDomainContext implements Serializable {

    private Integer reserNo;

    private ServerRunningDomainEnum serverRunningDomainEnum;

    private Map<String,Object> params;

    public ConfirmOrderDomainContext(Integer reserNo, ServerRunningDomainEnum domainEnum) {
        this.reserNo = reserNo;
        this.serverRunningDomainEnum = domainEnum;
    }

    public ConfirmOrderDomainContext(Integer reserNo, ServerRunningDomainEnum domainEnum,Map<String,Object> params) {
        this.reserNo = reserNo;
        this.serverRunningDomainEnum = domainEnum;
        this.params = params;
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

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}
