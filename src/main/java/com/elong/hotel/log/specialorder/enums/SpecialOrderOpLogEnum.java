package com.elong.hotel.log.specialorder.enums;

/**
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年8月28日 上午10:07:38   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public enum SpecialOrderOpLogEnum {

	/**
	 * 订单出库
	 */
	STORAGE_OUT(1, "订单出库"),

	/**
	 * 订单入库
	 */
	STORAGE_IN(2, "订单入库");

	private int key;

	private String value;
	
	SpecialOrderOpLogEnum(int key, String value){
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

    public static SpecialOrderOpLogEnum getEnumByKey(int key){
        for (SpecialOrderOpLogEnum specialOpType : SpecialOrderOpLogEnum.values()) {

            if(specialOpType.getKey() == key){
                return  specialOpType;
            }
        }
        return null;
    }
}
