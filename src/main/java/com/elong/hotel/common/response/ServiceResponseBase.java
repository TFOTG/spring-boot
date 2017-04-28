package com.elong.hotel.common.response;

import com.elong.hotel.common.helper.ExceptionHelper;

import java.io.Serializable;

/**
 * 
 * @author zouyufei
 *
 */
public class ServiceResponseBase implements Serializable {

	private static final long serialVersionUID = -7134985874042691632L;


	private int responseCode;
	private String errorMessage;
	private String stackTrace;
	private Exception exception;

	public ServiceResponseBase() {
		super();
		errorMessage = "";
		stackTrace = "";
		exception = null;
	}

	public void setException(Exception ex) {
		exception = ex;
		this.stackTrace = ExceptionHelper.getStackInfo(ex).replaceAll("\'", "“").replaceAll("\'", "‘");
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public String getErrorMessage() {
		return errorMessage == null ? "" : errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getStackTrace() {
		return stackTrace;
	}

	public Exception getException() {
		return exception;
	}
}
