package com.elong.hotel.hotelconfirm.confirmorder.enums;

/**
 * Created by yangboyu on 17/4/6.
 */
public enum FirstRefuseEnum {

    /**
     * None
     */
    None("none", "none"),
    /**
     * 房间满
     */
    O("o", "房间满"),

    /**
     * 联系不到酒店
     */
    O1("o1", "联系不到酒店"),

    /**
     * 酒店电话无效
     */
    O2("o2", "酒店电话无效"),

    /**
     * 酒店不合作
     */
    O3("o3", "酒店不合作"),

    /**
     * 直连不接受线下
     */
    O4("o4", "直连不接受线下"),

    /**
     * 需担保
     */
    U1("u1", "需担保"),

    /**
     * 特殊满房
     */
    U2("u2", "特殊满房"),

    /**
     * 需同意
     */
    U3("u3", "需同意"),

    /**
     * 变价
     */
    G("g", "变价"),

    /**
     * 12-20新增  全满 行为 初拒
     */
    O7("o7", "全满"),

    /**
     * 12-20新增  部分满 行为 初拒
     */
    O8("o8", "部分满");

    private String key;
    private String value;

    FirstRefuseEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public static FirstRefuseEnum getValue(String key) {
        FirstRefuseEnum result = FirstRefuseEnum.None;
        for (FirstRefuseEnum confirmOrderPriority : FirstRefuseEnum.values()) {
            if (confirmOrderPriority.getKey().equalsIgnoreCase(key)) {
                result = confirmOrderPriority;
                break;
            }
        }
        return result;
    }

    public String getValue() {
        return value;
    }

}
