package com.elong.hotel.hotelconfirm.noroomorder.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年8月31日 上午10:41:40   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class NoRoomIvrVo implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 订单状态集合
	 */
	private List<String> reserStatuses;

	/**
	 * ivr外呼状态(in)
	 */
	private List<Integer> ivrStatus;

	/**
	 * 记录数
	 */
	private Integer size;

	/**
	 * 查询开始时间
	 */
	private Date startTime;

	/**
	 * 查询结束时间
	 */
	private Date endTime;

	/**
	 * 外呼计数
	 */
	private Integer ivrCount;

	/**
	 * 检查能否开始外呼
	 */
	private Integer checkEnableCalling;

	/**
	 * 检查EB是否处理
	 */
	private Integer checkEBStatus;

	/**
	 * 检查人工是否处理
	 */
	private Integer checkStaffStatus;

	public NoRoomIvrVo() {
		super();
	}

	public NoRoomIvrVo(List<String> reserStatuses, List<Integer> ivrStatus, Integer size, Date startTime, Date endTime, Integer ivrCount,
			Integer checkEnableCalling, Integer checkEBStatus, Integer checkStaffStatus) {
		super();
		this.reserStatuses = reserStatuses;
		this.ivrStatus = ivrStatus;
		this.size = size;
		this.startTime = startTime;
		this.endTime = endTime;
		this.ivrCount = ivrCount;
		this.checkEnableCalling = checkEnableCalling;
		this.checkEBStatus = checkEBStatus;
		this.checkStaffStatus = checkStaffStatus;
	}

	public List<String> getReserStatuses() {
		return reserStatuses;
	}

	public void setReserStatuses(List<String> reserStatuses) {
		this.reserStatuses = reserStatuses;
	}

	public List<Integer> getIvrStatus() {
		return ivrStatus;
	}

	public void setIvrStatus(List<Integer> ivrStatus) {
		this.ivrStatus = ivrStatus;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getIvrCount() {
		return ivrCount;
	}

	public void setIvrCount(Integer ivrCount) {
		this.ivrCount = ivrCount;
	}

	public Integer getCheckEnableCalling() {
		return checkEnableCalling;
	}

	public void setCheckEnableCalling(Integer checkEnableCalling) {
		this.checkEnableCalling = checkEnableCalling;
	}

	public Integer getCheckEBStatus() {
		return checkEBStatus;
	}

	public void setCheckEBStatus(Integer checkEBStatus) {
		this.checkEBStatus = checkEBStatus;
	}

	public Integer getCheckStaffStatus() {
		return checkStaffStatus;
	}

	public void setCheckStaffStatus(Integer checkStaffStatus) {
		this.checkStaffStatus = checkStaffStatus;
	}

}
