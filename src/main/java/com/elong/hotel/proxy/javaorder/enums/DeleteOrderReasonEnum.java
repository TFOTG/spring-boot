package com.elong.hotel.proxy.javaorder.enums;

/**
 * 删除订单原因枚举
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年9月6日 上午8:33:06   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public enum DeleteOrderReasonEnum {
	
	DEFAULT(500, "默认原因"),

	DELETE_BY_STAFF(501, "取消库员工投放删除"),
	
	DELETE_BY_AUTO(502, "取消库自动投放删除");

	private int value;

	private String desc;

	private DeleteOrderReasonEnum(int value, String desc) {
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
		
		for (DeleteOrderReasonEnum item : DeleteOrderReasonEnum.values()) {
			if (item.getValue() == value) {
				return item.getDesc();
			}
		}
		
		return "";
	}
}
