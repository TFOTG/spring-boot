package com.elong.hotel.hotelconfirm.examorder.enums;

/**
 *订单类型枚举
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年5月8日 上午10:07:35   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public enum OrderTypeEnum {

    /**
     * 普通
     */
    Oridinary(0, "普通"),

    /**
     * 预付
     */
    Prepay(1, "预付"),

    /**
     * 担保
     */
    Voucher(2, "担保"),

    /**
     * 全部
     */
    All(3, "ALL");

    private int key;
    private String value;

    OrderTypeEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
    
    public static OrderTypeEnum getValue(int key) {
    	OrderTypeEnum result = OrderTypeEnum.All;
       for (OrderTypeEnum examOrderType : OrderTypeEnum.values()) {
            if (examOrderType.getKey() == key) {
                result = examOrderType;
                break;
            }
        }
        return result;
    }

    public static String getValueDesc(int key) {
    	String result = "";
       for (OrderTypeEnum examOrderType : OrderTypeEnum.values()) {
            if (examOrderType.getKey() == key) {
                result = examOrderType.value;
                break;
            }
        }
        return result;
    }

}
