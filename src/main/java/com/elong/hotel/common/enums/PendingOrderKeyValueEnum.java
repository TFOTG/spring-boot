/**
 * ProjectName [confirm-entity]
 * FileName [com.elong.hotel.common.enums.PendingOrderKeyValueEnum.java]
 * Createion [2017年7月7日]
 */
package com.elong.hotel.common.enums;

/**
 * @author jianjun.wang
 * @version 1.0.0
 */
public enum PendingOrderKeyValueEnum {
	
	HOURROOMSTAY("HourRoomStay","是否小时房"),
	
	PMSPROCESSINGSTATUS("PmsProcessingStatus","2"),

    USENEWHCFLOW("UseNewHCFlow","使用赫程新流程"),
	
	RESPITETIMESTAMP("2000-01-01 00:00:00","待处理订单"),
	
	FIRSTJOINPROMOTIONTYPE("FirstJoinPromotionType","1001");
	
	private String key;
	
	private String value;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	private PendingOrderKeyValueEnum(String key, String value) {
		this.key = key;
		this.value = value;
	}

}
