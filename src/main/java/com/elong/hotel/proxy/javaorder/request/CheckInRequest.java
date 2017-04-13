package com.elong.hotel.proxy.javaorder.request;

import java.util.Date;

/**
 * 
 * @author zouyufei
 *
 */
public class CheckInRequest extends ChangeOrderStatusRequestBase {

	public CheckInRequest(int orderId, String operatorName, String operatorIp, Date opDate) {
		super(orderId, operatorName, operatorIp, opDate);
	}

}
