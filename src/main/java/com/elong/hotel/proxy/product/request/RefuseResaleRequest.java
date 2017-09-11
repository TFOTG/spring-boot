/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.proxy.product.request.RefuseResaleRequest.java]
 * Createion [2017年9月6日]
 */
package com.elong.hotel.proxy.product.request;

import javax.validation.constraints.NotNull;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class RefuseResaleRequest {

	//reserNo是订单好，type为C是取消，为H是恢复，Operator操作人，OperateIp操作IP
	@NotNull(message="订单号不能为空")
	private Integer reserNo;
	
	@NotNull(message="更改类型不能为空")
	private String type;
	
	private  String Operator;
	
	private String OperatrIp;

	public Integer getReserNo() {
		return reserNo;
	}

	public void setReserNo(Integer reserNo) {
		this.reserNo = reserNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOperator() {
		return Operator;
	}

	public void setOperator(String operator) {
		Operator = operator;
	}

	public String getOperatrIp() {
		return OperatrIp;
	}

	public void setOperatrIp(String operatrIp) {
		OperatrIp = operatrIp;
	}
	
	
}
