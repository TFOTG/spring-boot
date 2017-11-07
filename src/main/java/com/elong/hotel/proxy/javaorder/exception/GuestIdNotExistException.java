package com.elong.hotel.proxy.javaorder.exception;

/**
 * 房间id 在原单中不存在
 * @author zouyufei
 *
 */
public class GuestIdNotExistException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4470558061906553538L;

	public GuestIdNotExistException(){
		super();
	}
	
	public GuestIdNotExistException(String message){
		super(message);
		
	}
	
}
