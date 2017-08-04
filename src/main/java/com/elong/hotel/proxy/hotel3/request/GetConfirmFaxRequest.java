package com.elong.hotel.proxy.hotel3.request;

import com.elong.hotel.common.annotaitions.CollectionNotBlank;

import java.util.List;

/**
 * Created by user on 17/6/23.
 */
public class GetConfirmFaxRequest {
	
	@CollectionNotBlank(message="订单id不能为空")
    private List<Integer> orderIds;

    public void setOrderIds(List<Integer> orderIds){
        this.orderIds=orderIds;
    }
    public List<Integer> getOrderIds(){
        return this.orderIds;
    }
}
