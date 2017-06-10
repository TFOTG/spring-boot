package com.elong.hotel.proxy.javaorder.request;

import java.util.Date;

/**
 * 操作人信息
 * 
 * @author zouyufei
 *
 */
public class OperatorInfo {

	// 操作ip
	private String operatorIP;
	// 操作人姓名
	private String operatorName;
	// 操作时间
	private Date operatorTime;

	public String getOperatorIP() {
		return operatorIP;
	}

	public void setOperatorIP(String operatorIP) {
		this.operatorIP = operatorIP;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public Date getOperatorTime() {
		return operatorTime;
	}

	public void setOperatorTime(Date operatorTime) {
		this.operatorTime = operatorTime;
	}

}
