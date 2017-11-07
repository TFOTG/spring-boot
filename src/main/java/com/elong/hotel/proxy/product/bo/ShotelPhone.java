package com.elong.hotel.proxy.product.bo;

import java.io.Serializable;

public class ShotelPhone implements Serializable {

	private static final long serialVersionUID = 8911815030746508010L;

	private String hotelId;

	private String hotelAuditPhone1;

	private String hotelAuditPhone2;

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
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
}