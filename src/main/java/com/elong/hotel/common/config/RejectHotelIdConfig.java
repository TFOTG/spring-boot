/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.common.config.RejectHotelIdConfig.java]
 * Createion [2017年11月2日]
 */
package com.elong.hotel.common.config;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class RejectHotelIdConfig implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String operatorName;
	
	private String operatorTime;
	
	@NotBlank
	@Length(min=1,message="酒店id不能为空")
	private String hotelIds;
	
	private String operatorIp;

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getOperatorTime() {
		return operatorTime;
	}

	public void setOperatorTime(String operatorTime) {
		this.operatorTime = operatorTime;
	}

	public String getHotelIds() {
		return hotelIds;
	}

	public void setHotelIds(String hotelIds) {
		this.hotelIds = hotelIds;
	}

	public String getOperatorIp() {
		return operatorIp;
	}

	public void setOperatorIp(String operatorIp) {
		this.operatorIp = operatorIp;
	}
}
