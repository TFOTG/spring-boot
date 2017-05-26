package com.elong.hotel.proxy.javaorder.getorder;

import java.util.Date;

/**
 * Created by Hualong.Li on 16/12/12.
 */
public class OrderHistory {

	/**
	 * 订单号
	 */
	private Long orderID;
	/**
	 * 订单状态
	 */
	private String reserveStatus;
	/**
	 * 入住日期
	 */
	private Date arriveDate;
	/**
	 * 离店日期
	 */
	private Date leaveDate;
	/**
	 * 房间数
	 */
	private Integer roomCount;
	/**
	 * 订单创建时间
	 */
	private Date createTime;
	/**
	 * 订单修改时间
	 */
	private Date modifyTime;
	/**
	 * 修改人
	 */
	private String modifier;

    public OrderHistory() {
    }

    public OrderHistory(Order order) {
        this.orderID = order.getOrderId();
        this.reserveStatus = order.getStatus();
        this.arriveDate = order.getCheckInDate();
        this.leaveDate = order.getCheckOutDate();
        this.roomCount = order.getRoomCount();
        this.createTime = order.getCreateTime();
        this.modifyTime=order.getModifyTime();
        this.modifier = order.getModifyName();
    }

    public Long getOrderID() {
		return orderID;
	}

	public void setOrderID(Long orderID) {
		this.orderID = orderID;
	}

	public String getReserveStatus() {
		return reserveStatus;
	}

	public void setReserveStatus(String reserveStatus) {
		this.reserveStatus = reserveStatus;
	}

	public Date getArriveDate() {
		return arriveDate;
	}

	public void setArriveDate(Date arriveDate) {
		this.arriveDate = arriveDate;
	}

	public Date getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}

	public Integer getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(Integer roomCount) {
		this.roomCount = roomCount;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
}
