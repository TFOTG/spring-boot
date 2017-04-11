package com.elong.hotel.common.enums;

/**
 * communicationevent类别枚举
 * 
 * @author zouyufei
 *
 */
public enum CommunicationEventTypeEnum{

	/**
	 * 入住反馈
	 */
	FEEDBACK("FEEDBACK", "入住反馈"),
	/**
	 * 拆单结果
	 */
	SPLITRESULT("SPLITRESULT", "拆单结果"),
	/**
	 * java修改订单
	 */
	JMODIFY("JMODIFY", "java修改订单"),
	/**
	 * java创建订单
	 */
	JCREATE("JCREATE", "java创建订单"),

	JCheckedInFeedBackByGuest("JCheckedInFeedBackByGuest", "修改订单状态"),

	JNewOrderCheckIn("JNewOrderCheckIn", "修改订单状态"),

	JCheckOut("JCheckOut", "修改订单状态"),

	JCheckIn("JCheckIn", "修改订单状态"),

	JCheckedInFeedBackByHotel("JCheckedInFeedBackByHotel", "修改订单状态"),

	JNoShowB1("JNoShowB1", "修改订单状态"),

	JNoShowB("JNoShowB", "修改订单状态"),

	JNoShowB3("JNoShowB3", "修改订单状态"),

	CancelE("CancelE", "修改订单状态"),

	DeleteD("DeleteD", "修改订单状态"),

	JUpdateOrderNotes("JUpdateOrderNotes", "更新备注"),

	JUpdateRoomInfo("JUpdateRoomInfo", "更新房间信息"),
	
	SetOrdersCheckStatusInfo("SetOrdersCheckStatusInfo","回调直连接口"),
	
	GetOrderStatusHistory("GetOrderStatusHistory","直连获取订单信息"),

	LaterPayDC("LaterPayDC","直连闪电住"),

	LaterPayOrderVerify("LaterPayOrderVerify","闪电住订单校验"),

	LaterPayOrderCallback("LaterPayOrderCallback","闪电住订单回调"),

	SetDCProcessStatus("SetDCProcessStatus","Hotel3回调OrderFlag接口"),

	GetPsgInfo("GetPsgInfo","hotel3调用产品psg信息"),

	CallBackSms("CallBackSms","上行短信回调平台");

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
