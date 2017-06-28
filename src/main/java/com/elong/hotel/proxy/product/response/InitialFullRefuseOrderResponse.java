package com.elong.hotel.proxy.product.response;


import java.io.Serializable;

public class InitialFullRefuseOrderResponse implements Serializable {

    String exceptionMsg ;

//    RealResponse RealResponseM { get; set; }

    String serverName ;

    int responseCode ;

    private ServiceResponseProductRealBase realResponse;

    public ServiceResponseProductRealBase getRealResponse() {
        return realResponse;
    }

    public void setRealResponse(ServiceResponseProductRealBase realResponse) {
        this.realResponse = realResponse;
    }

    public String getExceptionMsg() {
        return exceptionMsg;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }
}