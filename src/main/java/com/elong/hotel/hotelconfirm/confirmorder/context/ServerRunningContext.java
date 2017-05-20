package com.elong.hotel.hotelconfirm.confirmorder.context;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.confirmorder.bo.ConfirmOrderBo;

import java.io.Serializable;

public class ServerRunningContext implements Serializable {

	private Integer reserNo;

	private ConfirmOrderBo originConfirmOrderBo;

	private ConfirmOrderBo targetConfirmOrderBo;

	private OperatorInfoBo operator;

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

	public OperatorInfoBo getOperator() {
		return operator;
	}

	public void setOperator(OperatorInfoBo operator) {
		this.operator = operator;
	}
}
