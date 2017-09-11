/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.proxy.product.response.GetResaleOrderInfoResponse.java]
 * Createion [2017年9月6日]
 */
package com.elong.hotel.proxy.product.response;

import java.util.List;

import com.elong.hotel.proxy.hotel3.response.Hotel3RoomInfoResult;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class GetResaleOrderInfoResponse {

	private Hotel3RoomInfoResult Result;
	
	private List<ResaleInfoModel> resaleInfoModelList;

	public Hotel3RoomInfoResult getResult() {
		return Result;
	}

	public void setResult(Hotel3RoomInfoResult result) {
		Result = result;
	}

	public List<ResaleInfoModel> getResaleInfoModelList() {
		return resaleInfoModelList;
	}

	public void setResaleInfoModelList(List<ResaleInfoModel> resaleInfoModelList) {
		this.resaleInfoModelList = resaleInfoModelList;
	}
	
	
}
