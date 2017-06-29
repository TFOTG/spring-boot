package com.elong.hotel.proxy.product.response;


import java.io.Serializable;

public class GetSRoomByShotelResponse extends ServiceResponseProductRealBase implements Serializable {

    private GetSRoomByShotelRealResponse realResponse;

    public GetSRoomByShotelRealResponse getRealResponse() {
        return realResponse;
    }

    public void setRealResponse(GetSRoomByShotelRealResponse realResponse) {
        this.realResponse = realResponse;
    }
}