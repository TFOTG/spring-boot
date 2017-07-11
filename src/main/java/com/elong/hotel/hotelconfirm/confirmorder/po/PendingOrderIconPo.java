/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.confirmorder.po.PendingOrderIconPo.java]
 * Createion [2017年7月7日]
 */
package com.elong.hotel.hotelconfirm.confirmorder.po;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class PendingOrderIconPo {
	
	private Integer iconOrderId;
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
	 * 是否变更单
	 */
	private Integer ischangeorder;
	
	/**
	 * 签约数量
	 */
	private Integer signedcount;
	
	/**
	 * 添加数量
	 */
	private Integer increasecount;
	
	/**
	 * 买断
	 */
	private Integer buyout;
	
	/**
	 * 直连失败
	 */
	private String dcfail;
	
	/**
	 * 小时房
	 */
	private String hourroom;
	
	/**
	 * 发送短信确认
	 */
	private Integer sendmessage;
	
	/**
	 * 会员登记  钻石 龙萃
	 */
	private String gradeId;
	/**
	 * 供应商类型
	 */
	private int suppliertype;
	
	/**
	 * 优先级
	 */
	private int priority;
	public Integer getIconOrderId() {
		return iconOrderId;
	}

	public void setIconOrderId(Integer iconOrderId) {
		this.iconOrderId = iconOrderId;
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

	public Integer getIschangeorder() {
		return ischangeorder;
	}

	public void setIschangeorder(Integer ischangeorder) {
		this.ischangeorder = ischangeorder;
	}

	public Integer getSignedcount() {
		return signedcount;
	}

	public void setSignedcount(Integer signedcount) {
		this.signedcount = signedcount;
	}

	public Integer getIncreasecount() {
		return increasecount;
	}

	public void setIncreasecount(Integer increasecount) {
		this.increasecount = increasecount;
	}

	public Integer getBuyout() {
		return buyout;
	}

	public void setBuyout(Integer buyout) {
		this.buyout = buyout;
	}

	public String getDcfail() {
		return dcfail;
	}

	public void setDcfail(String dcfail) {
		this.dcfail = dcfail;
	}

	public String getHourroom() {
		return hourroom;
	}

	public void setHourroom(String hourroom) {
		this.hourroom = hourroom;
	}

	public Integer getSendmessage() {
		return sendmessage;
	}

	public void setSendmessage(Integer sendmessage) {
		this.sendmessage = sendmessage;
	}

	public String getGradeId() {
		return gradeId;
	}

	public void setGradeId(String gradeId) {
		this.gradeId = gradeId;
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

}
