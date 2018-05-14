package com.elong.hotel.proxy.javaorder.request;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年5月14日 上午8:48:24   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class GetRefusedCancelNumRequest implements Serializable{

	/** 
	 * long GetRefusedCancelNumRequest.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 卡号
	 */
	private Integer cardNo;
	
	/**
	 * 手机号
	 */
	private String phone;
	
	/**
	 * 城市ID
	 */
	private String cityId;
	
	/**
	 * 开始时间
	 */
	private Date startTime;
	
	/**
	 * 结束时间
	 */
	private Date endTime;

	public Integer getCardNo() {
		return cardNo;
	}

	public void setCardNo(Integer cardNo) {
		this.cardNo = cardNo;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
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

	@Override
	public String toString() {
		return "GetRefusedCancelNumRequest [cardNo=" + cardNo + ", phone=" + phone + ", cityId=" + cityId + ", startTime=" + startTime
				+ ", endTime=" + endTime + "]";
	}
	
}
