/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.confirmorder.po.PendingConfirmOrderPo.java]
 * Createion [2017年6月27日]
 */
package com.elong.hotel.hotelconfirm.confirmorder.po;


/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class PendingConfirmOrderPo {

	/**
	 * 订单号
	 */
	private Integer reserno;
	
	/**
	 * 订单状态
	 */
	private String reserstatus;
	
	/**
	 * 到店时间
	 */
	private String arrivedate;
	
	/**
	 * 离店时间
	 */
	private String leavedate;
	
	/**
	 * 最早到店时间
	 */
	private String timeearly;
	
	/**
	 * 最晚到店时间
	 */
	private String timelate;
	
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
	private int suppliertype;
	
	/**
	 * 优先级
	 */
	private int priority;
	
	/**
	 * eb策略id
	 */
	private int ebkstrategyid;
	
	/**
	 * 承诺时间
	 */
	private String promisetime;
	
	/**
	 * 是否传真回传
	 */
	private int isfaxreturn;
	
	/**
	 * 是否联单重单
	 */
	private int islinked;
	
	/**
	 * 是否eb拒单
	 */
	private int isebrefuse;
	
	/**
	 * 是否催确认
	 */
	private int urge;
	
	/**
	 * 暂缓时间
	 */
	private String respitetime;
	
	/**
	 * 获取时间
	 */
	private String distributetime;

	public Integer getReserno() {
		return reserno;
	}

	public void setReserno(Integer reserno) {
		this.reserno = reserno;
	}

	public String getReserstatus() {
		return reserstatus;
	}

	public void setReserstatus(String reserstatus) {
		this.reserstatus = reserstatus;
	}

	public String getArrivedate() {
		return arrivedate;
	}

	public void setArrivedate(String arrivedate) {
		this.arrivedate = arrivedate;
	}

	public String getLeavedate() {
		return leavedate;
	}

	public void setLeavedate(String leavedate) {
		this.leavedate = leavedate;
	}

	public String getTimeearly() {
		return timeearly;
	}

	public void setTimeearly(String timeearly) {
		this.timeearly = timeearly;
	}

	public String getTimelate() {
		return timelate;
	}

	public void setTimelate(String timelate) {
		this.timelate = timelate;
	}

	public String getHotelid() {
		return hotelid;
	}

	public void setHotelid(String hotelid) {
		this.hotelid = hotelid;
	}

	public Integer getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(Integer supplierid) {
		this.supplierid = supplierid;
	}

	public int getSuppliertype() {
		return suppliertype;
	}

	public void setSuppliertype(int suppliertype) {
		this.suppliertype = suppliertype;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getEbkstrategyid() {
		return ebkstrategyid;
	}

	public void setEbkstrategyid(int ebkstrategyid) {
		this.ebkstrategyid = ebkstrategyid;
	}

	public String getPromisetime() {
		return promisetime;
	}

	public void setPromisetime(String promisetime) {
		this.promisetime = promisetime;
	}

	public int getIsfaxreturn() {
		return isfaxreturn;
	}

	public void setIsfaxreturn(int isfaxreturn) {
		this.isfaxreturn = isfaxreturn;
	}

	public int getIslinked() {
		return islinked;
	}

	public void setIslinked(int islinked) {
		this.islinked = islinked;
	}

	public int getIsebrefuse() {
		return isebrefuse;
	}

	public void setIsebrefuse(int isebrefuse) {
		this.isebrefuse = isebrefuse;
	}

	public int getUrge() {
		return urge;
	}

	public void setUrge(int urge) {
		this.urge = urge;
	}

	public String getRespitetime() {
		return respitetime;
	}

	public void setRespitetime(String respitetime) {
		this.respitetime = respitetime;
	}

	public String getDistributetime() {
		return distributetime;
	}

	public void setDistributetime(String distributetime) {
		this.distributetime = distributetime;
	}

}
