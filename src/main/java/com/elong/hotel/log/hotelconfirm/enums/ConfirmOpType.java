package com.elong.hotel.log.hotelconfirm.enums;

/**
 * Created by Hualong.Li on 17/4/28.
 */
public enum ConfirmOpType {


	SERVICESTORAGE("ServiceStorage", "服务入库"),

	SERVICEDELIVERY("ServiceDelivery", "服务出库");

	private String key;

	private String value;

	ConfirmOpType(String key, String value) {
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
