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
	UPDATEROOMINFO("UPDATEROOMINFO", "更新房间信息"),
	/**
	 * 订单可视化
	 */
	VISUALIZATION("VISUALIZATION","订单可视化"),
	/**
	 * 增加订单催标记
	 */
	ADDORDERURGENCY("ADDORDERURGENCY","增加订单催标记"),
	/**
	 * 操作拒单
	 */
	REJECT("REJECT","操作拒单"),
	/**
	 * 增加订单催标记
	 */
	CONFIRM("CONFIRM","操作确认"),
	/**
	 * 更新订单OrderFlag标记
	 */
	SAVEORDERFLAG("SAVEORDERFLAG","更新订单OrderFlag标记"),

    /**
     * 关房
     */
    CLOSEROOM("CLOSEROOM","关房"),


    /**
     * 催携程
     */
    URGECTRIP("URGECTRIP","催携程"),
	/**
	 * 订单操作初拒,操作库存
	 */
	INITIALFULLREFUSEORDER("INITIALFULLREFUSEORDER", "订单操作初拒,操作库存"),

	FORCEGUARANTEE("FORCEGUARANTEE","直连调用强制担保"),

	CONFIRMOVERTHROW("CONFIRMOVERTHROW","直连调用确认后推翻"),

    SENDMSG("SENDMSG","发送短信"),
	/**
	 * 直连小修改
	 */
	DCMINOREDIT("DCMINOREDIT","直连小修改");

	CommunicationEventTypeEnum(String status, String description) {
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
