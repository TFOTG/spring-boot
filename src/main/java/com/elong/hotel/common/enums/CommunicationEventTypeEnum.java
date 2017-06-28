package com.elong.hotel.common.enums;

/**
 * communicationevent类别枚举
 * 
 * @author zouyufei
 *
 */
public enum CommunicationEventTypeEnum{

	/**
	 * java修改订单
	 */
	JMODIFY("JMODIFY", "java修改订单"),
	/**
	 * 订单操作初拒,操作库存
	 */
	INITIALFULLREFUSEORDER("INITIALFULLREFUSEORDER", "订单操作初拒,操作库存");

	private CommunicationEventTypeEnum(String status, String description) {
		this.status = status;
		this.description = description;
	}

	public static boolean match(String src, CommunicationEventTypeEnum status) {
		return false;
	}

	private String status;
	// 描述
	private String description;

	public String getStatus() {
		return status;
	}

	public String getDescription() {
		return description;
	}

}
