package com.elong.hotel.proxy.product.request;

import java.io.Serializable;
import java.util.Map;

public class GethotelBaseRequest implements Serializable {

	private static final long serialVersionUID = 699131546204192753L;
	private String from;

	private String logId;

	private Map<String, Object> body;

    private Map<String, Object> realRequest;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public Map<String, Object> getRealRequest() {
		return realRequest;
	}

	public void setRealRequest(Map<String, Object> realRequest) {
		this.realRequest = realRequest;
	}

    public Map<String, Object> getBody() {
        return body;
    }

    public void setBody(Map<String, Object> body) {
        this.body = body;
    }
}