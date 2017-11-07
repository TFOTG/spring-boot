/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.proxy.product.request.FindDynamicHotelInfoForOrderRequest.java]
 * Createion [2017年8月1日]
 */
package com.elong.hotel.proxy.product.request;

import javax.validation.constraints.NotNull;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class FindDynamicHotelInfoForOrderRequest {
	
	@NotNull(message="m酒店id不能为空")
	private String mhotelId;
	@NotNull(message="s酒店id不能为空")
	private String shotelId;
	
	private Integer ratePlanId;
	@NotNull(message="房型id不能为空")
	private String roomTypeId;
	@NotNull(message="入店日期不能为空")
	private String checkInDate;
	@NotNull(message="离店日期不能为空")
	private String checkOutDate;

	public String getMhotelId() {
		return mhotelId;
	}

	public void setMhotelId(String mhotelId) {
		this.mhotelId = mhotelId;
	}

	public String getShotelId() {
		return shotelId;
	}

	public void setShotelId(String shotelId) {
		this.shotelId = shotelId;
	}

	public Integer getRatePlanId() {
		return ratePlanId;
	}

	public void setRatePlanId(Integer ratePlanId) {
		this.ratePlanId = ratePlanId;
	}

	public String getRoomTypeId() {
		return roomTypeId;
	}

	public void setRoomTypeId(String roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	public String getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	
}
