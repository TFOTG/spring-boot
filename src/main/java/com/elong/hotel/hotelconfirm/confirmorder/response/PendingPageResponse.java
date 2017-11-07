/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.hotelconfirm.confirmorder.response.PendingCountResponse.java]
 * Createion [2017年7月10日]
 */
package com.elong.hotel.hotelconfirm.confirmorder.response;

import java.util.List;

import com.elong.hotel.hotelconfirm.confirmorder.po.PendingHotelPo;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class PendingPageResponse {
	
	private List<PendingHotelPo> rslist;
	

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

	public List<PendingHotelPo> getRslist() {
		return rslist;
	}

	public void setRslist(List<PendingHotelPo> rslist) {
		this.rslist = rslist;
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
