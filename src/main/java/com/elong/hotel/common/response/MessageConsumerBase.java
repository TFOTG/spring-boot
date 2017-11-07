package com.elong.hotel.common.response;

import com.elong.hotel.common.helper.ExceptionHelper;

/**
 * 
 */
public class MessageConsumerBase {
	private Integer responseCode = 0;
	private String exceptionMessage;


	private Exception exception;

	/**
	 * 获取 ResponseCode
	 * 
	 * @return
	 */
	public Integer getResponseCode() {
		return responseCode;
	}

	/**
	 * 设置 ResponseCode
	 * 
	 * @param responseCode
	 */
	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

	/**
	 * 获取 失败描述
	 * 
	 * @return
	 */
	public String getExceptionMessage() {
		return exceptionMessage;
	}

	/**
	 * 设置失败描述
	 * 
	 * @param exceptionMessage
	 */
	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	public Exception getException() {
		return exception;
	}

	public void setException(Exception ex) {
		this.exception = ex;
		this.exceptionMessage = ExceptionHelper.getStackInfo(ex).replaceAll("\'", "“").replaceAll("\'", "‘");
	}
}
