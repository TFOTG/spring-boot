package com.elong.hotel.hotelconfirm.examorder.context;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.confirmorderactionlog.enums.ActionOpFromEnum;
import com.elong.hotel.hotelconfirm.examorder.bo.ExamOrderBo;
import com.elong.hotel.proxy.javaorder.getorder.Order;

import java.io.Serializable;

public class ServerActionContext implements Serializable {

	ExamOrderBo examOrderBo;
	ExamOrderBo targetExamOrderBo;
	Order order;
	OperatorInfoBo operatorInfo;
	ActionOpFromEnum actionOpFromEnum;

	public ExamOrderBo getExamOrderBo() {
		return examOrderBo;
	}

	public void setExamOrderBo(ExamOrderBo examOrderBo) {
		this.examOrderBo = examOrderBo;
	}

	public ExamOrderBo getTargetExamOrderBo() {
		return targetExamOrderBo;
	}

	public void setTargetExamOrderBo(ExamOrderBo targetExamOrderBo) {
		this.targetExamOrderBo = targetExamOrderBo;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public OperatorInfoBo getOperatorInfo() {
		return operatorInfo;
	}

	public void setOperatorInfo(OperatorInfoBo operatorInfo) {
		this.operatorInfo = operatorInfo;
	}

	public ActionOpFromEnum getActionOpFromEnum() {
		return actionOpFromEnum;
	}

	public void setActionOpFromEnum(ActionOpFromEnum actionOpFromEnum) {
		this.actionOpFromEnum = actionOpFromEnum;
	}
}
