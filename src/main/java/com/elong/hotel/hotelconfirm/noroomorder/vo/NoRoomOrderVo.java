package com.elong.hotel.hotelconfirm.noroomorder.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年9月1日 上午9:50:02   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class NoRoomOrderVo implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 酒店ID
	 */
	private String hotelId;

	/**
	 * 订单状态集合
	 */
	private List<String> reserStatuses;

	/**
	 * ivr外呼状态
	 */
	private List<Integer> ivrStatuses;

	/**
	 * 是否校验EB处理状态
	 */
	private Integer checkEBStatus;

	/**
	 * 是否校验人工处理状态
	 */
	private Integer checkStaffDealedStatus;

	/**
	 * ivr外呼计数
	 */
	private Integer ivrCount;

	/**
	 * 查询到店开始时间
	 */
	private Date arriveStartTime;

	/**
	 * 查询到店结束时间
	 */
	private Date arriveEndTime;

	/**
	 * 查询总数
	 */
	private int size;

	public List<String> getReserStatuses() {
		return reserStatuses;
	}

	public void setReserStatuses(List<String> reserStatuses) {
		this.reserStatuses = reserStatuses;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public List<Integer> getIvrStatuses() {
		return ivrStatuses;
	}

	public void setIvrStatuses(List<Integer> ivrStatuses) {
		this.ivrStatuses = ivrStatuses;
	}

	public Integer getCheckEBStatus() {
		return checkEBStatus;
	}

	public void setCheckEBStatus(Integer checkEBStatus) {
		this.checkEBStatus = checkEBStatus;
	}

	public Integer getCheckStaffDealedStatus() {
		return checkStaffDealedStatus;
	}

	public void setCheckStaffDealedStatus(Integer checkStaffDealedStatus) {
		this.checkStaffDealedStatus = checkStaffDealedStatus;
	}

	public Date getArriveStartTime() {
		return arriveStartTime;
	}

	public void setArriveStartTime(Date arriveStartTime) {
		this.arriveStartTime = arriveStartTime;
	}

	public Date getArriveEndTime() {
		return arriveEndTime;
	}

	public void setArriveEndTime(Date arriveEndTime) {
		this.arriveEndTime = arriveEndTime;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Integer getIvrCount() {
		return ivrCount;
	}

	public void setIvrCount(Integer ivrCount) {
		this.ivrCount = ivrCount;
	}

}
