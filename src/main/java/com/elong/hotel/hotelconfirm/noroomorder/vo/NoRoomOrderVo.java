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
	 * ivr外呼状态集合
	 */
	private List<Integer> ivrStatuses;

	/**
	 * ivr外呼状态
	 */
	private Integer ivrStatus;
	/**
	 * 订单id集合
	 */
	private List<Integer> orderIds;
	/**
	 * ivr外呼次数
	 */
	private Integer ivrAddCount;

	/**
	 * 订单id
	 */
	private Integer orderId;

	/**
	 * ivr外呼guid
	 */
	private String ivrGuid;

	/**
	 * 是否校验EB处理状态
	 */
	private Integer checkEBStatus;

	private Integer ebookingStatus;

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

	/**
	 * 检查能否外呼
	 */
	private Integer checkEnableCalling;

	/**
	 * 操作人
	 */
	private String operator;

	/**
	 * 操作时间
	 */
	private Date operateTime;

	/**
	 * 是否为马上到店
	 */
	private Integer checkImmedatelies;

	/**
	 * 起始数
	 */
	private int start;

	/**
	 * 酒店ID集合
	 */
	private List<String> hotelIds;

	/**
	 * 当前页
	 */
	private int page;

	/**
	 * 页面筛选
	 */
	private List<Integer> selectIvrStatuses;

	/**
	 * 筛选条件
	 */
	private Integer selectEbookingStatus;

	/**
	 * 筛选条件
	 */
	private String selectOrderStatus;

	public NoRoomOrderVo() {
		super();
	}

	public NoRoomOrderVo(String hotelId, List<String> reserStatuses, List<Integer> ivrStatuses, Integer checkEBStatus,
			Integer checkStaffDealedStatus, Integer ivrCount, Date arriveStartTime, Date arriveEndTime, int size,
			Integer checkEnableCalling) {
		super();
		this.hotelId = hotelId;
		this.reserStatuses = reserStatuses;
		this.ivrStatuses = ivrStatuses;
		this.checkEBStatus = checkEBStatus;
		this.checkStaffDealedStatus = checkStaffDealedStatus;
		this.ivrCount = ivrCount;
		this.arriveStartTime = arriveStartTime;
		this.arriveEndTime = arriveEndTime;
		this.size = size;
		this.checkEnableCalling = checkEnableCalling;
	}

	/**
	 * 员工待处理页面查询请求参数
	 * @param startTime 查询开始时间
	 * @param endTime 查询结束时间
	 * @param hotelIds 酒店ID集合
	 * @param orderId 订单ID
	 * @param selectIvrStatuses ivr状态
	 * @param checkImmedatelies 是否到店
	 * @param page 页码
	 * @param size 每页条数（酒店数）
	 */
	public NoRoomOrderVo(Date startTime, Date endTime, List<String> hotelIds,
			Integer orderId, List<Integer> selectIvrStatuses, Integer checkImmedatelies, Integer selectEbookingStatus,
			String selectOrderStatus, int page, int size) {
		super();
		this.arriveStartTime = startTime;
		this.arriveEndTime = endTime;
		this.hotelIds = hotelIds;
		this.orderId = orderId;
		this.selectIvrStatuses = selectIvrStatuses;
		this.checkImmedatelies = checkImmedatelies;
		this.selectEbookingStatus = selectEbookingStatus;
		this.selectOrderStatus = selectOrderStatus;
		this.page = page;
		this.size = size;

	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public List<String> getReserStatuses() {
		return reserStatuses;
	}

	public void setReserStatuses(List<String> reserStatuses) {
		this.reserStatuses = reserStatuses;
	}

	public List<Integer> getIvrStatuses() {
		return ivrStatuses;
	}

	public void setIvrStatuses(List<Integer> ivrStatuses) {
		this.ivrStatuses = ivrStatuses;
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

	public Integer getIvrAddCount() {
		return ivrAddCount;
	}

	public void setIvrAddCount(Integer ivrAddCount) {
		this.ivrAddCount = ivrAddCount;
	}

	public String getIvrGuid() {
		return ivrGuid;
	}

	public void setIvrGuid(String ivrGuid) {
		this.ivrGuid = ivrGuid;
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

	public Integer getIvrCount() {
		return ivrCount;
	}

	public void setIvrCount(Integer ivrCount) {
		this.ivrCount = ivrCount;
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

	public Integer getCheckEnableCalling() {
		return checkEnableCalling;
	}

	public void setCheckEnableCalling(Integer checkEnableCalling) {
		this.checkEnableCalling = checkEnableCalling;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Date getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public Integer getCheckImmedatelies() {
		return checkImmedatelies;
	}

	public void setCheckImmedatelies(Integer checkImmedatelies) {
		this.checkImmedatelies = checkImmedatelies;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getEbookingStatus() {
		return ebookingStatus;
	}

	public void setEbookingStatus(Integer ebookingStatus) {
		this.ebookingStatus = ebookingStatus;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public List<String> getHotelIds() {
		return hotelIds;
	}

	public void setHotelIds(List<String> hotelIds) {
		this.hotelIds = hotelIds;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public List<Integer> getSelectIvrStatuses() {
		return selectIvrStatuses;
	}

	public void setSelectIvrStatuses(List<Integer> selectIvrStatuses) {
		this.selectIvrStatuses = selectIvrStatuses;
	}

	public Integer getSelectEbookingStatus() {
		return selectEbookingStatus;
	}

	public void setSelectEbookingStatus(Integer selectEbookingStatus) {
		this.selectEbookingStatus = selectEbookingStatus;
	}

	public String getSelectOrderStatus() {
		return selectOrderStatus;
	}

	public void setSelectOrderStatus(String selectOrderStatus) {
		this.selectOrderStatus = selectOrderStatus;
	}

}
