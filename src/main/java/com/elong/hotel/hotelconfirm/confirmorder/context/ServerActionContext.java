package com.elong.hotel.hotelconfirm.confirmorder.context;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.confirmorder.bo.ConfirmOrderBo;
import com.elong.hotel.hotelconfirm.confirmorder.enums.ServerActionEnum;
import com.elong.hotel.hotelconfirm.confirmorderactionlog.enums.ActionOpFromEnum;
import com.elong.hotel.proxy.javaorder.getorder.Order;

import java.io.Serializable;

public class ServerActionContext implements Serializable {

	ConfirmOrderBo confirmOrderBo;
	ConfirmOrderBo targetConfirmOrderBo;
	Order order;
	OperatorInfoBo operatorInfo;
	ServerActionEnum actionEnum;
	ActionOpFromEnum actionOpFromEnum;

	public ServerActionEnum getActionEnum() {
		return actionEnum;
	}

	public void setActionEnum(ServerActionEnum actionEnum) {
		this.actionEnum = actionEnum;
	}

	public ActionOpFromEnum getActionOpFromEnum() {
		return actionOpFromEnum;
	}

	public void setActionOpFromEnum(ActionOpFromEnum actionOpFromEnum) {
		this.actionOpFromEnum = actionOpFromEnum;
	}

	public ConfirmOrderBo getConfirmOrderBo() {
		return confirmOrderBo;
	}

	public void setConfirmOrderBo(ConfirmOrderBo confirmOrderBo) {
		this.confirmOrderBo = confirmOrderBo;
	}

	public OperatorInfoBo getOperatorInfo() {
		return operatorInfo;
	}

	public void setOperatorInfo(OperatorInfoBo operatorInfo) {
		this.operatorInfo = operatorInfo;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public ConfirmOrderBo getTargetConfirmOrderBo() {
		return targetConfirmOrderBo;
	}

	public void setTargetConfirmOrderBo(ConfirmOrderBo targetConfirmOrderBo) {
		this.targetConfirmOrderBo = targetConfirmOrderBo;
	}
}
