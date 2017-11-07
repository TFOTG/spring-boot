package com.elong.hotel.proxy.ebooking.response;

import java.util.List;

import com.elong.hotel.common.response.ServiceResponseBase;

/**
 * Created by yangboyu on 17/4/16.
 */
public class GetEbooking4ConfirmServiceResponse extends ServiceResponseBase{
    /**
	 * 
	 */
	private static final long serialVersionUID = 8609984701863921414L;
	private List<DelayOrderResult> delayOrderResultList;

    public List<DelayOrderResult> getDelayOrderResultList() {
        return delayOrderResultList;
    }

    public void setDelayOrderResultList(List<DelayOrderResult> delayOrderResultList) {
        this.delayOrderResultList = delayOrderResultList;
    }
}
