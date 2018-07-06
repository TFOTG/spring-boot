package com.elong.hotel.hotelconfirm.examorder.response;

import java.util.List;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.examorder.bo.ExpiredExamOrderBo;

/**
 * 终拒过期自动取消response
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年7月5日 下午1:52:38   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class ExpiredExamOrderAutoCancelResponse extends ServiceResponseBase{

	/** 
	 * long ExpiredExamOrderAutoCancelResponse.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 执行取消订单集合
	 */
	private List<ExpiredExamOrderBo> examOrders;

	public List<ExpiredExamOrderBo> getExamOrders() {
		return examOrders;
	}

	public void setExamOrders(List<ExpiredExamOrderBo> examOrders) {
		this.examOrders = examOrders;
	}
	
}
