package com.elong.hotel.hotelconfirm.groupfilter.enums;

/**
 * 
  * FieldCompareEnum
  * @Title: 字段比较枚举
  * @Description
  * @author yangboyu
  *
 */
public enum CompareFieldEnum {
	/**
	 * 全部
	 */
	All(1),
	/**
	 * 具体字段
	 */
	Specific(-1),

	/**
	 * 确认分组全部
	 */
	NL(1);
	private int value;

	private CompareFieldEnum(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
