package com.elong.hotel.proxy.javaorder.request;

import java.util.Date;

/**
 * 
 * @author zouyufei
 *
 */
public class ChangeOrderStatusRequestBase {
	// 订单号
	private int orderId;
	// 业务线id 0-mis
	private int businessSystemId;
	// 操作人信息
	private OperatorInfo operatorInfo;

	public ChangeOrderStatusRequestBase(int orderId, String operatorName, String operatorIp, Date opDate) {
		this.orderId = orderId;
		this.operatorInfo = new OperatorInfo();
		this.operatorInfo.setOperatorIP(operatorIp);
		this.operatorInfo.setOperatorName(operatorName);
		// this.operatorInfo.setOperatorTime(opDate); //修改订单状态，不需要传递修改时间，接口内部自己创建时间对象
		this.businessSystemId = 0;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getBusinessSystemId() {
		return businessSystemId;
	}

	public void setBusinessSystemId(int businessSystemId) {
		this.businessSystemId = businessSystemId;
	}

	public OperatorInfo getOperatorInfo() {
		return operatorInfo;
	}

	public void setOperatorInfo(OperatorInfo operatorInfo) {
		this.operatorInfo = operatorInfo;
	}
}
