package com.elong.hotel.hotelconfirm.confirmorder.enums;

/**
 * 确认方式
 */
public enum ConfirmType {

	/**
	 * EBooking
	 */
	EBooking(1, "EBooking"),

	/**
	 * DC
	 */
	DC(2, "DC"),

	/**
	 * 确认Task 执行出库
	 */
	CONFIRMTASK(3, "CONFIRMTASK"),

	/**
	 * MIS
	 */
	MIS(4, "MIS"),

	/**
	 * IVR
	 */
	IVR(5, "IVR");

	private int key;
	private String value;

	ConfirmType(int key, String value) {
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	public static String getValue(int key) {
		String value = "";
		for (ConfirmType auditingTypeEnum : ConfirmType.values()) {
			if (auditingTypeEnum.getKey() == key) {
				value = auditingTypeEnum.getValue();
			}
		}
		return value;
	}
}
