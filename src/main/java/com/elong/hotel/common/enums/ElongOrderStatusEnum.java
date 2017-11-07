package com.elong.hotel.common.enums;

/**
 * Elong订单状态枚举
 * 
 * @author zouyufei
 *
 */
public enum ElongOrderStatusEnum {

	/**
	 * 已确认
	 */
	A("A", "已确认"),
	/**
	 * NoShow
	 */
	B("B", "NoShow"),
	/**
	 * 有预定未到
	 */
	B1("B1", "有预定未到"),
	/**
	 * 待查
	 */
	B2("B2", "待查"),
	/**
	 * 暂不确定
	 */
	B3("B3", "暂不确定"),
	/**
	 * 已结账
	 */
	C("C", "已结账"),
	/**
	 * 删除
	 */
	D("D", "删除"),
	/**
	 * 取消
	 */
	E("E", "取消"),
	/**
	 * 
	 */
	ERR("ERR", ""),
	/**
	 * 已入住
	 */
	F("F", "已入住"),
	/**
	 * 变价
	 */
	G("G", "变价"),
	/**
	 * 变更
	 */
	H("H", "变更"),
	/**
	 * 大单
	 */
	I("I", "大单"),
	/**
	 * 酒店已确认
	 */
	J("J", "酒店已确认"),
	/**
	 * 恶意
	 */
	M("M", "恶意"),
	/**
	 * 新单
	 */
	N("N", "新单"),
	/**
	 * 满房
	 */
	O("O", "满房"),
	/**
	 * 暂无价格
	 */
	P("P", "暂无价格"),
	/**
	 * 预付
	 */
	R("R", "预付"),
	/**
	 * 特殊
	 */
	S("S", "特殊"),
	/**
	 * 计划
	 */
	T("T", "计划"),
	/**
	 * 特满
	 */
	U("U", "特满"),
	/**
	 * 已审
	 */
	V("V", "已审"),
	/**
	 * 虚拟
	 */
	W("W", "虚拟"),
	/**
	 * 删除，另换酒店
	 */
	Z("Z", "删除，另换酒店");

	private ElongOrderStatusEnum(String status, String description) {
		this.status = status;
		this.description = description;
	}

	public static String getDescriptionByStatus(String status){
		for(ElongOrderStatusEnum item: ElongOrderStatusEnum.values()){
			if(item.getStatus().equals(status)){
				return item.getDescription();
			}
		}
		return "";
	}


    public static ElongOrderStatusEnum getEnumStatus(String status){
        for(ElongOrderStatusEnum item: ElongOrderStatusEnum.values()){
            if(item.getStatus().equals(status)){
                return item;
            }
        }
        return null;
    }
	
	public static boolean match(String src, ElongOrderStatusEnum status) {
		return false;
	}

	// 订单状态
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
