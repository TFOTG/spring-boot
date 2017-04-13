package com.elong.hotel.proxy.javaorder.response;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Hualong.Li on 16/12/20.
 */
public class GetRelationOrderResponse extends ServiceResponseBase implements Serializable {
	private static final long serialVersionUID = -8971917796759755879L;

	private List<Integer> body;

	public List<Integer> getBody() {
		return body;
	}

	public void setBody(List<Integer> body) {
		this.body = body;
	}
}
