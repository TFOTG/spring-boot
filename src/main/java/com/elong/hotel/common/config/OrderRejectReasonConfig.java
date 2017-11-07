/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.common.config.OrderRejectReasonConfig.java]
 * Createion [2017年7月17日]
 */
package com.elong.hotel.common.config;

import java.util.List;
import java.util.Map;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class OrderRejectReasonConfig {

	private List<Map<String,String>> fullRoom;
	
	private List<Map<String,String>> changePrice;
	
	private List<Map<String,String>> needGuarantee;
	
	private List<Map<String,String>> specialFullroom;
	
	private List<Map<String,String>> menuonenames;

	public List<Map<String, String>> getFullRoom() {
		return fullRoom;
	}

	public void setFullRoom(List<Map<String, String>> fullRoom) {
		this.fullRoom = fullRoom;
	}

	public List<Map<String, String>> getChangePrice() {
		return changePrice;
	}

	public void setChangePrice(List<Map<String, String>> changePrice) {
		this.changePrice = changePrice;
	}

	public List<Map<String, String>> getNeedGuarantee() {
		return needGuarantee;
	}

	public void setNeedGuarantee(List<Map<String, String>> needGuarantee) {
		this.needGuarantee = needGuarantee;
	}

	public List<Map<String, String>> getSpecialFullroom() {
		return specialFullroom;
	}

	public void setSpecialFullroom(List<Map<String, String>> specialFullroom) {
		this.specialFullroom = specialFullroom;
	}

	public List<Map<String, String>> getMenuonenames() {
		return menuonenames;
	}

	public void setMenuonenames(List<Map<String, String>> menuonenames) {
		this.menuonenames = menuonenames;
	}
}
