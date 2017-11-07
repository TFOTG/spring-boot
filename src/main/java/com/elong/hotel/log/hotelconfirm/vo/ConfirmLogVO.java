/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.confirmlog.vo.ConfirmLogVO.java]
 * Createion [2017年4月28日]
 */
package com.elong.hotel.log.hotelconfirm.vo;

import com.elong.hotel.common.parameter.PaginationParameter;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class ConfirmLogVO extends PaginationParameter{

	private int logtype;
	
	private String relationid;

	public int getLogtype() {
		return logtype;
	}

	public void setLogtype(int logtype) {
		this.logtype = logtype;
	}

	public String getRelationid() {
		return relationid;
	}

	public void setRelationid(String relationid) {
		this.relationid = relationid;
	}
	
	
}
