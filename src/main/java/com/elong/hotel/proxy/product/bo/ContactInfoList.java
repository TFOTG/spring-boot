package com.elong.hotel.proxy.product.bo;

import java.util.List;
public class ContactInfoList {
private List<HotelContactList> hotelContactList ;

private String hotelContacter;

private String hotelId;

private boolean hotelIsVaild;

private String hotelPhone;

private String hotelLobbyTel;

private Integer ratePlanId;

private String roomTypeId;

private String roomContact;
	public List<HotelContactList> getHotelContactList() {
		return hotelContactList;
	}

	public void setHotelContactList(List<HotelContactList> hotelContactList) {
		this.hotelContactList = hotelContactList;
	}

	public String getHotelContacter() {
		return hotelContacter;
	}

	public void setHotelContacter(String hotelContacter) {
		this.hotelContacter = hotelContacter;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public boolean isHotelIsVaild() {
		return hotelIsVaild;
	}

	public void setHotelIsVaild(boolean hotelIsVaild) {
		this.hotelIsVaild = hotelIsVaild;
	}

	public String getHotelPhone() {
		return hotelPhone;
	}

	public void setHotelPhone(String hotelPhone) {
		this.hotelPhone = hotelPhone;
	}

	public String getHotelLobbyTel() {
		return hotelLobbyTel;
	}

	public void setHotelLobbyTel(String hotelLobbyTel) {
		this.hotelLobbyTel = hotelLobbyTel;
	}

	public String getRoomContact() {
		return roomContact;
	}

	public void setRoomContact(String roomContact) {
		this.roomContact = roomContact;
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
	
}