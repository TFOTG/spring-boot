/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.task.response.ConfirmLogTaskResponse.java]
 * Createion [2017年4月28日]
 */
package com.elong.hotel.hotelconfirm.task.response;

import com.elong.hotel.common.response.ServiceResponseBase;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class ConfirmLogTaskResponse extends ServiceResponseBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private int processSize;


	public int getProcessSize() {
		return processSize;
	}


	public void setProcessSize(int processSize) {
		this.processSize = processSize;
	}
	
	
}
