/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.proxy.product.request.OrderResaleInfo.java]
 * Createion [2017年9月6日]
 */
package com.elong.hotel.proxy.product.response;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class OrderResaleInfo {

	
	private Long CardNo;
	
	private float CommisionRate;
	
	private Integer OrderId;
	
	private float ResaleAmount;
	
	private float ResaleRate;
	
	private int ResaleStatus;
	
	private int SettleStatus;

	public Long getCardNo() {
		return CardNo;
	}

	public void setCardNo(Long cardNo) {
		CardNo = cardNo;
	}

	public float getCommisionRate() {
		return CommisionRate;
	}

	public void setCommisionRate(float commisionRate) {
		CommisionRate = commisionRate;
	}

	public Integer getOrderId() {
		return OrderId;
	}

	public void setOrderId(Integer orderId) {
		OrderId = orderId;
	}

	public float getResaleAmount() {
		return ResaleAmount;
	}

	public void setResaleAmount(float resaleAmount) {
		ResaleAmount = resaleAmount;
	}

	public float getResaleRate() {
		return ResaleRate;
	}

	public void setResaleRate(float resaleRate) {
		ResaleRate = resaleRate;
	}

	public int getResaleStatus() {
		return ResaleStatus;
	}

	public void setResaleStatus(int resaleStatus) {
		ResaleStatus = resaleStatus;
	}

	public int getSettleStatus() {
		return SettleStatus;
	}

	public void setSettleStatus(int settleStatus) {
		SettleStatus = settleStatus;
	}
	
	
}
