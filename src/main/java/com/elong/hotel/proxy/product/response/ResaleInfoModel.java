/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.proxy.product.request.ResaleInfoModel.java]
 * Createion [2017年9月6日]
 */
package com.elong.hotel.proxy.product.response;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class ResaleInfoModel {

	private boolean IsResale;
	
	private boolean IsResaleA;
	
	private String OrderExtend;
	
	private OrderResaleInfo OrderResaleInfo;

	public boolean isIsResale() {
		return IsResale;
	}

	public void setIsResale(boolean isResale) {
		IsResale = isResale;
	}

	public boolean isIsResaleA() {
		return IsResaleA;
	}

	public void setIsResaleA(boolean isResaleA) {
		IsResaleA = isResaleA;
	}

	public String getOrderExtend() {
		return OrderExtend;
	}

	public void setOrderExtend(String orderExtend) {
		OrderExtend = orderExtend;
	}

	public OrderResaleInfo getOrderResaleInfo() {
		return OrderResaleInfo;
	}

	public void setOrderResaleInfo(OrderResaleInfo orderResaleInfo) {
		OrderResaleInfo = orderResaleInfo;
	}
	
	
}
