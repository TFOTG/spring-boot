/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.proxy.hotel3.response.Hotel3RoomInfoResponse.java]
 * Createion [2017年8月15日]
 */
package com.elong.hotel.proxy.hotel3.response;

import com.elong.hotel.common.response.ServiceResponseBase;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class Hotel3RoomInfoResponse extends ServiceResponseBase{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String AreaDes;
	
    private String FloorDes;
    
    private String MRoomTypeName;
    
    private String RoomDes;
    
    private String RoomNoteCN;
    
    private String RoomNoteEN;
    
    private Hotel3RoomInfoResult Result;
    
	public String getAreaDes() {
		return AreaDes;
	}
	public void setAreaDes(String areaDes) {
		AreaDes = areaDes;
	}
	public String getFloorDes() {
		return FloorDes;
	}
	public void setFloorDes(String floorDes) {
		FloorDes = floorDes;
	}
	public String getMRoomTypeName() {
		return MRoomTypeName;
	}
	public void setMRoomTypeName(String mRoomTypeName) {
		MRoomTypeName = mRoomTypeName;
	}
	public String getRoomDes() {
		return RoomDes;
	}
	public void setRoomDes(String roomDes) {
		RoomDes = roomDes;
	}
	public String getRoomNoteCN() {
		return RoomNoteCN;
	}
	public void setRoomNoteCN(String roomNoteCN) {
		RoomNoteCN = roomNoteCN;
	}
	public String getRoomNoteEN() {
		return RoomNoteEN;
	}
	public void setRoomNoteEN(String roomNoteEN) {
		RoomNoteEN = roomNoteEN;
	}
	public Hotel3RoomInfoResult getResult() {
		return Result;
	}
	public void setResult(Hotel3RoomInfoResult result) {
		Result = result;
	}
}
