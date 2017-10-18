package com.elong.hotel.hotelconfirm.targetdata.request;

import java.io.Serializable;

import com.elong.hotel.hotelconfirm.targetdata.bo.TargetDataParamBodyBo;

/**
 * 
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2017年10月11日 上午9:31:07   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		user 
 * @version		1.0  
 * @since		JDK1.7
 */
public class TargetDataRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private String sourceCode;

	private TargetDataParamBodyBo body;

	public TargetDataRequest() {
		super();
	}

	public TargetDataRequest(TargetDataParamBodyBo body, String sourceCode) {
		this.body = body;
		this.sourceCode = sourceCode;
	}

	public TargetDataParamBodyBo getBody() {
		return body;
	}

	public void setBody(TargetDataParamBodyBo body) {
		this.body = body;
	}

	public String getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

}
