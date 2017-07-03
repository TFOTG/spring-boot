package com.elong.hotel.proxy.product.request;

import java.util.Date;
import java.util.Map;

/**
 * Created by Hualong.Li on 17/6/29.
 */
public class BatchGetHotelContactRequest {

	private String signature;

	private Map<String,Object> body;

	private Date timestamp;

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public Map<String, Object> getBody() {
		return body;
	}

	public void setBody(Map<String, Object> body) {
		this.body = body;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
