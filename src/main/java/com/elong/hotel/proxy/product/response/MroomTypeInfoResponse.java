/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.proxy.product.response.LroomTypeInfoList.java]
 * Createion [2017年8月3日]
 */
package com.elong.hotel.proxy.product.response;

import java.util.List;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class MroomTypeInfoResponse {


	private String area;
	
	private String floor;
	
	private String mhotelId;
	
	private String otherNotes;
	
	private String roomTypeId;
	
	private List<RoomAdditionDefineListResponse> roomAdditionDefineList;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getMhotelId() {
		return mhotelId;
	}

	public void setMhotelId(String mhotelId) {
		this.mhotelId = mhotelId;
	}

	public String getOtherNotes() {
		return otherNotes;
	}

	public void setOtherNotes(String otherNotes) {
		this.otherNotes = otherNotes;
	}

	public String getRoomTypeId() {
		return roomTypeId;
	}

	public void setRoomTypeId(String roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	public List<RoomAdditionDefineListResponse> getRoomAdditionDefineList() {
		return roomAdditionDefineList;
	}

	public void setRoomAdditionDefineList(
			List<RoomAdditionDefineListResponse> roomAdditionDefineList) {
		this.roomAdditionDefineList = roomAdditionDefineList;
	}
}
