package com.elong.hotel.hotelconfirm.examorder.context;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.confirmorder.enums.ServerRunningDomainEnum;
import com.elong.hotel.hotelconfirm.examorder.bo.ExamOrderBo;
import com.elong.hotel.storage.bo.OrderConsumerInfoBo;
import com.elong.hotel.storage.request.OrderStatusChangeRequest;

import java.io.Serializable;

public class ServerRunningContext implements Serializable {

	private Integer reserNo;

	private ExamOrderBo originExamOrderBo;

	private ExamOrderBo targetExamOrderBo;

	private ServerRunningDomainEnum serverRunningDomainEnum;

	private OrderConsumerInfoBo orderConsumerInfoBo;

	private OperatorInfoBo operator;

	private OrderStatusChangeRequest request;

	public ServerRunningContext() {
	}

	public ServerRunningDomainEnum getServerRunningDomainEnum() {
		return serverRunningDomainEnum;
	}

	public void setServerRunningDomainEnum(ServerRunningDomainEnum serverRunningDomainEnum) {
		this.serverRunningDomainEnum = serverRunningDomainEnum;
	}

	public Integer getReserNo() {
		return reserNo;
	}

	public void setReserNo(Integer reserNo) {
		this.reserNo = reserNo;
	}

	public ExamOrderBo getOriginExamOrderBo() {
		return originExamOrderBo;
	}

	public void setOriginExamOrderBo(ExamOrderBo originExamOrderBo) {
		this.originExamOrderBo = originExamOrderBo;
	}

	public ExamOrderBo getTargetExamOrderBo() {
		return targetExamOrderBo;
	}

	public void setTargetExamOrderBo(ExamOrderBo targetExamOrderBo) {
		this.targetExamOrderBo = targetExamOrderBo;
	}

	public OrderConsumerInfoBo getOrderConsumerInfoBo() {
		return orderConsumerInfoBo;
	}

	public void setOrderConsumerInfoBo(OrderConsumerInfoBo orderConsumerInfoBo) {
		this.orderConsumerInfoBo = orderConsumerInfoBo;
	}

	public OperatorInfoBo getOperator() {
		return operator;
	}

	public void setOperator(OperatorInfoBo operator) {
		this.operator = operator;
	}

	public ServerRunningContext(OrderStatusChangeRequest request) {
		this.request = request;
	}

	public OrderStatusChangeRequest getRequest() {
		return request;
	}

	public void setRequest(OrderStatusChangeRequest request) {
		this.request = request;
	}
}
