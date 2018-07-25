package com.elong.hotel.hotelconfirm.examorder.response;


import java.util.List;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.proxy.product.bo.ContactInfoList;

/**
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年6月22日 上午9:29:23   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class FetchHotelPhoneResponse extends ServiceResponseBase{

	/** 
	 * long FetchHotelPhoneResponse.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private List<ContactInfoList> contactInfoList ;

	public List<ContactInfoList> getContactInfoList() {
		return contactInfoList;
	}

	public void setContactInfoList(List<ContactInfoList> contactInfoList) {
		this.contactInfoList = contactInfoList;
	}
	
}
