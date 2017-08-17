/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.proxy.hotel3.response.Hotel3RoomInfoResult.java]
 * Createion [2017年8月15日]
 */
package com.elong.hotel.proxy.hotel3.response;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public class Hotel3RoomInfoResult {
	

	private String ApplicationServerIP;
   
	private String ErrorMessage;
   
	private int ResponseCode;
   
	private long UsedMillionSecond;

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

	public int getResponseCode() {
		return ResponseCode;
	}

	public void setResponseCode(int responseCode) {
		ResponseCode = responseCode;
	}

	public long getUsedMillionSecond() {
		return UsedMillionSecond;
	}

	public void setUsedMillionSecond(long usedMillionSecond) {
		UsedMillionSecond = usedMillionSecond;
	}

}
