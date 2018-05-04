package com.elong.hotel.storage.enums;

/**
 * Created by Hualong.Li on 17/4/24.
 */
public enum StorageTypeEnum {

	CONFIRM(1),

	NOROOM(2),

	CREATEORDER(3),
	
	EXAM(4);

	private int value;

	StorageTypeEnum(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
