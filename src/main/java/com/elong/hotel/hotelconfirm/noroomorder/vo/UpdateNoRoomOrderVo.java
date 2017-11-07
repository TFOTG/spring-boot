package com.elong.hotel.hotelconfirm.noroomorder.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年9月4日 下午2:57:03   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class UpdateNoRoomOrderVo implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 订单ID集合
	 */
	private List<Integer> orderIds;

	/**
	 * ivr外呼状态
	 */
	private Integer ivrStatus;

	/**
	 * 是否更新外呼计数
	 */
	private Integer isUpdateCount;

	/**
	 * 酒店ID
	 */
	private Integer hotelId;

	/**
	 * 当前时间
	 */
	private Date currentTime;

	/**
	 * 延时次数
	 */
	private Integer delayCount;

	/**
	 * 查询开始时间
	 */
	private Date startTime;

	/**
	 * 查询结束时间
	 */
	private Date endTime;

	/**
	 * ivr外呼状态
	 */
	private List<Integer> ivrStatuses;

	/**
	 * ivr外呼计数
	 */
	private Integer ivrCount;

	/**
	 * 延时时间（单位：分钟）
	 */
	private Integer delayTime;

	/**
	 * ivr外呼GUID
	 */
	private String ivrGuid;

	/**
	 * 外呼酒店电话
	 */
	private String callingHotelPhone;

	public UpdateNoRoomOrderVo() {
		super();
	}

	/**
	 * 更新外呼延迟时间，延迟计数累计construction
	 * @param orderIds
	 * @param hotelId
	 * @param currentTime
	 * @param delayCount
	 */
	public UpdateNoRoomOrderVo(List<Integer> orderIds, Integer hotelId, Date currentTime, Integer delayCount, Date startTime, Date endTime,
			List<Integer> ivrStatuses, Integer ivrCount, Integer delayTime) {
		super();
		this.orderIds = orderIds;
		this.hotelId = hotelId;
		this.currentTime = currentTime;
		this.delayCount = delayCount;
		this.startTime = startTime;
		this.endTime = endTime;
		this.ivrStatuses = ivrStatuses;
		this.ivrCount = ivrCount;
		this.delayTime = delayTime;
	}

	/**
	 * 更新外呼状态，外呼计数construction
	 * @param orderIds
	 * @param ivrStatus
	 * @param isUpdateCount
	 */
	public UpdateNoRoomOrderVo(List<Integer> orderIds, Integer ivrStatus, Integer isUpdateCount, String ivrGuid, String callingHotelPhone) {
		super();
		this.orderIds = orderIds;
		this.ivrStatus = ivrStatus;
		this.isUpdateCount = isUpdateCount;
		this.ivrGuid = ivrGuid;
		this.callingHotelPhone = callingHotelPhone;
	}

	public List<Integer> getOrderIds() {
		return orderIds;
	}

	public void setOrderIds(List<Integer> orderIds) {
		this.orderIds = orderIds;
	}

	public Integer getIvrStatus() {
		return ivrStatus;
	}

	public void setIvrStatus(Integer ivrStatus) {
		this.ivrStatus = ivrStatus;
	}

	public Integer getIsUpdateCount() {
		return isUpdateCount;
	}

	public void setIsUpdateCount(Integer isUpdateCount) {
		this.isUpdateCount = isUpdateCount;
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public Date getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(Date currentTime) {
		this.currentTime = currentTime;
	}

	public Integer getDelayCount() {
		return delayCount;
	}

	public void setDelayCount(Integer delayCount) {
		this.delayCount = delayCount;
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

	public List<Integer> getIvrStatuses() {
		return ivrStatuses;
	}

	public void setIvrStatuses(List<Integer> ivrStatuses) {
		this.ivrStatuses = ivrStatuses;
	}

	public Integer getIvrCount() {
		return ivrCount;
	}

	public void setIvrCount(Integer ivrCount) {
		this.ivrCount = ivrCount;
	}

	public Integer getDelayTime() {
		return delayTime;
	}

	public void setDelayTime(Integer delayTime) {
		this.delayTime = delayTime;
	}

	public String getIvrGuid() {
		return ivrGuid;
	}

	public void setIvrGuid(String ivrGuid) {
		this.ivrGuid = ivrGuid;
	}

	public String getCallingHotelPhone() {
		return callingHotelPhone;
	}

	public void setCallingHotelPhone(String callingHotelPhone) {
		this.callingHotelPhone = callingHotelPhone;
	}

}
