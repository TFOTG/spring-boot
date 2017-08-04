/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.proxy.product.response.MhotelProductInfoResponse.java]
 * Createion [2017年8月3日]
 */
package com.elong.hotel.proxy.product.response;

import java.util.List;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class MhotelProductInfoResponse {

	private List<MroomTypeInfoResponse> mroomTypeInfoList;

	public List<MroomTypeInfoResponse> getMroomTypeInfoList() {
		return mroomTypeInfoList;
	}

	public void setMroomTypeInfoList(List<MroomTypeInfoResponse> mroomTypeInfoList) {
		this.mroomTypeInfoList = mroomTypeInfoList;
	}
	
}
