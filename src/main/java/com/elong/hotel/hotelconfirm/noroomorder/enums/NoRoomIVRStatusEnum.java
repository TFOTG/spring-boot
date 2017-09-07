package com.elong.hotel.hotelconfirm.noroomorder.enums;

/**
 * Created by peng.wang on 2017/8/31.
 */
public enum NoRoomIVRStatusEnum {

	NEW(0, "新建"),

    PROCESS(1,"处理中"),//中间状态

	SUCCEED_FULL(2, "成功反馈满房"),

	SUCCEED_NOFUll(3, "成功反馈未满房"),

    FAIL_NEED_IVR(4,"外呼失败需要重试"),//中间状态

    FAIL_TIMEOUT(5,"失败超时"),

    FAIL_NO_FEEDBACK(6,"失败无反馈"),

    FAIL_CONNECT_NO_FEEDBACK(7,"失败接通无反馈"),

    FAIL_VALIDATION(8,"校验失败");

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
