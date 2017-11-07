package com.elong.hotel.hotelconfirm.confirmorder.request;

import com.elong.hotel.log.hotelconfirm.enums.ConfirmOpType;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Hualong.Li on 17/5/25.
 */
public class ConfirmOrderSyncRequest implements Serializable {

	private String staffName;

	private String operator;

	private ConfirmOpType opType;

	private List<Integer> orderIds;

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public ConfirmOpType getOpType() {
		return opType;
	}

	public void setOpType(ConfirmOpType opType) {
		this.opType = opType;
	}

	public List<Integer> getOrderIds() {
		return orderIds;
	}

	public void setOrderIds(List<Integer> orderIds) {
		this.orderIds = orderIds;
	}
}
