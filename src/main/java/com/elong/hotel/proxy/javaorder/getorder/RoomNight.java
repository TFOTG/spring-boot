package com.elong.hotel.proxy.javaorder.getorder;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @author zouyufei
 *
 */
public class RoomNight {

	private Integer breakfastCount;
	private Long breakfastId;
	private BigDecimal breakfastUnitPrice;
	private BigDecimal cost;
	private String currencyCode;
	private BigDecimal exchangePrice;
	private BigDecimal exchangeRate;
	private Integer halfDayStatus;
	private Long id;
	private Long inventoryId;
	private Integer inventoryType;
	private Boolean isPromotion;
	private Boolean isSpecial;
	private Boolean isWeekend;
	private Long priceId;
	private BigDecimal rackRate;
	private BigDecimal realCost;
	private BigDecimal realSalePrice;
	private Long roomId;
	private BigDecimal salePrice;
	@JSONField(format = "yyyy-MM-dd")
	private Date stayDate;
	private String roomNightHotelDcRateCode;
	
	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public BigDecimal getExchangePrice() {
		return exchangePrice;
	}

	public void setExchangePrice(BigDecimal exchangePrice) {
		this.exchangePrice = exchangePrice;
	}

	public Integer getBreakfastCount() {
		return breakfastCount;
	}

	public void setBreakfastCount(Integer breakfastCount) {
		this.breakfastCount = breakfastCount;
	}

	public Long getBreakfastId() {
		return breakfastId;
	}

	public void setBreakfastId(Long breakfastId) {
		this.breakfastId = breakfastId;
	}

	public BigDecimal getBreakfastUnitPrice() {
		return breakfastUnitPrice;
	}

	public void setBreakfastUnitPrice(BigDecimal breakfastUnitPrice) {
		this.breakfastUnitPrice = breakfastUnitPrice;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public Integer getHalfDayStatus() {
		return halfDayStatus;
	}

	public void setHalfDayStatus(Integer halfDayStatus) {
		this.halfDayStatus = halfDayStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Integer getInventoryType() {
		return inventoryType;
	}

	public void setInventoryType(Integer inventoryType) {
		this.inventoryType = inventoryType;
	}

	public Boolean getIsPromotion() {
		return isPromotion;
	}

	public void setIsPromotion(Boolean isPromotion) {
		this.isPromotion = isPromotion;
	}

	public Boolean getIsSpecial() {
		return isSpecial;
	}

	public void setIsSpecial(Boolean isSpecial) {
		this.isSpecial = isSpecial;
	}

	public Boolean getIsWeekend() {
		return isWeekend;
	}

	public void setIsWeekend(Boolean isWeekend) {
		this.isWeekend = isWeekend;
	}

	public Long getPriceId() {
		return priceId;
	}

	public void setPriceId(Long priceId) {
		this.priceId = priceId;
	}

	public BigDecimal getRackRate() {
		return rackRate;
	}

	public void setRackRate(BigDecimal rackRate) {
		this.rackRate = rackRate;
	}

	public BigDecimal getRealCost() {
		return realCost;
	}

	public void setRealCost(BigDecimal realCost) {
		this.realCost = realCost;
	}

	public BigDecimal getRealSalePrice() {
		return realSalePrice;
	}

	public void setRealSalePrice(BigDecimal realSalePrice) {
		this.realSalePrice = realSalePrice;
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public Date getStayDate() {
		return stayDate;
	}

	public void setStayDate(Date stayDate) {
		this.stayDate = stayDate;
	}

	public String getRoomNightHotelDcRateCode() {
		return roomNightHotelDcRateCode;
	}

	public void setRoomNightHotelDcRateCode(String roomNightHotelDcRateCode) {
		this.roomNightHotelDcRateCode = roomNightHotelDcRateCode;
	}
}
