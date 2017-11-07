package com.elong.hotel.proxy.javaorder.exception;

/**
 * 重单异常
 * @author zouyufei
 *
 */
public class DuplicateOrderException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8263117889454334995L;

	
	public DuplicateOrderException(String message){
		super(message);
	}
}
