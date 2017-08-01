package com.elong.hotel.hotelconfirm.confirmorder.request;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.proxy.javaorder.request.OperatorInfo;

import java.io.Serializable;

/**
 * Created by Hualong.Li on 17/7/20.
 */
public class SendMsgVisualzationRequest implements Serializable {

	private String note2Action;

	private OperatorInfo clientOperatorInfo;

	private Integer orderId;

	public String getNote2Action() {
		return note2Action;
	}

	public void setNote2Action(String note2Action) {
		this.note2Action = note2Action;
	}

	public OperatorInfo getClientOperatorInfo() {
		return clientOperatorInfo;
	}

	public void setClientOperatorInfo(OperatorInfoBo clientOperatorInfo) {
		this.clientOperatorInfo = new OperatorInfo(clientOperatorInfo);
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
}