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
 * 2018年6月25日 下午4:06:27   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class UpdateOrderNotesToHotelRequest implements Serializable{

	/** 
	 * long UpdateOrderNotesToHotelRequest.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 订单ID 必传
	 */
	private Integer orderId;
	
	/**
	 * 酒店备注 必传
	 */
	private String notesToHotel;
	
	/**
	 * 是否拼接 必传
	 */
	private Boolean isAppend;
	
	/**
	 * 操作人信息 必传
	 */
	private OperatorInfo operator;
	
	public UpdateOrderNotesToHotelRequest(){
		super();
	}
	
	public UpdateOrderNotesToHotelRequest(Integer orderId, String notes, String opeator, String opIp){
		super();
		this.orderId = orderId;
		this.notesToHotel = notes;
		this.operator = new OperatorInfo();
		this.operator.setOperatorName(opeator);
		this.operator.setOperatorIP(opIp);
		this.operator.setOperatorTime(new Date());
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getNotesToHotel() {
		return notesToHotel;
	}

	public void setNotesToHotel(String notesToHotel) {
		this.notesToHotel = notesToHotel;
	}

	public Boolean getIsAppend() {
		return isAppend;
	}

	public void setIsAppend(Boolean isAppend) {
		this.isAppend = isAppend;
	}

	public OperatorInfo getOperator() {
		return operator;
	}

	public void setOperator(OperatorInfo operator) {
		this.operator = operator;
	}
	 
}
