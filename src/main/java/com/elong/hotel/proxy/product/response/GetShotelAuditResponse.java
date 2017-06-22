package com.elong.hotel.proxy.product.response;

public class GetShotelAuditResponse extends ServiceResponseProductBase {
	private static final long serialVersionUID = -89274824460448947L;

	private GetShotelAuditRealResponse realResponse;

	public GetShotelAuditRealResponse getRealResponse() {
		return realResponse;
	}

	public void setRealResponse(GetShotelAuditRealResponse realResponse) {
		this.realResponse = realResponse;
	}
}