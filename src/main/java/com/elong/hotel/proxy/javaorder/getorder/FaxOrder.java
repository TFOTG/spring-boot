package com.elong.hotel.proxy.javaorder.getorder;

import java.util.Date;

/**
 * 
 * 传真订单实体
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2016年4月12日 上午10:50:00   peng.wang     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		peng.wang 
 * @version		1.0  
 * @since		JDK1.7
 */
public class FaxOrder {

	/**
	 * 客人姓名
	 */
	private String guestName;
	
	/**
	 * 房间号
	 */
	private String roomNo;
	
	/**
	 * 确认号
	 */
	private String confirmNo;
	
	/**
	 * 入住日
	 */
	private Date checkInDate;
	
	/**
	 * 单号
	 */
	private String orderId;
	
	/**
	 * 房间类型名称
	 */
	private String roomTypeName;
	
	/**
	 * rp名称
	 */
	private String ratePlanName;
	
	/**
	 * 样式标签
	 */
	private String showTag;

	
	public String getShowTag() {
		return showTag;
	}

	public void setShowTag(String showTag) {
		this.showTag = showTag;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getConfirmNo() {
		return confirmNo;
	}

	public void setConfirmNo(String confirmNo) {
		this.confirmNo = confirmNo;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getRoomTypeName() {
		return roomTypeName;
	}

	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}

	public String getRatePlanName() {
		return ratePlanName;
	}

	public void setRatePlanName(String ratePlanName) {
		this.ratePlanName = ratePlanName;
	}
	
}
