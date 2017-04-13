package com.elong.hotel.proxy.javaorder.request;

import java.io.Serializable;

/**
 * Created by Hualong.Li on 16/12/20.
 */
public class GetRelationOrderRequest implements Serializable {

	private static final long serialVersionUID = 2147250111408706753L;

	private long orderId;

	private boolean findParentOrder;

	private Integer sourceOrderType;

	public GetRelationOrderRequest(long orderId, boolean findParentOrder) {
		this.orderId = orderId;
		this.findParentOrder = findParentOrder;
		this.sourceOrderType = 3; // 此字段包含1,3;其中3为拆单,1为延住单.
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public boolean isFindParentOrder() {
		return findParentOrder;
	}

	public void setFindParentOrder(boolean findParentOrder) {
		this.findParentOrder = findParentOrder;
	}

	public Integer getSourceOrderType() {
		return sourceOrderType;
	}

	public void setSourceOrderType(Integer sourceOrderType) {
		this.sourceOrderType = sourceOrderType;
	}
}
