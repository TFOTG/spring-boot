package com.elong.hotel.hotelconfirm.ivr.bo;

import com.elong.hotel.common.enums.OrderAdditionalStatusEnum;
import com.elong.hotel.proxy.javaorder.getorder.Guest;
import com.elong.hotel.proxy.javaorder.getorder.Order;
import com.elong.hotel.proxy.javaorder.getorder.RoomNight;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Hualong.Li on 17/6/13.
 */
public class ConfirmIvrMenu implements Serializable {
	private Integer orderId;

	private List<Guest> guest;

	private Date checkInDate;

	private Date checkOutDate;

	private String roomTypeName;

	private int roomCount;

	// 最早到店日期

	private Date earlyCheckInTime;
	// 最晚到店日期

	private Date lateCheckInTime;

	private List<RoomNight> roomNights;

	private String notesToHotel;

	private String orderType;

	private Boolean isH;

	public ConfirmIvrMenu(Integer orderId, List<Guest> guest, Date checkInDate, Date checkOutDate, String roomTypeName, int roomCount,
			Date earlyCheckInTime, Date lateCheckInTime, List<RoomNight> roomNights, String notesToHotel, String orderType, Boolean isH) {
		this.orderId = orderId;
		this.guest = guest;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.roomTypeName = roomTypeName;
		this.roomCount = roomCount;
		this.earlyCheckInTime = earlyCheckInTime;
		this.lateCheckInTime = lateCheckInTime;
		this.roomNights = roomNights;
		this.notesToHotel = notesToHotel;
		this.orderType = orderType;
		this.isH = isH;
	}

	public ConfirmIvrMenu(Order order, Boolean isH) {
		this.orderId = order.getOrderId().intValue();
		this.guest = order.getGuests();
		this.checkInDate = order.getCheckInDate();
		this.checkOutDate = order.getCheckOutDate();
		this.roomTypeName = order.getRoomTypeName();
		this.roomCount = order.getRoomCount();
		this.earlyCheckInTime = order.getEarlyCheckInTime();
		this.lateCheckInTime = order.getLateCheckInTime();
		this.roomNights = order.getRoomNights();
		this.notesToHotel = order.getNotesToHotel();

		String orderType = "";
		if("D".equalsIgnoreCase(order.getPayment())) {
			orderType = "预付订单";
		}else if((order.getAdditionalStatus() & OrderAdditionalStatusEnum.VOUCH.getValue())  == 0 && "P".equalsIgnoreCase(order.getPayment())) {
			orderType = "现付订单";
		}else {
			orderType = "担保订单";
		}
		this.orderType = orderType;
		this.isH = isH;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public List<Guest> getGuest() {
		return guest;
	}

	public void setGuest(List<Guest> guest) {
		this.guest = guest;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public String getRoomTypeName() {
		return roomTypeName;
	}

	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}

	public int getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}

	public Date getEarlyCheckInTime() {
		return earlyCheckInTime;
	}

	public void setEarlyCheckInTime(Date earlyCheckInTime) {
		this.earlyCheckInTime = earlyCheckInTime;
	}

	public Date getLateCheckInTime() {
		return lateCheckInTime;
	}

	public void setLateCheckInTime(Date lateCheckInTime) {
		this.lateCheckInTime = lateCheckInTime;
	}

	public List<RoomNight> getRoomNights() {
		return roomNights;
	}

	public void setRoomNights(List<RoomNight> roomNights) {
		this.roomNights = roomNights;
	}

	public String getNotesToHotel() {
		return notesToHotel;
	}

	public void setNotesToHotel(String notesToHotel) {
		this.notesToHotel = notesToHotel;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Boolean isH() {
		return isH;
	}

	public void setIsH(Boolean isH) {
		this.isH = isH;
	}
}
