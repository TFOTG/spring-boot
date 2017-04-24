package com.elong.hotel.hotelconfirm.confirmorder.context;

import com.elong.hotel.hotelconfirm.confirmorder.bo.ConfirmOrderBo;

import java.io.Serializable;

public class ServerRunningContext implements Serializable {

	private Integer reserNo;

	private ConfirmOrderBo originConfirmOrderBo;

	private ConfirmOrderBo targetConfirmOrderBo;

	public ServerRunningContext() {
	}

	public Integer getReserNo() {
		return reserNo;
	}

	public void setReserNo(Integer reserNo) {
		this.reserNo = reserNo;
	}

	public ConfirmOrderBo getOriginConfirmOrderBo() {
		return originConfirmOrderBo;
	}

	public void setOriginConfirmOrderBo(ConfirmOrderBo originConfirmOrderBo) {
		this.originConfirmOrderBo = originConfirmOrderBo;
	}

	public ConfirmOrderBo getTargetConfirmOrderBo() {
		return targetConfirmOrderBo;
	}

	public void setTargetConfirmOrderBo(ConfirmOrderBo targetConfirmOrderBo) {
		this.targetConfirmOrderBo = targetConfirmOrderBo;
	}
}
