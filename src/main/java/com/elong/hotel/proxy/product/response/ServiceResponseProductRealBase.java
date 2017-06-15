package com.elong.hotel.proxy.product.response;

import java.io.Serializable;

public class ServiceResponseProductRealBase implements Serializable {
	private static final long serialVersionUID = -1758530142357560890L;

	private String message;

	private Integer responseCode;

	public Integer getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}