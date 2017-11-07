package com.elong.hotel.proxy.product.bo;

import java.util.List;

public class ShotelInfo {
	private String hotelId;

	private String hotelName;

	private String provinceId;

	private String cityId;

	private int audit;

	private Integer auditingtype;

	private String fax;

	private String frontDeskPhone;

	private String contactPhone;

	private String hotelAuditPhone1;

	private String hotelAuditPhone2;

	private Integer groupId;

	private List<HotelContact> hotelContactList;

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public int getAudit() {
		return audit;
	}

	public void setAudit(int audit) {
		this.audit = audit;
	}

	public Integer getAuditingtype() {
		return auditingtype;
	}

	public void setAuditingtype(Integer auditingtype) {
		this.auditingtype = auditingtype;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFrontDeskPhone() {
		return frontDeskPhone;
	}

	public void setFrontDeskPhone(String frontDeskPhone) {
		this.frontDeskPhone = frontDeskPhone;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getHotelAuditPhone1() {
		return hotelAuditPhone1;
	}

	public void setHotelAuditPhone1(String hotelAuditPhone1) {
		this.hotelAuditPhone1 = hotelAuditPhone1;
	}

	public String getHotelAuditPhone2() {
		return hotelAuditPhone2;
	}

	public void setHotelAuditPhone2(String hotelAuditPhone2) {
		this.hotelAuditPhone2 = hotelAuditPhone2;
	}

	public void setAuditPhone(ShotelPhone phone) {
		if(phone != null) {
			this.hotelAuditPhone1 = phone.getHotelAuditPhone1();
			this.hotelAuditPhone2 = phone.getHotelAuditPhone2();
		}
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public List<HotelContact> getHotelContactList() {
		return hotelContactList;
	}

	public void setHotelContactList(List<HotelContact> hotelContactList) {
		this.hotelContactList = hotelContactList;
	}
}