package com.elong.hotel.hotelconfirm.groupfilter.enums;

public enum CompareResultEnum {
	/**
	 * 匹配成功
	 */
	On(1),
	/**
	 * 匹配未成功
	 */
	Off(-1);

	private int value;

	CompareResultEnum(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
