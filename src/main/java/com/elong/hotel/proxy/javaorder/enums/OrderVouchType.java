package com.elong.hotel.proxy.javaorder.enums;

/**
 * 订单担保类型
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年7月24日 上午9:01:16   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public enum OrderVouchType {
	
	FIRSTNIGHT(1, "首晚担保"),

	ALL(2, "全额担保"),

	PART(3, "部分担保");

	private int value;

	private String desc;

	private OrderVouchType(int value, String desc) {
		this.value = value;
		this.desc = desc;
	}

	public int getValue() {
		return value;
	}

	public String getDesc() {
		return desc;
	}

	/**
	 * 根据value返回状态
	 * 
	 * @param value
	 * @return
	 */
	public static String getDescByValue(int value) {
		for (OrderVouchType item : OrderVouchType.values()) {
			if (item.getValue() == value) {
				return item.getDesc();
			}
		}
		return "";
	}
}
