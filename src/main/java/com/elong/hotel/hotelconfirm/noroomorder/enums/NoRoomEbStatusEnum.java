package com.elong.hotel.hotelconfirm.noroomorder.enums;

/**
 * Created by peng.wang on 2017/9/1.
 */
public enum NoRoomEbStatusEnum {

	NoDeal(0, "Eb未处理"),

	DealFull(1, "Eb处理满房"),

	DealNoFull(2, "Eb处理未满房"),

    DealSuccess(3, "协调解决");

	private int status;

	private String desc;

	public int getStatus() {
		return status;
	}

	public String getDesc() {
		return desc;
	}

	NoRoomEbStatusEnum(int status, String desc) {
		this.status = status;
		this.desc = desc;
	}

	public static String getDescByStatus(int key) {
		String result = "";
		for (NoRoomEbStatusEnum noRoomEbStatusEnum : NoRoomEbStatusEnum.values()) {
			if (noRoomEbStatusEnum.getStatus() == key) {
				result = noRoomEbStatusEnum.getDesc();
				break;
			}
		}
		return result;
	}
}
