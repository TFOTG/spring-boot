package com.elong.hotel.hotelconfirm.confirmorder.response;

import com.elong.hotel.common.response.ServiceResponseBase;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */

/**
 * 批量执行command response
 *
 */
public class InvokeCommandArrayResponse extends ServiceResponseBase {

	// 批量执行的结果status
	private long status;
	// 批量执行的结果描述
	private List<String> results;
	

	public InvokeCommandArrayResponse() {
		status = 0;
		this.results = new ArrayList<>();
	}

	public List<String> getResults() {
		return results;
	}

	public void setResults(List<String> results) {
		this.results = results;
	}

	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}

}
