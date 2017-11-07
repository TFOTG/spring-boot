package com.elong.hotel.proxy.javaorder.exception;

/**
 * 房间id 在原单中不存在
 * @author zouyufei
 *
 */
public class RoomIdNotExistException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4470558061906553538L;

	public RoomIdNotExistException(){
		super();
	}
	
	public RoomIdNotExistException(String message){
		super(message);
		
	}
	
}
