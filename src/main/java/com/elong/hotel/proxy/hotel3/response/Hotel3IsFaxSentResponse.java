package com.elong.hotel.proxy.hotel3.response;

import java.util.List;
import java.util.Map;

/**
 * Created by user on 17/8/23.
 */
public class Hotel3IsFaxSentResponse extends Hotel3ResponseBase{

    private List<String> orderIds;

    public List<String> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<String> orderIds) {
        this.orderIds = orderIds;
    }
}
