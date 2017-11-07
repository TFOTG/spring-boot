package com.elong.hotel.hotelconfirm.groupfilter.context;

import com.elong.hotel.hotelconfirm.groupfilter.bo.CompareEntityBase;

public class GroupFilterContext<T extends CompareEntityBase>  {

	private T compareEntity;

	public T getCompareEntity() {
		return compareEntity;
	}

	public void setCompareEntity(T compareEntity) {
		this.compareEntity = compareEntity;
	}
}
