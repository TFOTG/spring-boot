package com.elong.hotel.hotelconfirm.ivr.enums;

/**
 * Created by Hualong.Li on 17/6/15.
 */
public enum IvrStatusEnum {

	N(0,"未外呼"),
	I(1,"外呼中"),
	V(2,"外呼1次完成");

	private int key;

	private String content;

	IvrStatusEnum(int key, String content) {
		this.key = key;
		this.content = content;
	}

	public int getKey() {
		return key;
	}

	public String getContent() {
		return content;
	}
}
