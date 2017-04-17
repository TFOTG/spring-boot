package com.elong.hotel.proxy.ebooking.response;

import java.util.List;

/**
 * Created by yangboyu on 17/4/16.
 */
public class GetEbooking4ConfirmServiceResponse {
    private List<DelayOrderResult> delayOrderResultList;

    public List<DelayOrderResult> getDelayOrderResultList() {
        return delayOrderResultList;
    }

    public void setDelayOrderResultList(List<DelayOrderResult> delayOrderResultList) {
        this.delayOrderResultList = delayOrderResultList;
    }
}
