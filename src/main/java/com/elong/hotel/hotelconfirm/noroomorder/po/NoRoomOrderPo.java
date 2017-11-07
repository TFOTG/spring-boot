package com.elong.hotel.hotelconfirm.noroomorder.po;

import java.util.Date;

import com.elong.hotel.proxy.javaorder.getorder.Order;

/**
 *
 * 到店无房PO类
 *
 * <p>
 * 2017年8月30日 下午1:54:59   张大鹏     1.0    	初始化创建<br>
 * </p>
 *
 * @author		张大鹏
 * @version		1.0
 * @since		JDK1.7
 */
public class NoRoomOrderPo {

	/**
	 * 自增主键ID
	 */
	private long id;

	/**
	 * 订单ID
	 */
	private Integer reserNo;

	/**
	 * 订单状态
	 */
	private String reserStatus;

	/**
	 * 到店日期
	 */
	private Date arriveDate;

	/**
	 * 离店日期
	 */
	private Date leaveDate;

	/**
	 * 酒店ID
	 */
	private String hotelId;

	/**
	 * 酒店名称
	 */
	private String hotelName;

	/**
	 * 马上到店
	 */
	private Integer immediately;

	/**
	 * eb处理状态
	 */
	private Integer ebookingStatus;

	/**
	 * 员工处理状态
	 */
	private Integer staffStatus;

    /**
     * 员工处理时间
      */
    private Date staffResolveTime;

	/**
	 * ivr外呼状态
	 */
	private Integer ivrStatus;

	/**
	 * ivr外呼guid
	 */
	private String ivrGuid;

	/**
	 * 外呼开始时间
	 */
	private Date ivrStartTime;

	/**
	 * ivr外呼计数
	 */
	private Integer ivrCount;

	/**
	 * 操作人
	 */
	private String operator;

	/**
	 * 操作时间
	 */
	private Date operateTime;

	/**
	 * 入库时间
	 */
	private Date enterTime;

	/**
	 * 订单时间戳
	 */
	private long orderTimestampLong;

	/**
	 * 延时次数
	 */
	private Integer delayCount;

	/**
	 * 外呼酒店电话
	 */
	private String hotelPhone;

	public NoRoomOrderPo() {
	}

	public NoRoomOrderPo(Order order) {

		this.reserNo = order.getOrderId().intValue();
		this.reserStatus = order.getStatus();
		this.arriveDate = order.getCheckInDate();
		this.leaveDate = order.getCheckOutDate();
		this.hotelId = order.getHotelId();
		this.hotelName = order.getHotelName();
		this.enterTime = new Date();
		this.operateTime = new Date();
		this.operator = "system";
		this.orderTimestampLong = order.getOrderTimestamp().getTime();

	}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getReserNo() {
        return reserNo;
    }

    public void setReserNo(Integer reserNo) {
        this.reserNo = reserNo;
    }

    public String getReserStatus() {
        return reserStatus;
    }

    public void setReserStatus(String reserStatus) {
        this.reserStatus = reserStatus;
    }

    public Date getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(Date arriveDate) {
        this.arriveDate = arriveDate;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Integer getImmediately() {
        return immediately;
    }

    public void setImmediately(Integer immediately) {
        this.immediately = immediately;
    }

    public Integer getEbookingStatus() {
        return ebookingStatus;
    }

    public void setEbookingStatus(Integer ebookingStatus) {
        this.ebookingStatus = ebookingStatus;
    }

    public Integer getStaffStatus() {
        return staffStatus;
    }

    public void setStaffStatus(Integer staffStatus) {
        this.staffStatus = staffStatus;
    }

    public Integer getIvrStatus() {
        return ivrStatus;
    }

    public void setIvrStatus(Integer ivrStatus) {
        this.ivrStatus = ivrStatus;
    }

    public String getIvrGuid() {
        return ivrGuid;
    }

    public void setIvrGuid(String ivrGuid) {
        this.ivrGuid = ivrGuid;
    }

    public Date getIvrStartTime() {
        return ivrStartTime;
    }

    public void setIvrStartTime(Date ivrStartTime) {
        this.ivrStartTime = ivrStartTime;
    }

    public Integer getIvrCount() {
        return ivrCount;
    }

    public void setIvrCount(Integer ivrCount) {
        this.ivrCount = ivrCount;
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

    public Date getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(Date enterTime) {
        this.enterTime = enterTime;
    }

    public long getOrderTimestampLong() {
        return orderTimestampLong;
    }

    public void setOrderTimestampLong(long orderTimestampLong) {
        this.orderTimestampLong = orderTimestampLong;
    }

    public Integer getDelayCount() {
        return delayCount;
    }

    public void setDelayCount(Integer delayCount) {
        this.delayCount = delayCount;
    }


    public Date getStaffResolveTime() {
        return staffResolveTime;
    }

    public void setStaffResolveTime(Date staffResolveTime) {
        this.staffResolveTime = staffResolveTime;
    }

    public String getHotelPhone() {
        return hotelPhone;
    }

    public void setHotelPhone(String hotelPhone) {
        this.hotelPhone = hotelPhone;
    }
}
