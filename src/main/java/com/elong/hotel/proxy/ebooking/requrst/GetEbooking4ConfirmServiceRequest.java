package com.elong.hotel.proxy.ebooking.requrst;

import java.util.List;

/**
 * Created by yangboyu on 17/4/16.
 */
public class GetEbooking4ConfirmServiceRequest {
    private List<DelayOrder> delayOrderList;

    public List<DelayOrder> getDelayOrderList() {
        return delayOrderList;
    }

    public void setDelayOrderList(List<DelayOrder> delayOrderList) {
        this.delayOrderList = delayOrderList;
    }
}
