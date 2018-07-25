package com.elong.hotel.proxy.product.bo;

import java.io.Serializable;

/**
 * 
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年6月22日 上午8:54:25   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class SHotelPhoneNew implements Serializable{

	/** 
	 * long SHotelPhoneNew.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private String hotelId;
	
	private String roomTypeId;
	
	private Integer ratePlanId;

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getRoomTypeId() {
		return roomTypeId;
	}

	public void setRoomTypeId(String roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	public Integer getRatePlanId() {
		return ratePlanId;
	}

	public void setRatePlanId(Integer ratePlanId) {
		this.ratePlanId = ratePlanId;
	}
}
