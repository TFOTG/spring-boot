package com.elong.hotel.log.hotelconfirm.enums;

/**
 * Created by Hualong.Li on 17/4/28.
 */
public enum ConfirmOpType {

	/**
	 * 员工获取
	 */
	STAFF_GET(1, "员工获取"),

	/**
	 * 订单出库
	 */
	STORAGE_OUT(2, "订单出库"),

	/**
	 * 订单入库
	 */
	STORAGE_IN(3, "订单入库"),

	/**
	 * 主管分配
	 */
	MANAGER_DISTRIBUTE(6, "主管分配"),

	/**
	 * 主管回收
	 */
	MANAGER_RECOVER(7, "主管回收"),

	/**
	 * Ebooking拒单
	 */
	EBOOKING_REFUSE(9, "Ebooking拒单"),
	
	/**
	 * ebk重发
	 */
	CALLEBOOKING_REFUSE(10,"取消Ebooking拒单");

	private int key;

	private String value;

	ConfirmOpType(int key, String value) {
		this.key = key;
		this.value = value;
	}


    public static ConfirmOpType getEnumByKey(int key){
        for (ConfirmOpType confirmOpType : ConfirmOpType.values()) {

            if(confirmOpType.getKey()==key){
                return  confirmOpType;
            }
        }
        return null;
    }

	public int getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}
}
