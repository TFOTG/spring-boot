/**
 * ProjectName [confirm-api]
 * FileName [com.elong.hotel.db.DataBackUpResponse.java]
 * Createion [2017年5月15日]
 */
package com.elong.hotel.storage.response;

import com.elong.hotel.common.response.ServiceResponseBase;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class DataBackUpResponse extends ServiceResponseBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int proSize ;

	private String failId;

	private String failReason;

	private String sql;

	public int getProSize() {
		return proSize;
	}

	public void setProSize(int proSize) {
		this.proSize = proSize;
	}

	public String getFailId() {
		return failId;
	}

	public void setFailId(String failId) {
		this.failId = failId;
	}

	public String getFailReason() {
		return failReason;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}
}
