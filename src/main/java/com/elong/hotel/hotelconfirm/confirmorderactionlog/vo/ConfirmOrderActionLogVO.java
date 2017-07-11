package com.elong.hotel.hotelconfirm.confirmorderactionlog.vo;

import com.elong.hotel.common.parameter.PaginationParameter;

import java.util.Set;

/**
 * Created by Hualong.Li on 17/6/12.
 */
public class ConfirmOrderActionLogVO extends PaginationParameter {


	private Integer reserNo;

	private Integer logType;

	private Set<String> targetStatus;

	public ConfirmOrderActionLogVO() {
	}

	public ConfirmOrderActionLogVO(Integer reserNo, Integer logType, Set<String> targetStatus,String selectColumns,String orderField,String orderFieldType,Integer stratItem,Integer pageSize) {
		this.reserNo = reserNo;
		this.logType = logType;
		this.targetStatus = targetStatus;
		super.setOrderField(orderField);
		super.setOrderFieldType(orderFieldType);
		super.setStratItem(stratItem);
		super.setPageSize(pageSize);
		super.setSelectColumns(selectColumns);
	}

	public Integer getReserNo() {
		return reserNo;
	}

	public void setReserNo(Integer reserNo) {
		this.reserNo = reserNo;
	}

	public Integer getLogType() {
		return logType;
	}

	public void setLogType(Integer logType) {
		this.logType = logType;
	}

	public Set<String> getTargetStatus() {
		return targetStatus;
	}

	public void setTargetStatus(Set<String> targetStatus) {
		this.targetStatus = targetStatus;
	}
}
