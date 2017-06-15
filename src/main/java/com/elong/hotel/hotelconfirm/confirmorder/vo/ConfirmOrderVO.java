package com.elong.hotel.hotelconfirm.confirmorder.vo;

import com.elong.hotel.common.parameter.PaginationParameter;

import java.util.List;

/**
 * Created by Hualong.Li on 17/6/12.
 */
public class ConfirmOrderVO  extends PaginationParameter {

	private List<Integer> rankIds;

	private String ivrStartTime;

	private String staffName;

	private Integer reserNo;

	private String hotelId;

	public List<Integer> getRankIds() {
		return rankIds;
	}

	public void setRankIds(List<Integer> rankIds) {
		this.rankIds = rankIds;
	}

	public String getIvrStartTime() {
		return ivrStartTime;
	}

	public void setIvrStartTime(String ivrStartTime) {
		this.ivrStartTime = ivrStartTime;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public Integer getReserNo() {
		return reserNo;
	}

	public void setReserNo(Integer reserNo) {
		this.reserNo = reserNo;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
}
