package com.elong.hotel.proxy.javaorder.visualizationentity;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by Hualong.Li on 17/7/20.
 */
public class SendMsgVisualzation {
	@JSONField(name = "Reason")
	private String reason;

	public SendMsgVisualzation() {
	}

	public SendMsgVisualzation(String reason) {
		this.reason = reason;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
}
