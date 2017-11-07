package com.elong.hotel.proxy.javaorder.getorder;

import java.util.List;

/**
 * Created by Hualong.Li on 17/6/28.
 */
public class RepeatAndLinkOrder {

	private List<Integer> relationOrderByCardNo;

	private List<Integer> relationOrderByGuestName;

	private List<Integer> relationOrderByPhone;

	public List<Integer> getRelationOrderByCardNo() {
		return relationOrderByCardNo;
	}

	public void setRelationOrderByCardNo(List<Integer> relationOrderByCardNo) {
		this.relationOrderByCardNo = relationOrderByCardNo;
	}

	public List<Integer> getRelationOrderByGuestName() {
		return relationOrderByGuestName;
	}

	public void setRelationOrderByGuestName(List<Integer> relationOrderByGuestName) {
		this.relationOrderByGuestName = relationOrderByGuestName;
	}

	public List<Integer> getRelationOrderByPhone() {
		return relationOrderByPhone;
	}

	public void setRelationOrderByPhone(List<Integer> relationOrderByPhone) {
		this.relationOrderByPhone = relationOrderByPhone;
	}
}
