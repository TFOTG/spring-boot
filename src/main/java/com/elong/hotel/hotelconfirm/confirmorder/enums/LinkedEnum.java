package com.elong.hotel.hotelconfirm.confirmorder.enums;

/**
 * Created by Hualong.Li on 17/6/29.
 */
public enum LinkedEnum {
	/**
	 * None
	 */
	None(0, "none"),
	/**
	 *
	 */
	LINKED(1, "联单");

	private int key;
	private String value;

	LinkedEnum(int key, String value) {
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public static LinkedEnum getValue(int key) {
		LinkedEnum result = LinkedEnum.None;
		for (LinkedEnum linkedEnum : LinkedEnum.values()) {
			if (linkedEnum.getKey() == key) {
				result = linkedEnum;
				break;
			}
		}
		return result;
	}

	public String getValue() {
		return value;
	}
}
