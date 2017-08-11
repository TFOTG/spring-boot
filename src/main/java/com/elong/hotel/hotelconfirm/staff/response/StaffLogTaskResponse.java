/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.staff.response.StaffLogTaskResponse.java]
 * Createion [2017年8月10日]
 */
package com.elong.hotel.hotelconfirm.staff.response;

import com.elong.hotel.common.response.ServiceResponseBase;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class StaffLogTaskResponse extends ServiceResponseBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Object dataCount;

	public Object getDataCount() {
		return dataCount;
	}

	public void setDataCount(Object dataCount) {
		this.dataCount = dataCount;
	}
	
	

}
