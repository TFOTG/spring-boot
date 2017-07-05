package com.elong.hotel.hotelconfirm.staff.bo;

import java.io.Serializable;

/**
 * 
 * 根据用户名查询员工信息接口
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * Apr 22, 2015 8:29:56 PM   hualong.li     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		hualong.li 
 * @version		1.0  
 * @since		JDK1.7
 */
public class BaseFromMisBo implements Serializable {

	private String ApplicationServerIP;

	private String ErrorMessage;

	private String ResponseCode;

	private String UsedMillionSecond;

	public String getApplicationServerIP() {
		return ApplicationServerIP;
	}

	public void setApplicationServerIP(String applicationServerIP) {
		ApplicationServerIP = applicationServerIP;
	}

	public String getErrorMessage() {
		return ErrorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}

	public String getResponseCode() {
		return ResponseCode;
	}

	public void setResponseCode(String responseCode) {
		ResponseCode = responseCode;
	}

	public String getUsedMillionSecond() {
		return UsedMillionSecond;
	}

	public void setUsedMillionSecond(String usedMillionSecond) {
		UsedMillionSecond = usedMillionSecond;
	}

}
