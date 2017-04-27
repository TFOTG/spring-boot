package com.elong.hotel.storage.bo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Hualong.Li on 17/4/24.
 */
public class OperatorInfoBo implements Serializable {
	private static final long serialVersionUID = -500733771286000939L;
	private String operatorName;

	private String operatorIP;

	private Date operatorTime;

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getOperatorIP() {
		return operatorIP;
	}

	public void setOperatorIP(String operatorIP) {
		this.operatorIP = operatorIP;
	}

	public Date getOperatorTime() {
		return operatorTime;
	}

	public void setOperatorTime(Date operatorTime) {
		this.operatorTime = operatorTime;
	}
}
