package com.elong.hotel.hotelconfirm.examorder.bo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


import org.hibernate.validator.constraints.NotEmpty;

/**
 * 终拒同步hotel3操作Bo
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年5月15日 上午9:31:39   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class SyncHotel3ExamOrderOperatedBo implements Serializable{

	/** 
	 * long SyncHotel3ExamOrderOperatedBo.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 订单ID集合
	 */
	@NotEmpty(message = "orderIds is null.")
	private List<String> orderIds;
	
	/**
	 * 操作类型
	 */
	@NotEmpty(message = "opType is null.")
	private Integer opType;
	
	/**
	 * 员工姓名
	 */
	@NotEmpty(message = "staffName is null.")
	private String staffName;
	
	/**
	 * 操作人
	 */
	@NotEmpty(message = "operator is null.")
	private String operator;
	
	/**
	 * 操作时间
	 */
	@NotEmpty(message = "opTime is null.")
	private Date opTime;

	public List<String> getOrderIds() {
		return orderIds;
	}

	public void setOrderIds(List<String> orderIds) {
		this.orderIds = orderIds;
	}

	public Integer getOpType() {
		return opType;
	}

	public void setOpType(Integer opType) {
		this.opType = opType;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Date getOpTime() {
		return opTime;
	}

	public void setOpTime(Date opTime) {
		this.opTime = opTime;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	
}
