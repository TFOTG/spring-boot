package com.elong.hotel.proxy.javaorder.getorder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Hualong.Li on 16/12/20.
 */
public class RepeatOrderInfo implements Serializable {
	private static final long serialVersionUID = -3660610286430553296L;

	private Integer orderID;
	private List<String> guestNameList;//入住人姓名list

	public Integer getOrderID() {
		return orderID;
	}

	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}

	public List<String> getGuestNameList() {
		return guestNameList;
	}

	public void setGuestNameList(List<String> guestNameList) {
		this.guestNameList = guestNameList;
	}
}
