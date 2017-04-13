package com.elong.hotel.proxy.javaorder.request;

import java.util.Date;

/**
 * 
 * @author zouyufei
 *
 */
public class NewOrderCheckInRequest extends ChangeOrderStatusRequestBase {

	//// 是否变到已结账，若为true，先从N到F，再F到C，若为false，只从N到F。
	private boolean hasCheckedOut;

	public NewOrderCheckInRequest(int orderId, String opName, String opIp, Date opDate, boolean hasCheckedOut) {
		super(orderId, opName, opIp, opDate);
		this.hasCheckedOut = hasCheckedOut;
	}

	public boolean isHasCheckedOut() {
		return hasCheckedOut;
	}

	public void setHasCheckedOut(boolean hasCheckedOut) {
		this.hasCheckedOut = hasCheckedOut;
	}
}
