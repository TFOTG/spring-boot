package com.elong.hotel.hotelconfirm.cancelorder.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

/**
 * 删除订单参数类
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年9月6日 上午8:41:32   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class DeleteOrderByStaffRequest implements Serializable{

	/** 
	 * long DeleteOrderRequest.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 订单ID
	 */
	@NotNull(message = "reserNo is null.")
	private Integer reserNo;
	
	/**
	 * 操作类型
	 */
	@NotNull(message = "opType is null.")
	private Integer opType;

	public Integer getReserNo() {
		return reserNo;
	}

	public void setReserNo(Integer reserNo) {
		this.reserNo = reserNo;
	}

	public Integer getOpType() {
		return opType;
	}

	public void setOpType(Integer opType) {
		this.opType = opType;
	}
	
}
