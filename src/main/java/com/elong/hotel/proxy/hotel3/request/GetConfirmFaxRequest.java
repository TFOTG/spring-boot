package com.elong.hotel.proxy.hotel3.request;

import java.util.List;

/**
 * Created by user on 17/6/23.
 */
public class GetConfirmFaxRequest {
    private List<String> orderIds;

    public void setOrderIds(List<String> orderIds){
        this.orderIds=orderIds;
    }
    public List<String> getOrderIds(){
        return this.orderIds;
    }
}
