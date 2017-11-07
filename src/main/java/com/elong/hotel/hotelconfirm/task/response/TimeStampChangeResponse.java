/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.task.response.TimeStampChangeResponse.java]
 * Createion [2017年4月28日]
 */
package com.elong.hotel.hotelconfirm.task.response;

import java.util.ArrayList;
import java.util.List;

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

	private List<Integer> listOrderIds;

	public TimeStampChangeResponse() {
		listOrderIds = new ArrayList<>();
	}

	public int getProcessCount() {
		return processCount;
	}

	public void setProcessCount(int processCount) {
		this.processCount = processCount;
	}

	public List<Integer> getListOrderIds() {
		return listOrderIds;
	}

	public void setListOrderIds(List<Integer> listOrderIds) {
		this.listOrderIds = listOrderIds;
	}
	
	
	
}
