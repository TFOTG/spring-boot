/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.ranksetting.po.RejectSupplierIdPo.java]
 * Createion [2017年6月8日]
 */
package com.elong.hotel.common.config;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class RejectSupplierIdConfig implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String operatorName;
	
	private String operatorTime;
	
	@NotBlank
	@Length(min=1,message="供应商id不能为空")
	private String supplierIds;
	
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

	public String getSupplierIds() {
		return supplierIds;
	}

	public void setSupplierIds(String supplierIds) {
		this.supplierIds = supplierIds;
	}

	public String getOperatorIp() {
		return operatorIp;
	}

	public void setOperatorIp(String operatorIp) {
		this.operatorIp = operatorIp;
	}
	
	
}
