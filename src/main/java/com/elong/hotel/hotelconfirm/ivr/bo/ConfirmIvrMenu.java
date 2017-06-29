package com.elong.hotel.hotelconfirm.ivr.bo;

import com.elong.hotel.common.enums.OrderAdditionalStatusEnum;
import com.elong.hotel.proxy.javaorder.getorder.Guest;
import com.elong.hotel.proxy.javaorder.getorder.Order;
import com.elong.hotel.proxy.javaorder.getorder.RoomNight;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

	private List<String> nights;

	private String notesToHotel;

	private String orderType;

	private boolean hStatus;

	public ConfirmIvrMenu(Integer orderId, List<Guest> guest, Date checkInDate, Date checkOutDate, String roomTypeName, int roomCount,
			Date earlyCheckInTime, Date lateCheckInTime, List<RoomNight> roomNights, String notesToHotel, String orderType, Boolean hStatus) {
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
		this.hStatus = hStatus;
	}

	public ConfirmIvrMenu(Order order, Boolean hStatus) {
		this.orderId = order.getOrderId().intValue();
		this.guest = order.getGuests();
		this.checkInDate = order.getCheckInDate();
		this.checkOutDate = order.getCheckOutDate();
		this.roomTypeName = order.getMRoomTypeName();
		this.roomCount = order.getRoomCount();
		this.earlyCheckInTime = order.getEarlyCheckInTime();
		this.lateCheckInTime = order.getLateCheckInTime();
		this.roomNights = order.getRoomNights();
		List<String> nights = new ArrayList<>();

		DateFormat df = new SimpleDateFormat("M月d日");
		DateFormat df1 = new SimpleDateFormat("yyyy年M月d日");

		if(order.getRoomNights().size() == 1) {
			RoomNight roomNight = order.getRoomNights().get(0);
			nights.add(getRoomNight(roomNight,df));
		}else{
			if(order.getRoomNights().get(0).getStayDate().getYear() != order.getRoomNights().get(order.getRoomNights().size()-1).getStayDate().getYear()) {
				df = new SimpleDateFormat("yyyy年M月d日");
			}

			//标记是否有相同的早餐及价格 1有 0没有
			int status = 0;
			StringBuilder sb = new StringBuilder();
			for(int i = 0;i<order.getRoomNights().size();i++) {
				RoomNight roomNight= order.getRoomNights().get(i);
				if(i < order.getRoomNights().size()-1) {
					RoomNight roomNightNext= order.getRoomNights().get(i+1);
					if(status == 0 && roomNight.getBreakfastCount().intValue() == roomNightNext.getBreakfastCount().intValue() && roomNight.getSalePrice().floatValue() == roomNightNext.getSalePrice().floatValue()) {
						sb.append(df.format(roomNight.getStayDate()));
						status = 1;
						continue;
					}else if(status == 1 && roomNight.getBreakfastCount().intValue() == roomNightNext.getBreakfastCount().intValue() && roomNight.getSalePrice().floatValue() == roomNightNext.getSalePrice().floatValue()) {
						continue;
					}else if(status == 1) {
						sb.append("至").append(getRoomNight(roomNight,df));
						nights.add(sb.toString());
						sb.delete(0, sb.length());
						status = 0;
					}else {
						nights.add(getRoomNight(roomNight,df));
					}
				}else {
					if(status == 1) {
						sb.append("至").append(getRoomNight(roomNight,df));
						nights.add(sb.toString());
						sb.delete(0, sb.length());
						status = 0;
					}else {
						nights.add(getRoomNight(roomNight,df));
					}
				}
			}
		}

		this.nights = nights;


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
		this.hStatus = hStatus;
	}

	private String getRoomNight(RoomNight roomNight,DateFormat dateFormat) {
		StringBuilder sb = new StringBuilder(dateFormat.format(roomNight.getStayDate())).append(roomNight.getSalePrice().intValue()).append("元，");
		switch (roomNight.getBreakfastCount()) {
		case 0:
			sb.append("不含早");
			break;
		case 1:
			sb.append("含单早");
			break;
		case 2:
			sb.append("含双早");
			break;
		default:
			sb.append("含").append(roomNight.getBreakfastCount()).append("早");
			break;
		}
		return sb.toString();
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

	public boolean ishStatus() {
		return hStatus;
	}

	public void sethStatus(boolean hStatus) {
		this.hStatus = hStatus;
	}

	public List<String> getNights() {
		return nights;
	}

	public void setNights(List<String> nights) {
		this.nights = nights;
	}
}
