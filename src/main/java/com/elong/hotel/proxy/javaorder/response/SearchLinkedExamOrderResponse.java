package com.elong.hotel.proxy.javaorder.response;

import java.io.Serializable;
import java.util.List;

import com.elong.hotel.hotelconfirm.examorder.bo.LinkAndRepeatBo;

/**
 * 
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年6月28日 上午9:09:59   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class SearchLinkedExamOrderResponse extends OrderResponseBase implements Serializable{

	/** 
	 * long SearchLinkedExamOrderResponse.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private List<LinkAndRepeatBo> body;
	

	public List<LinkAndRepeatBo> getBody() {
		return body;
	}

	public void setBody(List<LinkAndRepeatBo> body) {
		this.body = body;
	}	
}
