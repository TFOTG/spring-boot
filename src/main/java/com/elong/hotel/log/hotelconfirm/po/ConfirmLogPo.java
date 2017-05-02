/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.confirmlog.po.ConfirmLogPo.java]
 * Createion [2017年4月28日]
 */
package com.elong.hotel.log.hotelconfirm.po;

import java.util.Date;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class ConfirmLogPo {

	private Long id;

	private Long relationId;

	private Integer logType;

	private Long dateParameter;

	private String operator;

	private String operatorIp;

	private Date opdate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRelationId() {
		return relationId;
	}

	public void setRelationId(Long relationId) {
		this.relationId = relationId;
	}

	public Integer getLogType() {
		return logType;
	}

	public void setLogType(Integer logType) {
		this.logType = logType;
	}

	public Long getDateParameter() {
		return dateParameter;
	}

	public void setDateParameter(Long dateParameter) {
		this.dateParameter = dateParameter;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperatorIp() {
		return operatorIp;
	}

	public void setOperatorIp(String operatorIp) {
		this.operatorIp = operatorIp;
	}

	public Date getOpdate() {
		return opdate;
	}

	public void setOpdate(Date opdate) {
		this.opdate = opdate;
	}
	
}
