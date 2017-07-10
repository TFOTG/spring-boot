/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.confirmorder.response.PendingResponse.java]
 * Createion [2017年6月27日]
 */
package com.elong.hotel.hotelconfirm.confirmorder.response;

import com.elong.hotel.common.response.ServiceResponseBase;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class PendingResponse extends ServiceResponseBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Object data;
	
	/**
	 * 马上到店订单数量
	 */
	private int msCount;
	
	/**
	 * 暂缓订单数量
	 */
	private int zhCount;
	
	/**
	 * 暂缓到期订单数量
	 */
	private int djCount;
	
	/**
	 * 待处理订单数量
	 */
	private int  dclCount;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public int getMsCount() {
		return msCount;
	}

	public void setMsCount(int msCount) {
		this.msCount = msCount;
	}

	public int getZhCount() {
		return zhCount;
	}

	public void setZhCount(int zhCount) {
		this.zhCount = zhCount;
	}

	public int getDjCount() {
		return djCount;
	}

	public void setDjCount(int djCount) {
		this.djCount = djCount;
	}

	public int getDclCount() {
		return dclCount;
	}

	public void setDclCount(int dclCount) {
		this.dclCount = dclCount;
	}
}
