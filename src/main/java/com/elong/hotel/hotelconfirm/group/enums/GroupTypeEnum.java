package com.elong.hotel.hotelconfirm.group.enums;

/**
 * 分组类型
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年5月15日 上午10:43:31   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public enum GroupTypeEnum {
	
	/**
     * 默认
     */
    Default(0, "默认"),
    
    /**
     * 终拒自动通知分组
     */
    AmendAutomaticNotification(1, "终拒自动通知分组");

    private int key;
    
    private String value;

    GroupTypeEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }
    
    public String getValue() {
        return value;
    }

    public static String getValue(int key) {
        String result = "";
        for (GroupTypeEnum groupTypeEnum : GroupTypeEnum.values()) {
            if (groupTypeEnum.getKey() == key) {
                result = groupTypeEnum.getValue();
                break;
            }
        }
        return result;
    }
}
