package com.elong.hotel.hotelconfirm.confirmorder.context;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.confirmorder.bo.ConfirmOrderBo;
import com.elong.hotel.hotelconfirm.confirmorder.enums.ServerRunningDomainEnum;
import com.elong.hotel.storage.bo.OrderConsumerInfoBo;
import com.elong.hotel.storage.request.OrderStatusChangeRequest;

import java.io.Serializable;

public class ServerRunningContext implements Serializable {

	private Integer reserNo;

	private ConfirmOrderBo originConfirmOrderBo;

	private ConfirmOrderBo targetConfirmOrderBo;

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
