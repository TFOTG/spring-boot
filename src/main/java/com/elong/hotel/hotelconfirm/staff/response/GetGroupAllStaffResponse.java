package com.elong.hotel.hotelconfirm.staff.response;

import java.util.List;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.staff.bo.GroupStaffInfoBo;

/**
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年5月24日 下午4:09:21   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class GetGroupAllStaffResponse extends ServiceResponseBase{

	/** 
	 * long GetGroupAllStaffResponse.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private List<GroupStaffInfoBo> body;

	public List<GroupStaffInfoBo> getBody() {
		return body;
	}

	public void setBody(List<GroupStaffInfoBo> body) {
		this.body = body;
	}
	
}
