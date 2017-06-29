package com.elong.hotel.proxy.product.request;

import java.io.Serializable;
import java.util.Map;

public class InitialFullRefuseOrderRequest implements Serializable {

	InitialFullRefuseOrderMessageDetail messageDetail;

	public InitialFullRefuseOrderMessageDetail getMessageDetail() {
		return messageDetail;
	}

	public void setMessageDetail(InitialFullRefuseOrderMessageDetail messageDetail) {
		this.messageDetail = messageDetail;
	}
}