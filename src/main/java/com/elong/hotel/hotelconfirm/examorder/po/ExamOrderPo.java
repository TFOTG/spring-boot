package com.elong.hotel.hotelconfirm.examorder.po;

import com.elong.hotel.hotelconfirm.examorder.bo.ExamOrderBo;

public class ExamOrderPo {


	private int id;

	private Integer reserNo;

	private Integer groupId;

	public ExamOrderPo() {
	}

	public ExamOrderPo(ExamOrderBo bo) {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getReserNo() {
		return reserNo;
	}

	public void setReserNo(Integer reserNo) {
		this.reserNo = reserNo;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
}
