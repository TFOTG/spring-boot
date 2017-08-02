/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.proxy.product.request.FindDynamicHotelInfoForOrderRequest.java]
 * Createion [2017年8月1日]
 */
package com.elong.hotel.proxy.product.request;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class FindDynamicHotelInfoForOrderRequest {

	private String mhotelId;
	
	private String shotelId;
	
	private Integer ratePlanId;
	
	private String roomTypeId;
	
	private String checkInDate;
	
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
