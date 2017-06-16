package com.elong.hotel.hotelconfirm.confirmorder.vo;

import com.elong.hotel.common.parameter.PaginationParameter;

import java.util.List;

/**
 * Created by Hualong.Li on 17/6/12.
 */
public class ConfirmOrderVO  extends PaginationParameter {

	private List<Integer> rankIds;

	private String ivrStartTimeL;

	private String staffName;

	private Integer reserNo;

	private String hotelId;

	private String bussinessGuid;

	private String orderIds;

	private String reserStatus;

	private int ivrStatus;

	private int sortTimeN;

	public List<Integer> getRankIds() {
		return rankIds;
	}

	public void setRankIds(List<Integer> rankIds) {
		this.rankIds = rankIds;
	}

	public String getIvrStartTimeL() {
		return ivrStartTimeL;
	}

	public void setIvrStartTimeL(String ivrStartTimeL) {
		this.ivrStartTimeL = ivrStartTimeL;
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

	public String getBussinessGuid() {
		return bussinessGuid;
	}

	public void setBussinessGuid(String bussinessGuid) {
		this.bussinessGuid = bussinessGuid;
	}

	public String getOrderIds() {
		return orderIds;
	}

	public void setOrderIds(String orderIds) {
		this.orderIds = orderIds;
	}

	public String getReserStatus() {
		return reserStatus;
	}

	public void setReserStatus(String reserStatus) {
		this.reserStatus = reserStatus;
	}

	public int getIvrStatus() {
		return ivrStatus;
	}

	public void setIvrStatus(int ivrStatus) {
		this.ivrStatus = ivrStatus;
	}

	public int getSortTimeN() {
		return sortTimeN;
	}

	public void setSortTimeN(int sortTimeN) {
		this.sortTimeN = sortTimeN;
	}
}
