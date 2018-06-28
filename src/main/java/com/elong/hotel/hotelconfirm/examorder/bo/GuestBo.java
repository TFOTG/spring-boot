package com.elong.hotel.hotelconfirm.examorder.bo;

import java.io.Serializable;

/**
 * 
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年6月28日 上午9:03:13   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class GuestBo implements Serializable{

	/** 
	 * long GuestBo.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 客人手机号
	 */
	private String guestMobile;
	
	/**
	 * 客人姓名
	 */
	private String guestName;
	
	/**
	 * 客人性别
	 */
	private Integer guestSex;

	public String getGuestMobile() {
		return guestMobile;
	}

	public void setGuestMobile(String guestMobile) {
		this.guestMobile = guestMobile;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public Integer getGuestSex() {
		return guestSex;
	}

	public void setGuestSex(Integer guestSex) {
		this.guestSex = guestSex;
	}
	
}
