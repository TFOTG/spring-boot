package com.elong.hotel.hotelconfirm.confirmorder.enums;

/**
 * Created by Hualong.Li on 17/7/7.
 */
public enum EbRefuseEnum {
	/**
	 * None
	 */
	None(0, "none"),
	/**
	 *
	 */
	EbRefuse(1, "eb拒单");

	private int key;
	private String value;

	EbRefuseEnum(int key, String value) {
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public static EbRefuseEnum getValue(int key) {
		EbRefuseEnum result = EbRefuseEnum.None;
		for (EbRefuseEnum obj : EbRefuseEnum.values()) {
			if (obj.getKey() == key) {
				result = obj;
				break;
			}
		}
		return result;
	}

	public String getValue() {
		return value;
	}
}
