package com.elong.hotel.common.enums;

import com.elong.hotel.common.helper.StringUtils;

public enum OrderAdditionalStatusEnum {
	/**
	 * 担保
	 */
	VOUCH(256),
	/**
	 * 全部担保
	 */
	VOUCH_ALL(1073741824),
	/**
	 * 半日房
	 */
	ISHALFSET(512);

	private int value;

	private OrderAdditionalStatusEnum(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static Integer returnAdditionalStatus(Long additionalStatus,String payment) {
		Integer result = 0;
		if(StringUtils.equalsIgnoreCase("P", payment)) {
			for(OrderAdditionalStatusEnum enums :OrderAdditionalStatusEnum.values()) {
				if((enums.getValue() & additionalStatus.intValue()) != 0) {
					result += enums.getValue();
				}
			}
		}
		return result;
	}
}