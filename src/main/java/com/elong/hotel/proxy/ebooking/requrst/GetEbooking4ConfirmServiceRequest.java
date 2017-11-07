package com.elong.hotel.proxy.ebooking.requrst;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yangboyu on 17/4/16.
 */
public class GetEbooking4ConfirmServiceRequest implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 3910357018350409867L;
	private List<DelayOrder> delayOrderList;

    public List<DelayOrder> getDelayOrderList() {
        return delayOrderList;
    }

    public void setDelayOrderList(List<DelayOrder> delayOrderList) {
        this.delayOrderList = delayOrderList;
    }
}
