package com.elong.hotel.hotelconfirm.cancelorder.response;

import java.util.List;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.cancelorder.bo.PendingHotelBo;

/**
 * 待处理列表response
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年9月3日 下午3:46:33   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class FetchPendingOrderResponse extends ServiceResponseBase{

	/** 
	 * long FetchPendingOrderResponse.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private int totalCount;
	
	private List<PendingHotelBo> data;

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public List<PendingHotelBo> getData() {
		return data;
	}

	public void setData(List<PendingHotelBo> data) {
		this.data = data;
	}
	
}
