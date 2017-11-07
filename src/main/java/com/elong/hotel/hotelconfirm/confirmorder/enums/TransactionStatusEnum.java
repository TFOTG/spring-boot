package com.elong.hotel.hotelconfirm.confirmorder.enums;

public enum TransactionStatusEnum {

	/**
	 * 未处理
	 */
	Undo(0, "未处理"),

	/**
	 * 已获取
	 */
	Obtain(1, "已获取"),

	/**
	 * 支付中
	 */
	Paying(2, "支付中"),

	/**
	 * 成功
	 */
	Success(3, "成功"),

	/**
	 * 失败
	 */
	Failed(4, "失败"),

	/**
	 * 暂缓
	 */
	Suspension(5, "暂缓");

	private int key;
	private String value;

	TransactionStatusEnum(int key, String value) {
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
