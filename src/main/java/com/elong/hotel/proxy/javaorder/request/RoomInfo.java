package com.elong.hotel.proxy.javaorder.request;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 房间信息 使用原单信息填充
 * 
 * @author zouyufei
 *
 */
public class RoomInfo implements Serializable {

	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = 4531469158124284459L;

	public RoomInfo() {

	}

	public RoomInfo(Date beginDate, Date endDate, String roomId, String roomStatus, String roomNum, String confirmNum, List<String> customerNames, List<Long> customerIds) {
		this.beginDate = (beginDate);
		this.roomId = (roomId);
		this.endDate = (endDate);
		this.roomStatus = (roomStatus);
		this.confirmNum = (confirmNum);
		this.roomNum = (roomNum);
		this.customerNames = (customerNames);
		this.customerIds = customerIds;
	}
	
	public RoomInfo(Date beginDate, Date endDate, String roomId, String roomStatus, String roomNum, String confirmNum, List<String> customerNames) {
		this.beginDate = (beginDate);
		this.endDate = (endDate);
		this.roomId = (roomId);
		this.confirmNum = (confirmNum);
		this.roomStatus = (roomStatus);
		this.roomNum = (roomNum);
		this.customerNames = (customerNames);
	}

	private Date beginDate;

	private Date endDate;

	private String roomId;

	private String roomStatus;

	private String roomNum;

	private String confirmNum;

	// 房间的客人姓名
	private List<String> customerNames;
	// 房间的客人id，与客人姓名集合顺序一一对应
	private List<Long> customerIds;

	public String getRoomNum() {
		return roomNum;
	}

	public String getConfirmNum() {
		return confirmNum;
	}

	public List<String> getCustomerNames() {
		return customerNames;
	}

	public String getRoomStatus() {
		return roomStatus;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public void setConfirmNum(String confirmNum) {
		this.confirmNum = confirmNum;
	}

	public void setCustomerNames(List<String> customerNames) {
		this.customerNames = customerNames;
	}

	public Date getEndDate() {
		return endDate;
	}

	public String getRoomId() {
		return roomId;
	}

	public List<Long> getCustomerIds() {
		return customerIds;
	}

	public void setCustomerIds(List<Long> customerIds) {
		this.customerIds = customerIds;
	}
}
