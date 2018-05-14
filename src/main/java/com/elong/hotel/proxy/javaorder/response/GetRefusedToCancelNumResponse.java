package com.elong.hotel.proxy.javaorder.response;

import java.io.Serializable;

import com.elong.hotel.proxy.javaorder.getorder.RefusedCancelNumBo;

/**
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年5月14日 上午8:41:29   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class GetRefusedToCancelNumResponse extends OrderResponseBase implements Serializable{

	/** 
	 * long GetRefusedToCancelNumResponse.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private RefusedCancelNumBo body;

	public RefusedCancelNumBo getBody() {
		return body;
	}

	public void setBody(RefusedCancelNumBo body) {
		this.body = body;
	}
	
}
