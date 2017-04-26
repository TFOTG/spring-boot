package com.elong.hotel.proxy.javaorder.request;

import java.io.Serializable;

/**
 * 获取原始订单request
 * 
 * @author hualong.li
 *
 */
public class GetOrderHistoryRequest implements Serializable  {

	private static final long serialVersionUID = 8251288774722684444L;

	// 订单id
	private Integer orderID;

	public Integer getOrderID() {
		return orderID;
	}

	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}

    public GetOrderHistoryRequest(Integer orderID) {
        this.orderID = orderID;
    }

    public GetOrderHistoryRequest() {
    }
}