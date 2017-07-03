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

	private List<PendingConfirmOrderPo> orderlist;
	
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
	
}
