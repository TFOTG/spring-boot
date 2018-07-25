package com.elong.hotel.hotelconfirm.group.response;

import com.elong.hotel.common.response.ServiceResponseBase;

/**
 * 
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年6月28日 下午3:44:58   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class GetSortIsExistResponse extends ServiceResponseBase{

	/** 
	 * long GetSortIsExistResponse.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
