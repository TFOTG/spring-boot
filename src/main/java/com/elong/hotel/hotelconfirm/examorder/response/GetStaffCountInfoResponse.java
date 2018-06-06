package com.elong.hotel.hotelconfirm.examorder.response;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.examorder.bo.AmendStaffHandleCountBo;

/**
 * 终拒员工统计信息
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年6月4日 上午11:22:03   user     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		user 
 * @version		1.0  
 * @since		JDK1.7
 */
public class GetStaffCountInfoResponse extends ServiceResponseBase{

	/** 
	 * long GetStaffCountInfoResponse.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private AmendStaffHandleCountBo body;

	public AmendStaffHandleCountBo getBody() {
		return body;
	}

	public void setBody(AmendStaffHandleCountBo body) {
		this.body = body;
	}
	
}
