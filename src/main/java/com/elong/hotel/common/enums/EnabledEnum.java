package com.elong.hotel.common.enums;

/**
 * 
 * 记录类型枚举
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2016年3月4日 下午2:58:28   peng.wang     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		peng.wang 
 * @version		1.0  
 * @since		JDK1.7
 */
public enum EnabledEnum {

	OFF(0,"confirmA"),

	ON(1,"confirmO"),;

	private  int  value;

	private  String  key;

	public int getValue() {
		return value;
	}

	public String getKey() {
		return key;
	}

	public static EnabledEnum getValue(String key) {
		EnabledEnum result = null;
		for (EnabledEnum obj : EnabledEnum.values()) {
			if (obj.getKey().equals(key)) {
				result = obj;
				break;
			}
		}
		return result;
	}

	EnabledEnum(int value, String key){
		this.value=value;
		this.key=key;
	}

}