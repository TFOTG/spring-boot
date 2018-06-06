package com.elong.hotel.hotelconfirm.examorder.response;

import java.util.List;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.examorder.bo.PendingExamOrderBo;

/**
 * 
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年6月6日 下午3:25:27   user     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		user 
 * @version		1.0  
 * @since		JDK1.7
 */
public class GetPendingExamOrdersResponse extends ServiceResponseBase{

	/** 
	 * (变量说明描述)	
	 *
	 * long GetPendingExamOrdersResponse.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private List<PendingExamOrderBo> body;
	
	private int totalCount;

	public List<PendingExamOrderBo> getBody() {
		return body;
	}

	public void setBody(List<PendingExamOrderBo> body) {
		this.body = body;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

}
