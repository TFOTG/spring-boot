package com.elong.hotel.hotelconfirm.examorder.enums;

/**
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年5月15日 下午3:27:42   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public enum GroupOrderStatusEnum {

	/**
     * 满房
     */
    O("O", "满房"),

    /**
     * 特满
     */
    U("U", "特满"),

    /**
     * 变价
     */
    G("G", "变价"),
    
    /**
     * 不限
     */
    ALL("ALL","全部");


    private String key;
    private String value;

    GroupOrderStatusEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
    
    public static GroupOrderStatusEnum getValue(String key) {
    	GroupOrderStatusEnum result = GroupOrderStatusEnum.ALL;
       for (GroupOrderStatusEnum groupOrderStatus : GroupOrderStatusEnum.values()) {
            if (groupOrderStatus.getKey().equalsIgnoreCase(key)) {
                result = groupOrderStatus;
                break;
            }
        }
        return result;
    }

    public static String getValueDesc(String key) {
    	String result = "";
       for (GroupOrderStatusEnum groupOrderStatus : GroupOrderStatusEnum.values()) {
            if (groupOrderStatus.getKey().equalsIgnoreCase(key)) {
                result = groupOrderStatus.value;
                break;
            }
        }
        return result;
    }
}
