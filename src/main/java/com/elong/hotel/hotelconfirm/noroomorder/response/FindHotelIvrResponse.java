package com.elong.hotel.hotelconfirm.noroomorder.response;

import java.util.List;

import com.elong.hotel.common.response.ServiceResponseBase;

/**
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年8月30日 下午5:27:41   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class FindHotelIvrResponse extends ServiceResponseBase {

	private static final long serialVersionUID = 1L;

	/**
	 * 外呼通路数
	 */
	private int size;

	/**
	 * 酒店ID集合
	 */
	private List<String> hotelIds;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<String> getHotelIds() {
		return hotelIds;
	}

	public void setHotelIds(List<String> hotelIds) {
		this.hotelIds = hotelIds;
	}

}
