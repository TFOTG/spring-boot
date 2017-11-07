package com.elong.hotel.common.enums;

/**
 * 
 * 记录类型枚举
 * 
 * <p>
 * 修改历史: <br>
 * 修改日期 修改人员 版本 修改内容<br>
 * -------------------------------------------------<br>
 * 2016年3月4日 下午2:58:28 peng.wang 1.0 初始化创建<br>
 * </p>
 * 
 * @author peng.wang
 * @version 1.0
 * @since JDK1.7
 */
public enum ModNoEnum {

	/**
	 * NoMod
	 */
	NoMod(0,"NoMod"),
	/**
	 * Mod0
	 */
	Mod0(0, "Mod0"),
	/**
	 * Mod1
	 */
	Mod1(1, "Mod1"),

	/**
	 * Mod2
	 */
	Mod2(2, "Mod2"),
	/**
	 * Mod3
	 */
	Mod3(3, "Mod3"),
	/**
	 * Mod4
	 */
	Mod4(4, "Mod4"),
	/**
	 * Mod5
	 */
	Mod5(5, "Mod5"),
	/**
	 * Mod6
	 */
	Mod6(6, "Mod6"),
	/**
	 * Mod7
	 */
	Mod7(7, "Mod7"),
	/**
	 * Mod8
	 */
	Mod8(8, "Mod8"),
	/**
	 * Mod9
	 */
	Mod9(9, "Mod9");

	private int value;

	private String key;

	public int getValue() {
		return value;
	}

	public String getKey() {
		return key;
	}

	public static ModNoEnum getValue(String key) {
		ModNoEnum result = null;
		for (ModNoEnum obj : ModNoEnum.values()) {
			if (obj.getKey().equals(key)) {
				result = obj;
				break;
			}
		}
		return result;
	}
	
	public static int getVerifyLogType(ModNoEnum modNoEnum, LogTypeEnum logTypeEnum) {
		
		return (logTypeEnum.getValue() * 10) + modNoEnum.getValue();
	}

	ModNoEnum(int value, String key) {
		this.value = value;
		this.key = key;
	}
}