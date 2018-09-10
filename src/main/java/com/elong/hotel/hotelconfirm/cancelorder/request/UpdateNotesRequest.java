package com.elong.hotel.hotelconfirm.cancelorder.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;


/**
 * 批量更新订单内部陪住参数类
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年9月5日 上午8:55:31   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class UpdateNotesRequest implements Serializable{

	/** 
	 * long BatchUpdateNotesRequest.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 订单ID
	 */
	@NotNull(message = "reserNo is null.")
	private Integer reserNo;
	
	/**
	 * 备注信息
	 */
	@NotNull(message = "notes is null.")
	private String notes;

	public Integer getReserNo() {
		return reserNo;
	}

	public void setReserNo(Integer reserNo) {
		this.reserNo = reserNo;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}
