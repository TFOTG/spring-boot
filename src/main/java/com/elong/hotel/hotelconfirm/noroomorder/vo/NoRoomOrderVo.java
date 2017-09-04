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
	 * ivr外呼状态集合
	 */
	private List<Integer> ivrStatuses;


    /**
     * 订单id
     */
    private List<Integer> orderIds;


    /**
     * ivr外呼状态
     */
    private Integer ivrStatus;

    /**
     * ivr外呼次数
     */
    private Integer ivrAddCount;

    /**
     * ivr外呼guid
     */
    private String ivrGuid;

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

	/**
	 * 检查能否外呼
	 */
	private Integer checkEnableCalling;

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

	public List<String> getReserStatuses() {
		return reserStatuses;
	}

	public void setReserStatuses(List<String> reserStatuses) {
		this.reserStatuses = reserStatuses;
	}

	public String getHotelId() {
    /**
     * 操作人
     */
    private String operator;

    /**
     * 操作时间
     */
    private Date operateTime;


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

	public Integer getCheckEnableCalling() {
		return checkEnableCalling;
	}

	public void setCheckEnableCalling(Integer checkEnableCalling) {
		this.checkEnableCalling = checkEnableCalling;
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

    public List<Integer> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<Integer> orderIds) {
        this.orderIds = orderIds;
    }

    public Integer getIvrAddCount() {
        return ivrAddCount;
    }

    public void setIvrAddCount(Integer ivrAddCount) {
        this.ivrAddCount = ivrAddCount;
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
}


