package com.elong.hotel.log.specialorder.po;

import java.io.Serializable;
import java.util.Date;

import com.elong.hotel.log.specialorder.bo.SpecialOrderOpLogBo;

/**
 * 特岗操作日志PO
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年8月28日 上午8:10:45   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class SpecialOrderOpLogPo implements Serializable{

	/** 
	 * long SpecialOrderOpLogPo.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	private Long id;
	
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
	
	public SpecialOrderOpLogPo(){
		super();
	}

	public SpecialOrderOpLogPo(SpecialOrderOpLogBo bo){
		super();
		this.reserNo = bo.getReserNo();
		this.checkInDate = bo.getCheckInDate();
		this.checkOutDate = bo.getCheckOutDate();
		this.reserType = bo.getReserType();
		this.isDirectSign = bo.getIsDirectSign();
		this.department = bo.getDepartment();
		this.priority = bo.getPriority();
		this.sourceStatus = bo.getSourceStatus();
		this.targetStatus = bo.getTargetStatus();
		this.opType = bo.getOpType();
		this.operator = bo.getOperator();
		this.opDate = bo.getOpDate();
		this.opIp = bo.getOpIp();
		this.enterTime = bo.getEnterTime();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
