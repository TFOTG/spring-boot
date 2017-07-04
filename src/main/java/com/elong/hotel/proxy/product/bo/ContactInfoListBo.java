/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.proxy.product.bo.ContactInfoListBo.java]
 * Createion [2017年6月30日]
 */
package com.elong.hotel.proxy.product.bo;

import java.util.List;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class ContactInfoListBo {
	
	private List<HotelContact> hotelContactList;

	private String hotelContacter;
	
	private String hotelId;
	
	private boolean hotelIsVaild;
	
	private String hotelPhone;

	public List<HotelContact> getHotelContactList() {
		return hotelContactList;
	}

	public void setHotelContactList(List<HotelContact> hotelContactList) {
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
	
	
}
