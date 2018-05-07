package com.elong.hotel.hotelconfirm.examorder.context;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.confirmorder.enums.ServerRunningDomainEnum;
import com.elong.hotel.hotelconfirm.examorder.po.ExamOrderPo;
import com.elong.hotel.proxy.javaorder.getorder.Order;
import com.elong.hotel.storage.bo.OrderConsumerInfoBo;
import com.elong.hotel.storage.request.OrderStatusChangeRequest;

import java.io.Serializable;

public class ExamOrderDomainContext implements Serializable {

	private Integer reserNo;

	private ServerRunningDomainEnum serverRunningDomainEnum;

	private Order order;

	private ExamOrderPo examOrderPo;

	private OrderConsumerInfoBo orderConsumerInfoBo;

	private OperatorInfoBo operator;

	private OrderStatusChangeRequest request;

	public ExamOrderDomainContext() {
	}

	public ExamOrderDomainContext(Integer reserNo, ServerRunningDomainEnum serverRunningDomainEnum, Order order,
			ExamOrderPo examOrderPo, OrderConsumerInfoBo orderConsumerInfoBo) {
		this.reserNo = reserNo;
		this.serverRunningDomainEnum = serverRunningDomainEnum;
		this.order = order;
		this.examOrderPo = examOrderPo;
		this.orderConsumerInfoBo = orderConsumerInfoBo;
		this.operator = orderConsumerInfoBo.getOperatorInfo();
	}

	public Integer getReserNo() {
		return reserNo;
	}

	public void setReserNo(Integer reserNo) {
		this.reserNo = reserNo;
	}

	public ServerRunningDomainEnum getServerRunningDomainEnum() {
		return serverRunningDomainEnum;
	}

	public void setServerRunningDomainEnum(ServerRunningDomainEnum serverRunningDomainEnum) {
		this.serverRunningDomainEnum = serverRunningDomainEnum;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public ExamOrderPo getExamOrderPo() {
		return examOrderPo;
	}

	public void setExamOrderPo(ExamOrderPo examOrderPo) {
		this.examOrderPo = examOrderPo;
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

	public OrderStatusChangeRequest getRequest() {
		return request;
	}

	public void setRequest(OrderStatusChangeRequest request) {
		this.request = request;
	}
}
