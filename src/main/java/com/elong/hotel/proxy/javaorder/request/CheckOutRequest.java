package com.elong.hotel.proxy.javaorder.request;

import java.util.Date;

/**
 * A->C / F->C
 * 
 * @author zouyufei
 *
 */
public class CheckOutRequest extends ChangeOrderStatusRequestBase {

	public CheckOutRequest(int orderId, String opName, String opIp, Date opDate) {
		super(orderId, opName, opIp, opDate);
	}

}
