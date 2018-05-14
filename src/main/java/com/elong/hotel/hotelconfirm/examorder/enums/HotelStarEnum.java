package com.elong.hotel.hotelconfirm.examorder.enums;

/**
 * 
 *	酒店星级枚举
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018年5月14日 上午9:04:54   张大鹏     1.0    	初始化创建<br>
 * </p> 
 *
 * @author		张大鹏 
 * @version		1.0  
 * @since		JDK1.7
 */
public enum HotelStarEnum {

	/**
     * 默认
     */
    Default(0, "默认"),

    /**
     * 1星
     */
    OneStar(1, "一星"),

    /**
     * 2星
     */
    TwoStar(2, "二星"),

    /**
     * 3星
     */
    ThreeStar(3, "三星"),
    
    /**
     * 4星
     */
    FourStar(4, "四星"),
    
    /**
     * 5星
     */
    FiveStar(5, "五星"),
    
    /**
     * 不限
     */
    ALL(6, "ALL");

    private int key;
    private String value;

    HotelStarEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public static HotelStarEnum getValue(int key) {
    	HotelStarEnum result = HotelStarEnum.Default;
       for (HotelStarEnum hotelStarEnum : HotelStarEnum.values()) {
            if (hotelStarEnum.getKey() == key) {
                result = hotelStarEnum;
                break;
            }
        }
        return result;
    }
}
