package com.elong.hotel.hotelconfirm.noroomorder.enums;

/**
 * Created by peng.wang on 2017/9/1.
 */
public enum NoRoomStaffStatusEnum {

	NoDeal(0, "员工未处理"),

	OriginalRoomArrangement(1, "原房安排"),

	FreeUpgrade(2, "免费升级"),

	DealFailed(3, "干预失败");

	private int status;

	private String desc;

	public int getStatus() {
		return status;
	}

	public String getDesc() {
		return desc;
	}

	NoRoomStaffStatusEnum(int status, String desc) {
		this.status = status;
		this.desc = desc;
	}

	public static String getDescByStatus(int key) {
		String result = "";
		for (NoRoomStaffStatusEnum noRoomStaffStatusEnum : NoRoomStaffStatusEnum.values()) {
			if (noRoomStaffStatusEnum.getStatus() == key) {
				result = noRoomStaffStatusEnum.getDesc();
				break;
			}
		}
		return result;
	}

}
