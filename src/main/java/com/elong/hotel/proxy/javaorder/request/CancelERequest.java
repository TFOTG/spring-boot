package com.elong.hotel.proxy.javaorder.request;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Hualong.Li on 17/2/16.
 */
public class CancelERequest extends ChangeOrderStatusRequestBase {

	/**
	 * 客人罚金
	 */
	private BigDecimal penaltyToCustomer;
	/**
	 * 补偿酒店
	 */
	private BigDecimal compensationToHotel;
	/**
	 * 取消原因id
	 */
	private int changeReasonId;
	/**
	 * 取消原因
	 */
	private String changeReason;

	public CancelERequest(int orderId, String operatorName, String operatorIp, Date opDate,BigDecimal penaltyToCustomer,BigDecimal compensationToHotel,int changeReasonId,String changeReason) {
		super(orderId, operatorName, operatorIp, opDate);
		this.penaltyToCustomer = penaltyToCustomer;
		this.compensationToHotel = compensationToHotel;
		this.changeReasonId = changeReasonId;
		this.changeReason = changeReason;
	}

	public BigDecimal getPenaltyToCustomer() {
		return penaltyToCustomer;
	}

	public void setPenaltyToCustomer(BigDecimal penaltyToCustomer) {
		this.penaltyToCustomer = penaltyToCustomer;
	}

	public BigDecimal getCompensationToHotel() {
		return compensationToHotel;
	}

	public void setCompensationToHotel(BigDecimal compensationToHotel) {
		this.compensationToHotel = compensationToHotel;
	}

	public int getChangeReasonId() {
		return changeReasonId;
	}

	public void setChangeReasonId(int changeReasonId) {
		this.changeReasonId = changeReasonId;
	}

	public String getChangeReason() {
		return changeReason;
	}

	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}
}
