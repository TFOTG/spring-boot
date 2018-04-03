package com.elong.hotel.hotelconfirm.confirmorder.enums;

public enum HeChengConfirmStatusEnum {

	Unconfirmed("W", "待确认"),

	Success("C", "确认成功"),

	Reject("R", "确认拒绝");

	private String key;
	private String value;

	HeChengConfirmStatusEnum(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}
}
