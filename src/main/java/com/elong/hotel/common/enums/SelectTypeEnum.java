package com.elong.hotel.common.enums;

/**
 * Created by Hualong.Li on 17/6/12.
 */
public enum SelectTypeEnum {

	READER(0),WRITER(1);

	private int key;

	SelectTypeEnum(int key) {
		this.key = key;
	}

	public int getKey() {
		return key;
	}
}
