package com.elong.hotel.common.groupfilter.context;

import com.elong.hotel.common.groupfilter.bo.CompareEntityBase;

public class GroupFilterContext<T extends CompareEntityBase>  {

	private T compareEntity;

	public T getCompareEntity() {
		return compareEntity;
	}

	public void setCompareEntity(T compareEntity) {
		this.compareEntity = compareEntity;
	}
}
