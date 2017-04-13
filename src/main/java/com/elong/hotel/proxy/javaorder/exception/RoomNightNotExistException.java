package com.elong.hotel.proxy.javaorder.exception;

import com.alibaba.fastjson.JSON;

import java.util.Date;

/**
 * 某天的价格不存在
 * @author zouyufei
 *
 */
public class RoomNightNotExistException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4470558061906553538L;

	public RoomNightNotExistException(){
		super();
	}
	
	public RoomNightNotExistException(String message){
		super(message);
	}
	
	public RoomNightNotExistException(Date date){
		super(String.format("%s 的roomNight在原单不存在.", JSON.toJSONStringWithDateFormat(date, "yyyy-MM-dd")));
	}
	
}
