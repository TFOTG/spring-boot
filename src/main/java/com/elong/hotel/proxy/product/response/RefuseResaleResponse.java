/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.proxy.product.response.RefuseResaleResponse.java]
 * Createion [2017年9月6日]
 */
package com.elong.hotel.proxy.product.response;

import com.elong.hotel.proxy.hotel3.response.Hotel3RoomInfoResult;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class RefuseResaleResponse {

	private Hotel3RoomInfoResult Result;
	
	private boolean Issuccess;

	public Hotel3RoomInfoResult getResult() {
		return Result;
	}

	public void setResult(Hotel3RoomInfoResult result) {
		Result = result;
	}

	public boolean isIssuccess() {
		return Issuccess;
	}

	public void setIssuccess(boolean issuccess) {
		Issuccess = issuccess;
	}
}
