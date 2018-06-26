package com.elong.hotel.proxy.product.request;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.elong.hotel.proxy.product.bo.SHotelPhoneNew;

/**
 * 
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年6月22日 上午8:56:04   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public class FetchNewHotelPhoneRequest implements Serializable{

	/** 
	 * long FetchNewHotelPhoneRequest.java serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private String timestamp;
	
	private String signature;
	
	private Map<String, Object> body;
	
	public FetchNewHotelPhoneRequest(){
		super();
	}
	
	public FetchNewHotelPhoneRequest(List<SHotelPhoneNew> shotelParam){
		super();
		this.timestamp = String.valueOf(System.currentTimeMillis());
		this.signature = "GUID";
		this.body = new HashMap<>();
		this.body.put("sHotelProducts", shotelParam);
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public Map<String, Object> getBody() {
		return body;
	}

	public void setBody(Map<String, Object> body) {
		this.body = body;
	}
	
}
