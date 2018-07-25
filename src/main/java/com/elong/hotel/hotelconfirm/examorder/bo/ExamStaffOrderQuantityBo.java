package com.elong.hotel.hotelconfirm.examorder.bo;

import java.io.Serializable;

/**
 * 
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年6月1日 上午9:00:03   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class ExamStaffOrderQuantityBo implements Serializable{

	/** 
	 * long ExamStaffOrderQuantityBo.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 终拒优先级
	 */
	private Integer priority;
	
	/**
	 * 数量
	 */
	private Integer quantity;

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
