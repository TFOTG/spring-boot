package com.elong.hotel.proxy.product.response;

import java.io.Serializable;

public class ServiceResponseProductBase implements Serializable {
	private static final long serialVersionUID = -1758530142357560890L;

	private String logId;

	private String exceptionMsg;

	private Integer responseCode;

	private String serverName;

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getExceptionMsg() {
		return exceptionMsg;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}

	public Integer getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
}