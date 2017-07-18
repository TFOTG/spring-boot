package com.elong.hotel.hotelconfirm.confirmorder.request;

import java.util.List;

/**
 * Created by Hualong.Li on 17/7/6.
 */
public class GetRefuse4EbookingRequest {

	private List<Integer> reserNos;

	private List<String> hotelIds;

	private Integer startItem;

	private Integer pageSize;

	public List<Integer> getReserNos() {
		return reserNos;
	}

	public void setReserNos(List<Integer> reserNos) {
		this.reserNos = reserNos;
	}

	public List<String> getHotelIds() {
		return hotelIds;
	}

	public void setHotelIds(List<String> hotelIds) {
		this.hotelIds = hotelIds;
	}

	public Integer getStartItem() {
		return startItem;
	}

	public void setStartItem(Integer startItem) {
		this.startItem = startItem;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}
