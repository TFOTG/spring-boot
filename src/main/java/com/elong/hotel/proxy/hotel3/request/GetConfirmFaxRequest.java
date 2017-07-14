package com.elong.hotel.proxy.hotel3.request;

import java.util.List;

import com.elong.hotel.common.annotaitions.CollectionNotBlank;

/**
 * Created by user on 17/6/23.
 */
public class GetConfirmFaxRequest {
	
	@CollectionNotBlank(message="订单id不能为空")
    private List<String> orderIds;

    public void setOrderIds(List<String> orderIds){
        this.orderIds=orderIds;
    }
    public List<String> getOrderIds(){
        return this.orderIds;
    }
}
