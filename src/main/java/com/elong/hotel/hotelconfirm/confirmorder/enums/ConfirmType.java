package com.elong.hotel.hotelconfirm.confirmorder.enums;

/**
 * Created by Hualong.Li on 17/4/28.
 */
public enum ConfirmType {

	/**
	 * DC
	 */
	DC(0,"DC"),

	/**
	 * EBooking
	 */
	EBooking(1,"EBooking"),

	/**
	 * WEB
	 */
	WEB(2,"WEB"),

	/**
	 * APP
	 */
	APP(3,"APP"),

	/**
	 * IVR
	 */
	IVR(4,"IVR"),

	/**
	 * qunar
	 */
	Qunar(5,"Qunar"),

	/**
	 * ctrip
	 */
	Ctrip(6,"Ctrip"),

	/**
	 * manual
	 */
	Manual(7,"Manual"),

	/**
	 * 复审上行短信
	 */
	ReviewSMS(8,"ReviewSMS"),

	/**
	 * NoSHowTask
	 */
	AutoNoshowTask(9,"AutoNoshowTask");

	private long key;
	private String value;

	ConfirmType(int key, String value) {
		this.key = key;
		this.value = value;
	}

	public long getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	public static String getValue(int key) {
		String value = "";
		for(ConfirmType auditingTypeEnum: ConfirmType.values()) {
			if(auditingTypeEnum.getKey() == key) {
				value = auditingTypeEnum.getValue();
			}
		}
		return value;
	}
}
