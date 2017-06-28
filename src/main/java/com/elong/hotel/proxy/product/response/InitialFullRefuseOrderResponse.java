package com.elong.hotel.proxy.product.response;


import java.io.Serializable;

public class InitialFullRefuseOrderResponse extends ServiceResponseProductRealBase implements Serializable {

    private ServiceResponseProductRealBase realResponse;

    public ServiceResponseProductRealBase getRealResponse() {
        return realResponse;
    }

    public void setRealResponse(ServiceResponseProductRealBase realResponse) {
        this.realResponse = realResponse;
    }
}