package com.elong.hotel.common.groupfilter.enums;

/**
 * 
  * FieldCompareEnum
  * @Title: 字段比较枚举
  * @Description: TODO
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
	Specific(-1);

	private int value;

	private CompareFieldEnum(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
