package com.elong.hotel.hotelconfirm.examorder.response;

import java.util.List;

import com.elong.hotel.common.response.ServiceResponseBase;

/**
 * 终拒员工获取订单response
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年6月1日 下午4:45:14   user     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		user 
 * @version		1.0  
 * @since		JDK1.7
 */
public class StaffFetchExamOrderResponse extends ServiceResponseBase{

	/** 
	 * long StaffFetchExamOrderResponse.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private List<Integer> orderIds;

	public List<Integer> getOrderIds() {
		return orderIds;
	}

	public void setOrderIds(List<Integer> orderIds) {
		this.orderIds = orderIds;
	}
}
