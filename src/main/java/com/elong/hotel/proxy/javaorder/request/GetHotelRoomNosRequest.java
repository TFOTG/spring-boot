package com.elong.hotel.proxy.javaorder.request;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * 获取mHotelId酒店下的，在 timeBeforeCheckOutDate～timeAfterCheckInDate 有入住订单的房号
 * 
 * @author zouyufei
 *
 */
public class GetHotelRoomNosRequest {

	private String mHotelId;
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date timeAfterCheckInDate;
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date timeBeforeCheckOutDate;
	private int pageIndex;

	public String getMHotelId() {
		return mHotelId;
	}

	public void setMHotelId(String mHotelId) {
		this.mHotelId = mHotelId;
	}

	public Date getTimeAfterCheckInDate() {
		return timeAfterCheckInDate;
	}

	public void setTimeAfterCheckInDate(Date timeAfterCheckInDate) {
		this.timeAfterCheckInDate = timeAfterCheckInDate;
	}

	public Date getTimeBeforeCheckOutDate() {
		return timeBeforeCheckOutDate;
	}

	public void setTimeBeforeCheckOutDate(Date timeBeforeCheckOutDate) {
		this.timeBeforeCheckOutDate = timeBeforeCheckOutDate;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

}
