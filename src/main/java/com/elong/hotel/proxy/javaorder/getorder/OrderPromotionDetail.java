package com.elong.hotel.proxy.javaorder.getorder;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @author zouyufei
 *
 */
public class OrderPromotionDetail {

	private BigDecimal amount;
	private Long id;
	private BigDecimal limitAmount;
	private Integer promotionType;
	private Long roomId;
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date stayDate;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getLimitAmount() {
		return limitAmount;
	}

	public void setLimitAmount(BigDecimal limitAmount) {
		this.limitAmount = limitAmount;
	}

	public Integer getPromotionType() {
		return promotionType;
	}

	public void setPromotionType(Integer promotionType) {
		this.promotionType = promotionType;
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public Date getStayDate() {
		return stayDate;
	}

	public void setStayDate(Date stayDate) {
		this.stayDate = stayDate;
	}

}
