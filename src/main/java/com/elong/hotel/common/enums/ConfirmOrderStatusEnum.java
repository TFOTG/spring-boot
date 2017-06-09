package com.elong.hotel.common.enums;

/**
 * 确认订单状态枚举
 */
public enum ConfirmOrderStatusEnum {

    /**
     * 变价
     */
    G("G", "变价"),
    /**
     * 满房
     */
    O("O", "满房"),
    /**
     * 满房
     */
    O1("O1", "联系不到酒店"),
    /**
     * 满房
     */
    O2("O2", "酒店电话无效"),
    /**
     * 满房
     */
    O3("O3", "酒店不合作"),
    /**
     * 满房
     */
    O4("O4", "直连不接受线下"),
    /**
     * 特满
     */
    U("U", "特满"),
    /**
     * 特满
     */
    U1("U1", "需担保"),
    /**
     * 特满
     */
    U2("U2", "特殊满房"),
    /**
     * 特满
     */
    U3("U3", "需同意"),
    /**
     * 已审
     */
    V("V", "已审");


    ConfirmOrderStatusEnum(String status, String description) {
        this.status = status;
        this.description = description;
    }

    public static String getDescriptionByStatus(String status){
        for(ConfirmOrderStatusEnum item: ConfirmOrderStatusEnum.values()){
            if(item.getStatus().equals(status)){
                return item.getDescription();
            }
        }
        return "";
    }

    // 订单状态
    private String status;
    // 描述
    private String description;

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }


}
