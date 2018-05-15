package com.elong.hotel.hotelconfirm.group.response;

import java.util.List;

import com.elong.hotel.common.response.ServiceResponseBase;
import com.elong.hotel.hotelconfirm.group.bo.ExamGroupBo;

/**
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年5月15日 下午3:35:41   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class GetExamGroupsResponse extends ServiceResponseBase{

	/** 
	 * long GetExamGroupsResponse.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private List<ExamGroupBo> body;

	public List<ExamGroupBo> getBody() {
		return body;
	}

	public void setBody(List<ExamGroupBo> body) {
		this.body = body;
	}
	
}
