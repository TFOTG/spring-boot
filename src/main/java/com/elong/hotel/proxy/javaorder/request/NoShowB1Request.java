package com.elong.hotel.proxy.javaorder.request;

import java.util.Date;

/**
 * 
 * @author zouyufei
 *
 */
public class NoShowB1Request extends ChangeOrderStatusRequestBase {

	public NoShowB1Request(int orderId, String operatorName, String operatorIp, Date opDate) {
		super(orderId, operatorName, operatorIp, opDate);
	}

}
