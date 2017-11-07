/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.ranksetting.RankSettingResponse.java]
 * Createion [2017年6月2日]
 */
package com.elong.hotel.hotelconfirm.ranksetting.response;

import com.elong.hotel.common.response.ServiceResponseBase;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class RankSettingResponse extends ServiceResponseBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	

}
