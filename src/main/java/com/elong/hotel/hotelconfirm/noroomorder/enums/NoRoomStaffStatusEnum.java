package com.elong.hotel.hotelconfirm.noroomorder.enums;

/**
 * Created by peng.wang on 2017/9/1.
 */
public enum NoRoomStaffStatusEnum {

	NoDeal(0, "员工未处理",null),

	OriginalRoomArrangement(1, "原房安排",NoRoomEbStatusEnum.DealNoFull),

	FreeUpgrade(2, "免费升级",NoRoomEbStatusEnum.DealSuccess),

    DealFailed(3, "满房",NoRoomEbStatusEnum.DealFull),

    ChangeOrderToDorE(4, "订单取消/删除",NoRoomEbStatusEnum.DealSuccess),

    OrderTimeOut(5, "订单超时",NoRoomEbStatusEnum.DealSuccess),

    HotelNotResponse(6, "酒店3次未通",NoRoomEbStatusEnum.DealSuccess);

	private int status;

	private String desc;

	private NoRoomEbStatusEnum feedBackStatus4Eb;

	public int getStatus() {
		return status;
	}

	public String getDesc() {
		return desc;
	}

    public NoRoomEbStatusEnum getFeedBackStatus4Eb() {
        return feedBackStatus4Eb;
    }

    NoRoomStaffStatusEnum(int status, String desc, NoRoomEbStatusEnum feedBackStatus4Eb) {
		this.status = status;
		this.desc = desc;
		this.feedBackStatus4Eb=feedBackStatus4Eb;
	}

	public static NoRoomStaffStatusEnum getEnumByStatus(int key) {
        NoRoomStaffStatusEnum result=null;
		for (NoRoomStaffStatusEnum noRoomStaffStatusEnum : NoRoomStaffStatusEnum.values()) {
			if (noRoomStaffStatusEnum.getStatus() == key) {
				result = noRoomStaffStatusEnum;
				break;
			}
		}
		return result;
	}
}
