package com.elong.hotel.proxy.javaorder.request;

import com.elong.hotel.proxy.javaorder.getorder.Order;

import java.util.Date;

/**
 * Created by Hualong.Li on 17/6/28.
 */
public class ExistsRelationOrderRequest {

	private Long orderId;

	private Long cardNo;

	private String phone;

	private String guestName;

	private Date checkoutDate;

	private String hotelId;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getCardNo() {
		return cardNo;
	}

	public void setCardNo(Long cardNo) {
		this.cardNo = cardNo;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public Date getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public ExistsRelationOrderRequest(Order order) {
		this.orderId = order.getOrderId();
		this.cardNo = order.getCardNo();
		this.phone = order.getContact().getMobile();
		this.guestName = order.getGuests().get(0).getName();
		this.checkoutDate = order.getCheckOutDate();
		this.hotelId = order.getHotelId();
	}
}
