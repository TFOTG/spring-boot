/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.task.response.TimeStampChangeResponse.java]
 * Createion [2017年4月28日]
 */
package com.elong.hotel.hotelconfirm.task.response;

import com.elong.hotel.common.response.ServiceResponseBase;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class TimeStampChangeResponse extends ServiceResponseBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int processCount;

	public int getProcessCount() {
		return processCount;
	}

	public void setProcessCount(int processCount) {
		this.processCount = processCount;
	}
	
	
	
}
