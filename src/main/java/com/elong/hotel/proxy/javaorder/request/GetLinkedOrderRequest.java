package com.elong.hotel.proxy.javaorder.request;

import java.io.Serializable;

/**
 * 
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年6月28日 上午9:17:36   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class GetLinkedOrderRequest implements Serializable{

	/** 
	 * long GetLinkedOrderRequest.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 卡号
	 */
	private Long cardNo;
	
	/**
	 * 酒店ID
	 */
	private String hotelId;
	
	/**
	 * 联系人电话
	 */
	private String phone;
	
	/**
	 * 查询数量
	 */
	private Integer limit;

	public Long getCardNo() {
		return cardNo;
	}

	public void setCardNo(Long cardNo) {
		this.cardNo = cardNo;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	
}
