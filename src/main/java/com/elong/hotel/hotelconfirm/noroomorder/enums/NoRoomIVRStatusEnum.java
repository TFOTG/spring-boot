package com.elong.hotel.hotelconfirm.noroomorder.enums;

/**
 * Created by peng.wang on 2017/8/31.
 */
public enum NoRoomIVRStatusEnum {

	NEW(0, "新建"),

	PROCESS(1, "处理中"),

	SUCCEED_FULL(2, "成功反馈满房"),

	SUCCEED_NOFUll(3, "成功反馈未满房"),

	FAIL_TIMEOUT(4, "失败超时"),

	FAIL_NO_FEEDBACK(5, "失败无反馈"),

	FAIL_NO_IVR(6, "失败并且不外呼"),

	FAIL_VALIDATION(7, "校验失败");

	private int status;

	private String desc;

	public int getStatus() {
		return status;
	}

	public String getDesc() {
		return desc;
	}

	NoRoomIVRStatusEnum(int status, String desc) {
		this.status = status;
		this.desc = desc;
	}

	public static String getDescByStatus(int key) {
		String result = "";
		for (NoRoomIVRStatusEnum noRoomIVRStatusEnum : NoRoomIVRStatusEnum.values()) {
			if (noRoomIVRStatusEnum.getStatus() == key) {
				result = noRoomIVRStatusEnum.getDesc();
				break;
			}
		}
		return result;
	}
}
