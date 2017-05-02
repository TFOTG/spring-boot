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
public enum LogTypeEnum {
	
	VERIFYA(1,"verifyA"),
	
	VERIFYF(2,"verifyF"),

	VERIFYS(3,"verifyS"),

	VERIFYC(4,"verifyC"),

	VERIFYFB1(5,"verifyB1"),

	VERIFYB(6,"verifyB"),

	VERIFYD(7,"verifyD"),

	VERIFYE(8,"verifyE"),

	/**
	 * 临时添加状态
	 */
	TEMP(10,"temp");

	private  int  value;
	
	private  String  key;

	public int getValue() {
		return value;
	}

	public String getKey() {
		return key;
	}

	public static LogTypeEnum getValue(String key) {
		LogTypeEnum result = null;
		for (LogTypeEnum obj : LogTypeEnum.values()) {
			if (obj.getKey().equals(key)) {
				result = obj;
				break;
			}
		}
		return result;
	}
	
	LogTypeEnum(int value,String key){
		this.value=value;
		this.key=key;
	}

}