package com.elong.hotel.proxy.javaorder.request;

import java.util.Date;

/**
 * Created by Hualong.Li on 17/2/16.
 */
public class DeleteDRequest extends ChangeOrderStatusRequestBase {
	/**
	 * 取消原因id
	 */
	private int changeReasonId;
	/**
	 * 取消原因
	 */
	private String changeReason;

	public DeleteDRequest(int orderId, String operatorName, String operatorIp, Date opDate,int changeReasonId,String changeReason) {
		super(orderId, operatorName, operatorIp, opDate);
		this.changeReasonId = changeReasonId;
		this.changeReason = changeReason;
	}

	public int getChangeReasonId() {
		return changeReasonId;
	}

	public void setChangeReasonId(int changeReasonId) {
		this.changeReasonId = changeReasonId;
	}

	public String getChangeReason() {
		return changeReason;
	}

	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}
}
