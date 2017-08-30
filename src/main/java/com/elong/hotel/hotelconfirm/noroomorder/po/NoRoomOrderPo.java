package com.elong.hotel.hotelconfirm.noroomorder.po;

import java.util.Date;

/**
 * 
 * 到店无房PO类
 *
 * <p>
 * 2017年8月30日 下午1:54:59   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class NoRoomOrderPo {

	/**
	 * 自增主键ID
	 */
	private long id;

	/**
	 * 订单ID
	 */
	private Integer reserNo;

	/**
	 * 订单状态
	 */
	private String reserStatus;

	/**
	 * 到店日期
	 */
	private Date arriveDate;

	/**
	 * 离店日期
	 */
	private Date leaveDate;

	/**
	 * 酒店ID
	 */
	private String hotelId;

	/**
	 * 酒店名称
	 */
	private String hotelName;

	/**
	 * ivr外呼状态
	 */
	private Integer ivrStatus;

	/**
	 * 外呼开始时间
	 */
	private Date ivrStartTime;

	/**
	 * ivr外呼计数
	 */
	private Integer ivrCount;

	/**
	 * 操作人
	 */
	private String operator;

	/**
	 * 操作时间
	 */
	private Date operateTime;

	/**
	 * 订单时间戳
	 */
	private long orderTimestampLong;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getReserNo() {
		return reserNo;
	}

	public void setReserNo(Integer reserNo) {
		this.reserNo = reserNo;
	}

	public String getReserStatus() {
		return reserStatus;
	}

	public void setReserStatus(String reserStatus) {
		this.reserStatus = reserStatus;
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

	public Integer getIvrStatus() {
		return ivrStatus;
	}

	public void setIvrStatus(Integer ivrStatus) {
		this.ivrStatus = ivrStatus;
	}

	public Date getIvrStartTime() {
		return ivrStartTime;
	}

	public void setIvrStartTime(Date ivrStartTime) {
		this.ivrStartTime = ivrStartTime;
	}

	public Integer getIvrCount() {
		return ivrCount;
	}

	public void setIvrCount(Integer ivrCount) {
		this.ivrCount = ivrCount;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Date getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public long getOrderTimestampLong() {
		return orderTimestampLong;
	}

	public void setOrderTimestampLong(long orderTimestampLong) {
		this.orderTimestampLong = orderTimestampLong;
	}
}
