package com.elong.hotel.hotelconfirm.cancelorder.response;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.cancelorder.bo.CountNeedPendingOrderBo;

/**
 * 
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年9月5日 上午8:36:26   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class FetchPendingOrderQuantityResponse extends ServiceResponseBase{

	/** 
	 * long FetchPendingOrderQuantityResponse.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private CountNeedPendingOrderBo data;

	public CountNeedPendingOrderBo getData() {
		return data;
	}

	public void setData(CountNeedPendingOrderBo data) {
		this.data = data;
	}
	
}
