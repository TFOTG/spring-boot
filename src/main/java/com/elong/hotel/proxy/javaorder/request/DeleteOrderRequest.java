package com.elong.hotel.proxy.javaorder.request;

import java.io.Serializable;
import java.util.Date;

/**
 * 删除订单参数类
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年9月6日 上午8:23:29   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class DeleteOrderRequest implements Serializable{

	/** 
	 * long DeleteOrderRequest.java serialVersionUID
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
	 * 删除原因id
	 */
	private int deleteReasonId;
	
	/**
	 * 删除原因
	 */
	private String deleteReason;
	
	public DeleteOrderRequest() {
		super();
	}
	
	public DeleteOrderRequest(Integer reserNo, int deleteReasonId, String deleteReason, String staffName, String opIp){
		super();
		this.orderId = reserNo;
		this.businessSystemId = 0;
		this.deleteReasonId = deleteReasonId;
		this.deleteReason = deleteReason;
		this.operatorInfo = new OperatorInfo();
		this.operatorInfo.setOperatorName(staffName);
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
	
	public int getDeleteReasonId() {
		return deleteReasonId;
	}
	
	public void setDeleteReasonId(int deleteReasonId) {
		this.deleteReasonId = deleteReasonId;
	}
	
	public String getDeleteReason() {
		return deleteReason;
	}
	
	public void setDeleteReason(String deleteReason) {
		this.deleteReason = deleteReason;
	}
	
}
