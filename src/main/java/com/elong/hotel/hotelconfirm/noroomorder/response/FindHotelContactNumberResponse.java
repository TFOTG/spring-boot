package com.elong.hotel.hotelconfirm.noroomorder.response;

import com.elong.hotel.common.response.ServiceResponseBase;

/**
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年9月1日 下午1:45:18   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class FindHotelContactNumberResponse extends ServiceResponseBase {

	private static final long serialVersionUID = 1L;

	private String phone;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
