package com.elong.hotel.proxy.javaorder.request;

import java.util.Date;

/**
 * Created by Hualong.Li on 17/2/16.
 */
public class NoShowB3Request extends ChangeOrderStatusRequestBase {



	public NoShowB3Request(int orderId, String operatorName, String operatorIp, Date opDate) {
		super(orderId, operatorName, operatorIp, opDate);
	}
}
