/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.confirmorder.po.PendingConfirmOrderPo.java]
 * Createion [2017年6月27日]
 */
package com.elong.hotel.hotelconfirm.confirmorder.po;

import java.util.List;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class PendingHotelPo {
	
	/**
	 * 酒店名称
	 */
	private String hotelname;
	
	/**
	 * 供应商名称
	 */
	private String suppliername;
	
	/**
	 * 酒店id
	 */
	private String hotelid;
	
	/**
	 * 供应商id
	 */
	private Integer supplierid;
	
	/**
	 * 供应商类型
	 */
	private Integer suppliertype;
	
	/**
	 * 酒店特殊注释
	 */
	private String specialnote;

	
	/**
	 * 酒店订单数量
	 */
	private int orderCount;
	
	/**
	 * 是否ebk在线
	 */
	private int ebonline;
	
	/**
	 * 酒店传真号码
	 */
	private String shotelfax;

	/**
	 * 供应商订单号
	 */
	private String cooperationOrderId;

	/**
	 * 是否展示同程标识
	 */
	private String originFrom;

	private int otaType;

	private List<PendingConfirmOrderPo> orderlist;
	
	private int roomContactSwitch;
	
	public String getHotelname() {
		return hotelname;
	}

	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}

	public String getHotelid() {
		return hotelid;
	}

	public void setHotelid(String hotelid) {
		this.hotelid = hotelid;
	}

	public String getSuppliername() {
		return suppliername;
	}

	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}

	public Integer getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(Integer supplierid) {
		this.supplierid = supplierid;
	}

	public Integer getSuppliertype() {
		return suppliertype;
	}

	public void setSuppliertype(Integer suppliertype) {
		this.suppliertype = suppliertype;
	}

	public String getSpecialnote() {
		return specialnote;
	}

	public void setSpecialnote(String specialnote) {
		this.specialnote = specialnote;
	}

	public List<PendingConfirmOrderPo> getOrderlist() {
		return orderlist;
	}

	public void setOrderlist(List<PendingConfirmOrderPo> orderlist) {
		this.orderlist = orderlist;
	}

	public int getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}

	public int getEbonline() {
		return ebonline;
	}

	public void setEbonline(int ebonline) {
		this.ebonline = ebonline;
	}

	public String getShotelfax() {
		return shotelfax;
	}

	public void setShotelfax(String shotelfax) {
		this.shotelfax = shotelfax;
	}

	public int getRoomContactSwitch() {
		return roomContactSwitch;
	}

	public void setRoomContactSwitch(int roomContactSwitch) {
		this.roomContactSwitch = roomContactSwitch;
	}

	public String getCooperationOrderId() {
		return cooperationOrderId;
	}

	public void setCooperationOrderId(String cooperationOrderId) {
		this.cooperationOrderId = cooperationOrderId;
	}

	public String getOriginFrom() {
		return originFrom;
	}

	public void setOriginFrom(String originFrom) {
		this.originFrom = originFrom;
	}

	public int getOtaType() {
		return otaType;
	}

	public void setOtaType(int otaType) {
		this.otaType = otaType;
	}
}
