package com.elong.hotel.hotelconfirm.cancelorder.bo;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.elong.hotel.proxy.javaorder.getorder.Order;

/**
 * 待处理取消单BO
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年9月4日 上午9:02:31   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class PendingCancelOrderBo implements Serializable{

	/** 
	 * long PendingCancelOrderBo.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
    /**
     * 订单号
     */
    private Integer reserNo;
    /**
     * 订单状态
     */
    private String reserStatus;
    /**
     * 入住日
     */
    @JSONField(format = "yyyy-MM-dd")
    private Date arriveDate;
    /**
     * 离店日
     */
    @JSONField(format = "yyyy-MM-dd")
    private Date leaveDate;
    /**
     * 入库时间
     */
    private Date enterTime;
    /**
     * hotelId
     */
    private String sHotelId;
    /**
     * 酒店名称
     */
    private String hotelName;
    /**
     * 担保预付，1：预付，2：担保
     */
    private Integer orderPayType;
    /**
     * 可取消时间点，此时间点之后不能免费取消
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date canCancelTime;
    /**
     * 是否直连
     */
    private Integer isDC;

    /**
     * 是否艺龙直签
     */
    private Integer isElongOrder;

    /**
     * 供应商OTA类型
     */
    private Integer supplierOtaType;

    /**
     * 是否供应商订单
     */
    private Integer isSupplier;
    /**
     * 供应商Id
     */
    private String supplierId;

    /**
     * 供应商名称
     */
    private String supplierName;

    /**
     * 置为取消状态时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date cancelTime;
    
    /**
     * 订单信息
     */
    private Order order;

	public Integer getReserNo() {
		return reserNo;
	}

	public void setReserNo(Integer reserNo) {
		this.reserNo = reserNo;
	}

	public String getReserStatus() {
		return reserStatus;
	}

	public void setReserStatus(String reserStatus) {
		this.reserStatus = reserStatus;
	}

	public Date getArriveDate() {
		return arriveDate;
	}

	public void setArriveDate(Date arriveDate) {
		this.arriveDate = arriveDate;
	}

	public Date getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}

	public Date getEnterTime() {
		return enterTime;
	}

	public void setEnterTime(Date enterTime) {
		this.enterTime = enterTime;
	}

	public String getsHotelId() {
		return sHotelId;
	}

	public void setsHotelId(String sHotelId) {
		this.sHotelId = sHotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public Integer getOrderPayType() {
		return orderPayType;
	}

	public void setOrderPayType(Integer orderPayType) {
		this.orderPayType = orderPayType;
	}

	public Date getCanCancelTime() {
		return canCancelTime;
	}

	public void setCanCancelTime(Date canCancelTime) {
		this.canCancelTime = canCancelTime;
	}

	public Integer getIsDC() {
		return isDC;
	}

	public void setIsDC(Integer isDC) {
		this.isDC = isDC;
	}

	public Integer getIsElongOrder() {
		return isElongOrder;
	}

	public void setIsElongOrder(Integer isElongOrder) {
		this.isElongOrder = isElongOrder;
	}

	public Integer getSupplierOtaType() {
		return supplierOtaType;
	}

	public void setSupplierOtaType(Integer supplierOtaType) {
		this.supplierOtaType = supplierOtaType;
	}

	public Integer getIsSupplier() {
		return isSupplier;
	}

	public void setIsSupplier(Integer isSupplier) {
		this.isSupplier = isSupplier;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public Date getCancelTime() {
		return cancelTime;
	}

	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
