package com.elong.hotel.hotelconfirm.examorder.enums;

/**
 * 会员等级Enum 
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年5月24日 上午9:14:00   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏
 * @version		1.0  
 * @since		JDK1.7
 */
public enum MemberLevelEnum {

	/**
     * 默认
     */
    Default("V0", "无等级"),

    /**
     * 预付
     */
    Oridinary("V1", "普卡"),

    /**
     * 担保
     */
    Silver("V2", "银卡"),

    /**
     * 全部
     */
    Gold("V3", "金卡"),
    
    /**
     * 白金卡
     */
    Platinum("V4", "白金卡"),
    
    /**
     * 龙萃
     */
    DragonExtract("V5", "龙萃");

    private String key;
    private String value;

    MemberLevelEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
    
    public static MemberLevelEnum getValue(String key) {
    	MemberLevelEnum result = MemberLevelEnum.Default;
       for (MemberLevelEnum member : MemberLevelEnum.values()) {
            if (member.getKey().equalsIgnoreCase(key)) {
                result = member;
                break;
            }
        }
        return result;
    }

    public static String getValueDesc(String key) {
    	String result = "";
       for (MemberLevelEnum member : MemberLevelEnum.values()) {
            if (member.getKey().equalsIgnoreCase(key)) {
                result = member.value;
                break;
            }
        }
        return result;
    }
}
