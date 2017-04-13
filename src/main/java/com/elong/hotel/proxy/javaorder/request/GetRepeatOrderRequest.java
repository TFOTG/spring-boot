package com.elong.hotel.proxy.javaorder.request;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

/**
 * Created by Hualong.Li on 16/12/20.
 */
public class GetRepeatOrderRequest implements Serializable {

	private static final long serialVersionUID = -6299607854475219475L;
	/**
	 * mhotel id
	 */
	private String mHotelID;
	/**
	 * leavedate》=入住日
	 */
	private Date arriveDate;
	/**
	 * arrivedate《= 离店日
	 */
	private Date leaveDate;
	/**
	 * 订单状态
	 */
	private String[] reserveStatusArray;
	/**
	 * 条数
	 */
	private int queryLimit;

	public GetRepeatOrderRequest() {
	}

	public GetRepeatOrderRequest(String mhotel, Date arriveDate, Date leaveDate, Set<String> reserStatus, Integer size) {
		this.mHotelID = mhotel;
//		2. 入住日期<  ?'2016-12-22'（原单的离店日期）
//		3. 离店日期>  ?'2016-12-19'（原单的入住日期）
//		订单组中包括了=，入住日再原有基础减一天，离店日在原有基础+1天
		Calendar c = Calendar.getInstance();
		c.setTime(leaveDate);
		c.add(Calendar.DATE,-1);
		this.arriveDate = c.getTime();

		c.setTime(arriveDate);
		c.add(Calendar.DATE,1);
		this.leaveDate = c.getTime();
		this.reserveStatusArray = reserStatus.toArray(new String[]{});
		this.queryLimit = size;
	}

	public String getMHotelID() {
		return mHotelID;
	}

	public void setMHotelID(String mHotelID) {
		this.mHotelID = mHotelID;
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

	public String[] getReserveStatusArray() {
		return reserveStatusArray;
	}

	public void setReserveStatusArray(String[] reserveStatusArray) {
		this.reserveStatusArray = reserveStatusArray;
	}

	public int getQueryLimit() {
		return queryLimit;
	}

	public void setQueryLimit(int queryLimit) {
		this.queryLimit = queryLimit;
	}
}
