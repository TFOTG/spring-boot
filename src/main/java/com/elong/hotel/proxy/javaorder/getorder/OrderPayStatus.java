package com.elong.hotel.proxy.javaorder.getorder;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderPayStatus implements Serializable {

	private Long orderId;

	private Integer processType;

	private Integer processStatus;

	private BigDecimal payAmountShouldBe;

	private BigDecimal payAmountActuallyBe;

	private BigDecimal refundableAmount;

	private BigDecimal transactionAmount;

	private String failReason;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Integer getProcessType() {
		return processType;
	}

	public void setProcessType(Integer processType) {
		this.processType = processType;
	}

	public Integer getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(Integer processStatus) {
		this.processStatus = processStatus;
	}

	public BigDecimal getPayAmountShouldBe() {
		return payAmountShouldBe;
	}

	public void setPayAmountShouldBe(BigDecimal payAmountShouldBe) {
		this.payAmountShouldBe = payAmountShouldBe;
	}

	public BigDecimal getPayAmountActuallyBe() {
		return payAmountActuallyBe;
	}

	public void setPayAmountActuallyBe(BigDecimal payAmountActuallyBe) {
		this.payAmountActuallyBe = payAmountActuallyBe;
	}

	public BigDecimal getRefundableAmount() {
		return refundableAmount;
	}

	public void setRefundableAmount(BigDecimal refundableAmount) {
		this.refundableAmount = refundableAmount;
	}

	public BigDecimal getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getFailReason() {
		return failReason;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

}
