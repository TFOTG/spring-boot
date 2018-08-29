package com.elong.hotel.log.specialorder.bo;

import java.io.Serializable;
import java.util.Date;

import com.elong.hotel.common.bo.OperatorInfoBo;
import com.elong.hotel.hotelconfirm.cancelorder.bo.CancelOrderBo;
import com.elong.hotel.hotelconfirm.group.enums.DepartmentEnum;
import com.elong.hotel.hotelconfirm.specialorder.bo.SpecialOrderBo;
import com.elong.hotel.log.specialorder.enums.SpecialOrderOpLogEnum;

public class SpecialOrderOpLogBo implements Serializable{

	/** 
	 * long SpecialOrderOpLogBo.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 订单ID
	 */
	private Integer reserNo;
	
	/**
	 * 入住日期
	 */
	private Date checkInDate;
	
	/**
	 * 离店日期
	 */
	private Date checkOutDate;
	
	/**
	 * 订单类型
	 */
	private Integer reserType;
	
	/**
	 * 是否直签
	 */
	private Integer isDirectSign;
	
	/**
	 * 部门
	 */
	private Integer department;
	
	/**
	 * 优先级
	 */
	private Integer priority; 
	
	/**
	 * 原状态
	 */
	private String 	sourceStatus;
	
	/**
	 * 目标状态
	 */
	private String targetStatus;
	
	/**
	 * 操作类型
	 */
	private Integer opType;
	
	/**
	 * 操作人
	 */
	private String operator;
	
	/**
	 * 操作日期
	 */
	private Date opDate;
	
	/**
	 * 操作IP
	 */
	private String opIp;
	
	/**
	 * 入库时间
	 */
	private Date enterTime;
		
	
	public SpecialOrderOpLogBo() {
		super();
	}
	
	/**
	 * 取消库操作日志
	 *   
	 * @param cancelOrderBo 
	 * @param vouchType
	 * @param opLogType
	 * @param sourceStatus
	 * @param targetStatus
	 * @param operator
	 */
	public SpecialOrderOpLogBo(CancelOrderBo cancelOrderBo, int vouchType, SpecialOrderOpLogEnum opLogType, String sourceStatus, String targetStatus, OperatorInfoBo operator) {
		this.reserNo = cancelOrderBo.getReserNo();
		this.checkInDate = cancelOrderBo.getArriveDate();
		this.checkOutDate = cancelOrderBo.getLeaveDate();
		this.reserType = vouchType;
		this.department = DepartmentEnum.Cancel.getKey();
		this.isDirectSign = cancelOrderBo.getIsElongOrder();
		this.sourceStatus = sourceStatus;
		this.targetStatus = targetStatus;
		this.opType = opLogType.getKey();
		this.operator = operator.getOperatorName();
		this.opDate = operator.getOperatorTime();
		this.opIp = operator.getOperatorIP();
		this.enterTime = cancelOrderBo.getEnterTime();
	}
	
	/**
	 * 新单库操作日志
	 *   
	 * @param specialOrderBo
	 * @param opLogType
	 * @param sourceStatus
	 * @param targetStatus
	 * @param operator
	 */
	public SpecialOrderOpLogBo(SpecialOrderBo specialOrderBo, SpecialOrderOpLogEnum opLogType, String sourceStatus, String targetStatus, OperatorInfoBo operator, int vouchType){
		this.reserNo = specialOrderBo.getReserNo();
		this.checkInDate = specialOrderBo.getArriveDate();
		this.checkOutDate = specialOrderBo.getLeaveDate();
		this.reserType = vouchType;
		this.priority = specialOrderBo.getArriveType();
		this.department = DepartmentEnum.Special.getKey();
		this.sourceStatus = sourceStatus;
		this.targetStatus = targetStatus;
		this.opType = opLogType.getKey();
		this.operator = operator.getOperatorName();
		this.opDate = operator.getOperatorTime();
		this.opIp = operator.getOperatorIP();
		this.enterTime = specialOrderBo.getEnterTime();
	}

	public Integer getReserNo() {
		return reserNo;
	}

	public void setReserNo(Integer reserNo) {
		this.reserNo = reserNo;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public Integer getReserType() {
		return reserType;
	}

	public void setReserType(Integer reserType) {
		this.reserType = reserType;
	}

	public Integer getIsDirectSign() {
		return isDirectSign;
	}

	public void setIsDirectSign(Integer isDirectSign) {
		this.isDirectSign = isDirectSign;
	}

	public Integer getDepartment() {
		return department;
	}

	public void setDepartment(Integer department) {
		this.department = department;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getSourceStatus() {
		return sourceStatus;
	}

	public void setSourceStatus(String sourceStatus) {
		this.sourceStatus = sourceStatus;
	}

	public String getTargetStatus() {
		return targetStatus;
	}

	public void setTargetStatus(String targetStatus) {
		this.targetStatus = targetStatus;
	}

	public Integer getOpType() {
		return opType;
	}

	public void setOpType(Integer opType) {
		this.opType = opType;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Date getOpDate() {
		return opDate;
	}

	public void setOpDate(Date opDate) {
		this.opDate = opDate;
	}

	public String getOpIp() {
		return opIp;
	}

	public void setOpIp(String opIp) {
		this.opIp = opIp;
	}

	public Date getEnterTime() {
		return enterTime;
	}

	public void setEnterTime(Date enterTime) {
		this.enterTime = enterTime;
	}
	
}
