package com.elong.hotel.hotelconfirm.noroomorder.po;

import com.elong.hotel.proxy.javaorder.getorder.Order;

import java.util.Date;

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
     * 处理类型
     */
    private Integer dealType;

	/**
	 * ivr外呼状态
	 */
	private Integer ivrStatus;

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


    public NoRoomOrderPo() {
    }


    public NoRoomOrderPo(Order order) {

        this.reserNo=order.getOrderId().intValue();
        this.reserStatus=order.getStatus();
        this.arriveDate=order.getCheckInDate();
        this.leaveDate=order.getCheckOutDate();
        this.hotelId=order.getHotelId();
        this.hotelName=order.getHotelName();
        this.orderTimestampLong=order.getOrderTimestamp().getTime();

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

	public Integer getIvrStatus() {
		return ivrStatus;
	}

	public void setIvrStatus(Integer ivrStatus) {
		this.ivrStatus = ivrStatus;
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

    public Integer getImmediately() {
        return immediately;
    }

    public void setImmediately(Integer immediately) {
        this.immediately = immediately;
    }

    public Integer getDealType() {
        return dealType;
    }

    public void setDealType(Integer dealType) {
        this.dealType = dealType;
    }
}
