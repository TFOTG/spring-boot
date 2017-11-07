package com.elong.hotel.storage.bo;

import com.elong.hotel.common.bo.OperatorInfoBo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Hualong.Li on 17/4/24.
 */
public class OrderConsumerInfoBo implements Serializable {
	private static final long versionUID = -123123123123l;

	private Long orderId;

	private String preStatus;

	private String status;

	private List<String> changeEvent;

	private Date orderTimestamp;

	private String payment;

	private Date checkInDate;

	private Date checkOutDate;

	private Integer roomCount;

	private String sHotelId;

	private String additionalStatus;

	private String addtionalStatusI;

	//	private int otaType;
	//
	//	private int orderFlag;

	private OperatorInfoBo operatorInfo;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getPreStatus() {
		return preStatus;
	}

	public void setPreStatus(String preStatus) {
		this.preStatus = preStatus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getChangeEvent() {
		return changeEvent;
	}

	public void setChangeEvent(List<String> changeEvent) {
		this.changeEvent = changeEvent;
	}

	public Date getOrderTimestamp() {
		return orderTimestamp;
	}

	public void setOrderTimestamp(Date orderTimestamp) {
		this.orderTimestamp = orderTimestamp;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
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

	public Integer getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(Integer roomCount) {
		this.roomCount = roomCount;
	}

	public String getsHotelId() {
		return sHotelId;
	}

	public void setsHotelId(String sHotelId) {
		this.sHotelId = sHotelId;
	}

	public String getAdditionalStatus() {
		return additionalStatus;
	}

	public void setAdditionalStatus(String additionalStatus) {
		this.additionalStatus = additionalStatus;
	}

	public String getAddtionalStatusI() {
		return addtionalStatusI;
	}

	public void setAddtionalStatusI(String addtionalStatusI) {
		this.addtionalStatusI = addtionalStatusI;
	}

	public OperatorInfoBo getOperatorInfo() {
		return operatorInfo;
	}

	public void setOperatorInfo(OperatorInfoBo operatorInfo) {
		this.operatorInfo = operatorInfo;
	}
}
