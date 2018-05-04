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
	
	CONFIRMA(1,"confirmA"),
	
	CONFIRMO(2,"confirmO"),

	CONFIRMU(3,"confirmU"),

	CONFIRMG(4,"confirmG"),

	CONFIRMH(5,"confirmH"),

	CONFIRMV(6,"confirmV"),

    EXAMA(7,"examA"),

    EXAMO(8,"examO"),

    EXAMU(9,"examU"),

    EXAMG(10,"examG"),

    EXAMH(11,"examH"),

    EXAMV(12,"examV"),

    EXAMD(13,"examD"),

    EXAME(14,"examE"),

    /**
	 * 临时添加状态
	 */
	TEMP(100,"temp");

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