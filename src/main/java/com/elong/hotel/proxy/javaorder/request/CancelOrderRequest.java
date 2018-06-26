package com.elong.hotel.proxy.javaorder.request;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年6月25日 下午2:41:53   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class CancelOrderRequest implements Serializable{

	/** 
	 * long CancelOrderRequest.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 订单ID 必传
	 */
	private Integer orderId;
	
	/**
	 * 业务来源 0:Mis 必传
	 */
	private Integer businessSystemId;
	
	/**
	 * 操作人信息 必传
	 */
	private OperatorInfo operatorInfo;
	
	/**
	 * 满房处理意见 可选
	 */
	private String fullRoomNotes;
	
	/**
	 * 满房处理其他信息 可选
	 */
	private String fullRoomOther;
	
	/**
	 * 客人罚金 可选
	 */
	private BigDecimal penaltyToCustomer;
	
	/**
	 * 酒店赔偿金 可选
	 */
	private BigDecimal compensationToHotel;
	
	/**
	 * 取消原因 特殊满房 31，满房 30 变价 32 可选
	 */
	private Integer changeReasonId;
	
	/**
	 * 取消原因
	 */
	private String changeReason;
	
	/**
	 * 是否行程无忧
	 */
	private Boolean isFreeTravel;
	
	public CancelOrderRequest(){
		super();
	}
	
	public CancelOrderRequest(Integer orderId, String operator, String opIp){
		super();
		this.orderId = orderId;
		this.businessSystemId = 0;
		this.operatorInfo = new OperatorInfo();
		this.operatorInfo.setOperatorName(operator);
		this.operatorInfo.setOperatorIP(opIp);
		this.operatorInfo.setOperatorTime(new Date());
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getBusinessSystemId() {
		return businessSystemId;
	}

	public void setBusinessSystemId(Integer businessSystemId) {
		this.businessSystemId = businessSystemId;
	}

	public OperatorInfo getOperatorInfo() {
		return operatorInfo;
	}

	public void setOperatorInfo(OperatorInfo operatorInfo) {
		this.operatorInfo = operatorInfo;
	}

	public String getFullRoomNotes() {
		return fullRoomNotes;
	}

	public void setFullRoomNotes(String fullRoomNotes) {
		this.fullRoomNotes = fullRoomNotes;
	}

	public String getFullRoomOther() {
		return fullRoomOther;
	}

	public void setFullRoomOther(String fullRoomOther) {
		this.fullRoomOther = fullRoomOther;
	}

	public BigDecimal getPenaltyToCustomer() {
		return penaltyToCustomer;
	}

	public void setPenaltyToCustomer(BigDecimal penaltyToCustomer) {
		this.penaltyToCustomer = penaltyToCustomer;
	}

	public BigDecimal getCompensationToHotel() {
		return compensationToHotel;
	}

	public void setCompensationToHotel(BigDecimal compensationToHotel) {
		this.compensationToHotel = compensationToHotel;
	}

	public Integer getChangeReasonId() {
		return changeReasonId;
	}

	public void setChangeReasonId(Integer changeReasonId) {
		this.changeReasonId = changeReasonId;
	}

	public String getChangeReason() {
		return changeReason;
	}

	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}

	public Boolean getIsFreeTravel() {
		return isFreeTravel;
	}

	public void setIsFreeTravel(Boolean isFreeTravel) {
		this.isFreeTravel = isFreeTravel;
	}
	
}
