package com.elong.hotel.proxy.javaorder.request;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年6月25日 下午2:37:13   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class ChangeOrderStatusToHRequest implements Serializable {

	/** 
	 * long ChangeOrderStatusToHRequest.java serialVersionUID
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
	 * 是否自动发送传真 可选
	 */
	private Boolean isAutoSendOrderFax;
	
	public ChangeOrderStatusToHRequest(){
		super();
	} 
	
	public ChangeOrderStatusToHRequest(Integer orderId, String operator, String opIp){
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

	public Boolean getIsAutoSendOrderFax() {
		return isAutoSendOrderFax;
	}

	public void setIsAutoSendOrderFax(Boolean isAutoSendOrderFax) {
		this.isAutoSendOrderFax = isAutoSendOrderFax;
	}
	
}
