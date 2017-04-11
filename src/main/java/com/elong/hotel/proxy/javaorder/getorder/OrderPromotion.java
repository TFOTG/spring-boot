package com.elong.hotel.proxy.javaorder.getorder;

import java.math.BigDecimal;

/**
 * 
 * @author zouyufei
 *
 */
public class OrderPromotion {
	// 主键自增ID
	private int id;
	// 促销类型
	private int promotionType;
	// 促销Id
	private long promotionId;

	private BigDecimal promotionLimit;
	// 折扣金额,
	private BigDecimal amount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPromotionType() {
		return promotionType;
	}

	public void setPromotionType(int promotionType) {
		this.promotionType = promotionType;
	}

	public long getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(long promotionId) {
		this.promotionId = promotionId;
	}

	public BigDecimal getPromotionLimit() {
		return promotionLimit;
	}

	public void setPromotionLimit(BigDecimal promotionLimit) {
		this.promotionLimit = promotionLimit;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}
